package com.lts.platform.core.common.datasource.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
	/**
	 * 验证类型
	 * @return
	 */
	String type();

	/**
	 * 字段校验
	 * [1, 2, 3]
	 * /\d{0, 100}/ /\w+/
	 * 联合校验 Todo 基本不需要 应用程序只要保证数据库的完整性就可以
	 * @return
	 */
	String pattern();

	/**
	 * 校验失败的错误提示
	 * @return
	 */
	String message() default "";
}
