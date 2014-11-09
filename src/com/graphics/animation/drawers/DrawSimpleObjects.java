package com.graphics.animation.drawers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by Denis on 08.11.2014.
 */
public class DrawSimpleObjects extends DrawView {

    public DrawSimpleObjects(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLUE);
        canvas.drawText("DrawSimpleObjects", 30, 30, paint);
    }
}
