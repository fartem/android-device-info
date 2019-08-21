package com.smlnskgmail.jaman.deviceinfo.info.gpu.components

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

abstract class AppGLSurfaceViewRenderer : GLSurfaceView.Renderer {

    override fun onDrawFrame(gL10: GL10?) {}

    override fun onSurfaceChanged(gL10: GL10?, p1: Int, p2: Int) {}

    override fun onSurfaceCreated(gL10: GL10?, p1: EGLConfig?) {}

}