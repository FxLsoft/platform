package com.lts.platform.core.common.datasource;

import java.lang.reflect.Field;

import com.lts.platform.core.common.datasource.annotations.Property;
import com.lts.platform.core.common.datasource.annotations.Validate;
import com.lts.platform.core.common.datasource.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
	public static void main(String[] args) {
		Class<?> clazz = User.class;
		Field[] fields = clazz.getDeclaredFields();
		log.info(clazz.getName());
		for (Field field: fields) {
			Property property = field.getAnnotation(Property.class);
			Validate validate = field.getAnnotation(Validate.class);
			log.info(field.getName()); // JAVA 字段
			log.info(field.getType().toString()); // JAVA 类型
			if (property != null) {
				log.info(property.field());
				log.info(property.name());
				log.info(property.desc());
				log.info(property.target());
			}

			if (validate != null) {
				
			}
		}
	}
}
