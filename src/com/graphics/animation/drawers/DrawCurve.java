package com.graphics.animation.drawers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Denis on 08.11.2014.
 */
public class DrawCurve extends DrawView {

    public DrawCurve(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(10);

        canvas.drawPoint(20, 20, paint);

    }
}
