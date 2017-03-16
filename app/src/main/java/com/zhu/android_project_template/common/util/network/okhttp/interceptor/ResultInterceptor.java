package com.zhu.android_project_template.common.util.network.okhttp.interceptor;


import com.zhu.android_project_template.common.util.network.okhttp.HttpInfo;

/**
 * 请求结果拦截器
 * @author zhousf
 */
@SuppressWarnings({"unused"})
public interface ResultInterceptor {

    HttpInfo intercept(HttpInfo info) throws Exception;

}
