package com.demo.screen;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class ScreenAdaptationActivity extends Activity {

    private RelativeLayout rlLay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= 28) {
            DisplayUtil util = new DisplayUtil(this);
            util.openFullScreenModel();
        }

//        虚拟键设置
//        if (NavigationBarUtil.hasNavigationBar(this)) {
//            NavigationBarUtil.initActivity(findViewById(android.R.id.content));
//        }
        setContentView(R.layout.activity_test);
        rlLay = (RelativeLayout) findViewById(R.id.rl_lay);
//        NotchPhoneUtils.getBrand(this, rlLay);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
//        NotchPhoneUtils.getBrand(this, rlLay);
        super.onConfigurationChanged(newConfig);
    }
}
