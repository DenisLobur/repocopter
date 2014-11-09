package com.graphics.animation;

import android.app.Activity;
import android.os.Bundle;
import com.graphics.animation.drawers.DrawCurve;

/**
 * Created by Denis on 08.11.2014.
 */
public class CurveLineActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new DrawCurve(this));

    }
}
