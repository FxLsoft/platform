package com.lts.platform.core.common.datasource.service;

import java.util.List;

import com.lts.platform.core.common.datasource.entiy.Where;

public interface BaseService {

	int countByWhere(Where where);

	List<Object> selectByWhere(Where where);

	Object selectByPrimaryKey(Long id);

	int deleteByWhere(Where where);

    int deleteByPrimaryKey(Long id);

	int insert(Object record);

    int insertSelective(Object record);

	int updateByWhereSelective(Object record, Where where);
}
