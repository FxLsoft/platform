package com.lts.platform.core.common.datasource.entiy;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;

@Data
public class Condition implements Serializable {

	private String key;

	private OperatorEnum operator;
	/**
	 * 值
	 * string | number | (string | number)[] | Condition ?
	 */
	private Class<?> value;

	private OrderByEnum order;

	private ArrayList<Condition> conditions;
}