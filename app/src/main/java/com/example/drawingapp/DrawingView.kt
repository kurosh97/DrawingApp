package com.example.drawingapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi
import java.nio.file.Path


@RequiresApi(Build.VERSION_CODES.O)
class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var mDrawPath: CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawingPaint: Paint? = null
    private var mCanvasPaint: Paint? = null

    private var mBrushSize: Float = 0.toFloat()
    private var color = Color.BLACK

    private var mCanvas: Canvas? = null

    init {
        setUpDrawing()
    }



    private fun setUpDrawing() {
        mDrawingPaint = Paint()
        mDrawPath = CustomPath(color, mBrushSize)
        mDrawingPaint!!.color = color
        mDrawingPaint!!.style = Paint.Style.STROKE
        mDrawingPaint!!.strokeJoin = Paint.Join.ROUND
        mDrawingPaint!!.strokeCap = Paint.Cap.ROUND
        mCanvasPaint = Paint(Paint.DITHER_FLAG)
        mBrushSize = 20.toFloat()


    }



    internal inner class CustomPath(var color: Int, var brushThickness: Float) : Path {


    }

}