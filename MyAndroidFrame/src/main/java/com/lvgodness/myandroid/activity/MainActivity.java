package com.lvgodness.myandroid.activity;

import android.support.v7.widget.Toolbar;

import com.lvgodness.myandroid.R;
import com.lvgodness.myandroid.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }
}
