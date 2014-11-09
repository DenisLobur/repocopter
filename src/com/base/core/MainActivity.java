package com.base.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.graphics.animation.DrawActivity;
import com.graphics.animation.SwitchImageActivity;

/**
 * Created by Denis on 06.11.2014.
 */
public class MainActivity extends Activity implements View.OnClickListener{

    private Button animationBtn;
    private Button drawButton;
    private Button curveLineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_layout);

        animationBtn = (Button)findViewById(R.id.start_animation_btn);
        drawButton = (Button)findViewById(R.id.simple_draw_btn);
        curveLineButton = (Button)findViewById(R.id.curve_btn);

        animationBtn.setOnClickListener(this);
        drawButton.setOnClickListener(this);
        curveLineButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent startActivityIntent = new Intent();

        int currentId;
        switch (v.getId()){
            case R.id.start_animation_btn:
                startActivityIntent.setClass(MainActivity.this, SwitchImageActivity.class);
                break;
            case R.id.simple_draw_btn:
                currentId = v.getId();
                startActivityIntent.putExtra("button", currentId);
                startActivityIntent.setClass(MainActivity.this, DrawActivity.class);
                break;
            case R.id.curve_btn:
                currentId = v.getId();
                startActivityIntent.putExtra("button", currentId);
                startActivityIntent.setClass(MainActivity.this, DrawActivity.class);
                break;
            default:

                break;
        }
        startActivity(startActivityIntent);
    }
}
