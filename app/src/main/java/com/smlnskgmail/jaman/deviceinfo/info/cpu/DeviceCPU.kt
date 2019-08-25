package com.smlnskgmail.jaman.deviceinfo.info.cpu

import java.io.File
import java.io.FileFilter
import java.util.regex.Pattern


class DeviceCPU : CPU {

    override fun cores() = Runtime.getRuntime().availableProcessors()

    override fun minimumFreq(): Int {
        val cpus = cpus()
        var minimumFreq = 0

        if (cpus != null) {
            for (cpu in cpus) {
                val minCpuFreq = cat("${cpu.absolutePath}/cpufreq/cpuinfo_min_freq")
                val minCpuFreqValue = minCpuFreq.toInt()

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
                val maxCpuFreqValue = maxCpuFreq.toInt()

                if (maxCpuFreqValue < maximumFreq || maximumFreq == 0) {
                    maximumFreq = maxCpuFreqValue
                }
            }
        }
        return maximumFreq
    }

    private fun cat(path: String): String {
        val command = arrayOf("cat", path)
        val process = ProcessBuilder(*command).start()

        var result = ""

        process.inputStream.bufferedReader().use {
            result = it.readText()
        }

        return result
    }

    private fun cpus(): Array<File>? {
        class CpuFilter : FileFilter {
            override fun accept(pathname: File): Boolean {
                return Pattern.matches("cpu[0-9]+", pathname.name)
            }
        }

        val dir = File("/sys/devices/system/cpu/")
        return dir.listFiles(CpuFilter())
    }

}