package com.demo.screen;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ScreenMainActivity extends AppCompatActivity {

    private RelativeLayout mRall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //设置全屏
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //虚拟键设置
//        if (NavigationBarUtil.hasNavigationBar(this)) {
//            NavigationBarUtil.initActivity(findViewById(android.R.id.content));
//        }
        setContentView(R.layout.activity_main);
        mRall = findViewById(R.id.rl_all);
        TextView tvClick = (TextView) findViewById(R.id.tv_click);
        tvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenMainActivity.this, ScreenAdaptationActivity.class));
            }
        });
//        NotchPhoneUtils.getBrand(this, mRall);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
//        NotchPhoneUtils.getBrand(this, mRall);
        super.onConfigurationChanged(newConfig);
    }
}
