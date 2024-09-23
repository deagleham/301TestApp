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
    private Bitmap jolBmp; //a jack-o-lantern image

    public LizardCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Tell the app that this view (i.e., LizardCanvas object)
        //actually DOES draw something so please call the onDraw()
        //method at the right time.
        setWillNotDraw(false);

        //setup our favorite color
        redPaint = new Paint();
        redPaint.setColor(0xFFFF0000);  //a bright red
        redPaint.setStyle(Paint.Style.FILL); //fill it instead of outline (STROKE)        //setup our favorite color

        darkGreenPaint = new Paint();
        darkGreenPaint.setColor(0xFF119722);  //a bright red
        darkGreenPaint.setStyle(Paint.Style.STROKE);

        //Load an image from the app's resource database
        jolBmp = BitmapFactory.decodeResource(getResources(), R.drawable.jack_o_lantern71);
        //resize it smaller
        jolBmp = Bitmap.createScaledBitmap(jolBmp, 200, 150, false);


        setBackgroundColor(0xFFFFFFFF);  //white background
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(50, 100, 200, 120, redPaint);
        canvas.drawCircle(250, 100, 50, darkGreenPaint);

        canvas.drawText("Hello CS301", 400, 100, redPaint);

        //paint a jack-o-lantern on the canvas
        canvas.drawBitmap(jolBmp, 200, 300, darkGreenPaint);

    }
}
