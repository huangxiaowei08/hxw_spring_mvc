package cn.com.hxw.study.my.annotation;

import java.lang.annotation.*;
/**
 * 自定义注解拦截service层的操作
 * @author huangxiaowei
 * @date 2020/5/29 15:14
 * @description
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemServiceLog {
    String description() default "";
}
