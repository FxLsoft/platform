package com.lts.platform.core.common.datasource.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Translate {
	/**
	 * 翻译类型 字典 / 国际化
	 * @return
	 */
	String type();
	/**
	 * 翻译对应的Key
	 * @return
	 */
	String key();
}
