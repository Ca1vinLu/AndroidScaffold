package com.lvgodness.myandroid.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lvgodness.myandroid.R;


/**
 * Created by LYZ on 2017/6/22.
 */

public class MyToolbar extends RelativeLayout {
    private static final String TAG = "MyToolbar";
    private ImageView back;
    private TextView title;


    public MyToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyToolbar(Context context) {
        this(context, null);
    }

    public MyToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "onMeasure: ");
        int height = dp2px(48f);
        int width = getMeasuredWidth();
        setMeasuredDimension(width, height);
    }

    public void setTitle(String s) {
        title.setText(s);
    }

    public void removeBackBtn() {
        back.setVisibility(INVISIBLE);
        back.setOnClickListener(null);
    }


    private void initView(Context context, AttributeSet attrs) {
        Log.d(TAG, "initView: ");
        inflate(context, R.layout.toolbar, this);

        back = (ImageView) findViewById(R.id.back_btn);
        title = (TextView) findViewById(R.id.title);
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();
            }
        });


        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyToolbar);
        try {
            if (!TextUtils.isEmpty(typedArray.getString(R.styleable.MyToolbar_title)))
                title.setText(typedArray.getString(R.styleable.MyToolbar_title));
        } finally {
            typedArray.recycle();

        }

    }

    public int dp2px(final float dpValue) {
        final float scale = getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
