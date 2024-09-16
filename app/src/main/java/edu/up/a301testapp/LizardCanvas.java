package edu.up.a301testapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class LizardCanvas extends SurfaceView {

    //For our favorite color
    private Paint redPaint;
    private Paint darkGreenPaint;

    public LizardCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);

        //setup our favorite color
        redPaint = new Paint();
        redPaint.setColor(0xFFFF0000);  //a bright red
        redPaint.setStyle(Paint.Style.FILL); //fill it instead of outline (STROKE)

        darkGreenPaint = new Paint();
        darkGreenPaint.setColor(0xFF117792);
        darkGreenPaint.setStyle(Paint.Style.FILL);

        setBackgroundColor(0xFFFFFFFF);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(100, 100, 120, 120, redPaint);
        canvas.drawCircle(100, 100, 120, darkGreenPaint);

        //paint jack-o-lantern on canvas
        Bitmap oil = BitmapFactory.decodeResource(getResources(), R.drawable.oil);
        canvas.drawBitmap(oil, 200,300,darkGreenPaint);
    }

}
