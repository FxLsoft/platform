package com.lts.platform.core.common.datasource.entiy;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;

@Data
public class Where implements Serializable {
	private Long id;
	private Boolean distinct;
	private Boolean page;
	private ArrayList<Condition> conditions;
	private ArrayList<Condition> filters;
	private Integer limit;
	private Integer offset;

	public Boolean validate() {
		// 验证 Model
		return Boolean.TRUE;
	}

	public Where() {
		this.conditions = new ArrayList<>();
		this.filters = new ArrayList<>();
	}

	public Where addCondition(String key) {
		Condition condition = new Condition();
		condition.setKey(key);
		this.conditions.add(condition);
		return this;
	}

	public Where addCondition(String key, OperatorEnum operator, Class<?> value) {
		Condition condition = new Condition();
		condition.setKey(key);
		condition.setOperator(operator);
		condition.setValue(value);
		this.conditions.add(condition);
		return this;
	}
}
