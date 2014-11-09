package com.graphics.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.base.core.R;
import com.graphics.animation.drawers.DrawCurve;
import com.graphics.animation.drawers.DrawSimpleObjects;
import com.graphics.animation.drawers.DrawView;

/**
 * Created by Denis on 06.11.2014.
 */
public class DrawActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int pressedButton = intent.getIntExtra("button", -1);
        setContentView(background(pressedButton));
    }

    private DrawView background(int pressedBtn) {
        if (pressedBtn == R.id.curve_btn) {
            return new DrawCurve(this);
        } else if (pressedBtn == R.id.simple_draw_btn) {
            return new DrawSimpleObjects(this);
        }
        return null;
    }
}
