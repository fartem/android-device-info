package com.smlnskgmail.jaman.deviceinfo.info.gpu

import android.opengl.GLSurfaceView
import androidx.appcompat.app.AppCompatActivity
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUModelPreferenceKey
import com.smlnskgmail.jaman.deviceinfo.info.gpu.preferences.GPUVendorPreferenceKey
import com.smlnskgmail.jaman.deviceinfo.preferences.StringPreference
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class DeviceGPUActivity : AppCompatActivity() {

    private val glRenderer: GLSurfaceView.Renderer = object : GLSurfaceView.Renderer {
        override fun onSurfaceChanged(gl: GL10, width: Int, height: Int) {}
        override fun onDrawFrame(gl: GL10) {}

        override fun onSurfaceCreated(gl: GL10?, p1: EGLConfig?) {
            val vendor = gl!!.glGetString(GL10.GL_VENDOR)
            val model = gl.glGetString(GL10.GL_RENDERER)

            StringPreference(this@DeviceGPUActivity, GPUVendorPreferenceKey()).save(vendor)
            StringPreference(this@DeviceGPUActivity, GPUModelPreferenceKey()).save(model)
        }
    }

}