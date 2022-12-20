package com.miao.ssmp.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaotongli
 * @create 2022-10-29-下午 09:08
 * @describe
 */
@Configuration
public class MpConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //1.定义拦截器
        MybatisPlusInterceptor m = new MybatisPlusInterceptor();
        //2.添加具体的拦截器
        m.addInnerInterceptor(new PaginationInnerInterceptor());
        return m;

    }
}
