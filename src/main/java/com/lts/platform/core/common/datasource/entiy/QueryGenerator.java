package com.lts.platform.core.common.datasource.entiy;

import java.lang.reflect.Field;
import java.util.ArrayList;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public class QueryGenerator {
	
	public static <T> QueryWrapper<T> createQueryWrapper(Where where, T clazz) {
		QueryWrapper<T> query = new QueryWrapper<T>();
		// 获取本身的配置
		Field[] fields = clazz.getClass().getDeclaredFields();
		
		ArrayList<Condition> conditions = where.getConditions();
		ArrayList<Condition> filters = where.getFilters();
		ArrayList<Condition> queryList = new ArrayList<>();
		queryList.addAll(conditions);
		queryList.addAll(filters);
		queryList.forEach(condition -> {
			OperatorEnum operator = condition.getOperator();
			switch(operator) {
				case EQ: {
					query.eq(condition.getKey(), condition.getValue());
					break;
				}
			}
		});
		// 返回字段处理
		conditions.forEach(condition -> {
			
		});
		// 分页
		if (where.getPage()) {

		}
		// 不分页
		else {

		}
		return query;
	}
}
