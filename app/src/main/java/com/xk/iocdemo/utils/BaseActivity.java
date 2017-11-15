package com.xk.iocdemo.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import com.xk.iocdemo.R;
import com.xk.iocdemo.utils.annotations.ContentView;
import com.xk.iocdemo.utils.annotations.ViewInject;

/**
 * Created by xuekai on 2017/11/14.
 */
@ContentView(R.layout.activity_main1)
public class BaseActivity extends AppCompatActivity {
    @ViewInject(R.id.b2)
    private Button bb;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectUtil.inject(this);
        Log.i("BaseActivity","onCreate-->"+bb);
    }
}