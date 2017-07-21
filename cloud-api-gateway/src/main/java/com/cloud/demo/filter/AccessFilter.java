package com.cloud.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LeiZhaosh on 2017/7/18.
 */
public class AccessFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
    @Override
    public String filterType() {
        return "pre";//请求被路由之前调用
    }
    @Override
    public int filterOrder() {
        return 0;
    }
    //用来判断当前filter是否启用
    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);//token为空 不进行路由
            ctx.setResponseStatusCode(401);//返回错误码
            ctx.setResponseBody("access token is empty");
            return null;
        }
        log.info("access token ok");
        return null;
    }
}
