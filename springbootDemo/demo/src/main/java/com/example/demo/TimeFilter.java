package com.example.demo;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zsq on 2018/3/21.
 */
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {

        long start = System.currentTimeMillis();

        filterChain.doFilter(request, response);

        //response.setCharacterEncoding("utf-8");

        System.out.println("filter 耗时：" + (System.currentTimeMillis() - start));

    }

    @Override
    public void destroy() {
        System.out.println("=======销毁过滤器=========");
    }

}
