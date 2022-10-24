package com.lts.platform.core.common.datasource.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Property {

	/**
	 * Table对应的字段
	 * @return
	 */
	String field() default "";

	/**
	 * 入参
	 * @return
	 */
	String name() default "";
	
	/**
	 * 字段描述
	 * @return
	 */
	String desc() default "";

	/**
	 * 关联目标
	 * @return
	 */
	String target() default "";
}
