package com.lvgodness.myandroid.activity;

import android.view.View;
import android.widget.Button;

import com.lvgodness.myandroid.R;
import com.lvgodness.myandroid.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements View.OnClickListener {


//    @BindView(R.id.toolbar)
//    Toolbar toolbar;
    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;
    @BindView(R.id.button4)
    Button button4;
    @BindView(R.id.button5)
    Button button5;
    @BindView(R.id.button6)
    Button button6;
    @BindView(R.id.button7)
    Button button7;
    @BindView(R.id.button8)
    Button button8;
    @BindView(R.id.button9)
    Button button9;
    @BindView(R.id.button10)
    Button button10;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(BasicActivity.class);
                break;
            case R.id.button2:
                startActivity(BottomNavigationActivity.class);
                break;
            case R.id.button3:
                startActivity(EmptyActivity.class);
                break;
            case R.id.button4:
                startActivity(FullscreenActivity.class);
                break;
            case R.id.button5:
                startActivity(LoginActivity.class);
                break;
            case R.id.button6:
                startActivity(MasterDetailActivity.class);
                break;
            case R.id.button7:
                startActivity(NavigationDrawerActivity.class);
                break;
            case R.id.button8:
                startActivity(ScrollingActivity.class);
                break;
            case R.id.button9:
                startActivity(SettingsActivity.class);
                break;
            case R.id.button10:
                startActivity(TabbedActivity.class);
                break;

        }
    }
}
