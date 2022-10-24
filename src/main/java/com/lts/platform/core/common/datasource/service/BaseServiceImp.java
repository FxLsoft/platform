package com.lts.platform.core.common.datasource.service;

import java.util.List;

import com.lts.platform.core.common.datasource.entiy.Condition;
import com.lts.platform.core.common.datasource.entiy.OperatorEnum;
import com.lts.platform.core.common.datasource.entiy.Where;

public class BaseServiceImp implements BaseService{

	@Override
	public int countByWhere(Where where) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object> selectByWhere(Where where) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByWhere(Where where) {
		List<Condition> conditions = where.getConditions();
		conditions.forEach(condition -> {
			condition.setOperator(OperatorEnum.EQ);
			if (OperatorEnum.EQ.equals(condition.getOperator())) {

			}
			// Condition<String[]> con = condition;
			// String[] value = con.getValue();
			// Condition<String> con = condition;
			// String value = con.getValue();
			
		});
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Object record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Object record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByWhereSelective(Object record, Where where) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
