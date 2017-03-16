package com.zhu.android_project_template.common.base.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @ClassName: BaseActivity
 * @description:  Activity基类
 * @author:  Mr.Lee
 */
@SuppressWarnings({"unused"})
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * @MethodName: initLayout
     * @description: 抽象方法，初始化布局容器
     * @author:  Mr.Lee
     */
    protected abstract int initLayout();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
