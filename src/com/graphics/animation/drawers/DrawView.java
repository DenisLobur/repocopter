package com.graphics.animation.drawers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Denis on 06.11.2014.
 */
public abstract class DrawView extends View {

    protected Paint paint;
    protected Rect rect;

    public DrawView(Context context) {
        super(context);
        paint = new Paint();
        rect = new Rect();
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.GREEN);

    }
}
