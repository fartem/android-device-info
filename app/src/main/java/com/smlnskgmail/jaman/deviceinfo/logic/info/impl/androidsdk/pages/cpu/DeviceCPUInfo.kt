package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.cpu

import com.smlnskgmail.jaman.deviceinfo.logic.info.api.CPUInfo
import com.smlnskgmail.jaman.deviceinfo.support.handlers.NullHandle
import java.io.File
import java.io.FileFilter
import java.util.regex.Pattern

class DeviceCPUInfo : CPUInfo {

    override fun cores() = Runtime.getRuntime().availableProcessors()

    override fun minimumFreq(): Int {
        val cpus = cpus()
        var minimumFreq = 0

        if (cpus != null) {
            for (cpu in cpus) {
                val minCpuFreq = cat("${cpu.absolutePath}/cpufreq/cpuinfo_min_freq")
                val minCpuFreqValue = adoptedString(minCpuFreq).toInt()
                println("---> $minCpuFreqValue")

                if (minCpuFreqValue < minimumFreq || minimumFreq == 0) {
                    minimumFreq = minCpuFreqValue
                }
            }
        }
        return minimumFreq
    }

    override fun maximumFreq(): Int {
        val cpus = cpus()
        var maximumFreq = 0

        if (cpus != null) {
            for (cpu in cpus) {
                val maxCpuFreq = cat("${cpu.absolutePath}/cpufreq/cpuinfo_max_freq")
                val maxCpuFreqValue = adoptedString(maxCpuFreq).toInt()

                if (maxCpuFreqValue < maximumFreq || maximumFreq == 0) {
                    maximumFreq = maxCpuFreqValue
                }
            }
        }
        return maximumFreq
    }

    private fun adoptedString(string: String?): String {
        return when {
            string.isNullOrEmpty() -> "0"
            string.endsWith("\n") -> string.substring(0, string.length - 1)
            else -> string
        }
    }

    @SuppressWarnings("SpreadOperator")
    private fun cat(path: String): String {
        val command = arrayOf("cat", path)
        val process = ProcessBuilder(*command).start()

        var result: String? = null

        process.inputStream.bufferedReader().use {
            result = it.readText()
        }

        return NullHandle(result, "").result()
    }

    private fun cpus(): Array<File>? {
        class CpuFilter : FileFilter {
            override fun accept(pathname: File): Boolean {
                return Pattern.matches("cpu[0-9]+", pathname.name)
            }
        }

        val cpuFolder = File("/sys/devices/system/cpu/")
        return cpuFolder.listFiles(CpuFilter())
    }

}
