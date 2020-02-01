package com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.renderer

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.preferences.GPUModelPreferenceValue
import com.smlnskgmail.jaman.deviceinfo.logic.info.impl.androidsdk.pages.gpu.preferences.GPUVendorPreferenceValue
import com.smlnskgmail.jaman.deviceinfo.logic.preferences.impl.shared.StringPreference
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class DeviceGPUActivity : AppCompatActivity() {

    private val glRenderer: GLSurfaceView.Renderer = object : AppGLSurfaceViewRenderer() {
        override fun onSurfaceCreated(gL10: GL10?, p1: EGLConfig?) {
            saveVendor(gL10!!.glGetString(GL10.GL_VENDOR))
            saveModel(gL10.glGetString(GL10.GL_RENDERER))
            completeSave()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addRendererView()
    }

    private fun addRendererView() {
        val glSurfaceView = GLSurfaceView(this)
        glSurfaceView.setRenderer(glRenderer)

        val root = findViewById<ViewGroup>(android.R.id.content)
        root.addView(glSurfaceView)
    }

    private fun saveVendor(vendor: String) {
        StringPreference(
            this@DeviceGPUActivity,
            GPUVendorPreferenceValue()
        ).save(vendor)
    }

    private fun saveModel(model: String) {
        StringPreference(
            this@DeviceGPUActivity,
            GPUModelPreferenceValue()
        ).save(model)
    }

    private fun completeSave() {
        setResult(GPURequestCode().requestCode())
        finish()
    }

}
