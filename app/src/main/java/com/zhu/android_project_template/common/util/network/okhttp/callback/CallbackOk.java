package com.zhu.android_project_template.common.util.network.okhttp.callback;


import com.zhu.android_project_template.common.util.network.okhttp.HttpInfo;

import java.io.IOException;

/**
 * @ClassName: CallbackOk
 * @description: 异步请求回调接口
 * @author Mr.Lee
 */
public interface CallbackOk {
    /**
     * @FunctionName: onResponse
     * @description:  请求结果响应 该回调方法已切换到UI线程
     * @author:  Mr.Lee
     */
    void onResponse(HttpInfo info) throws IOException;
}
