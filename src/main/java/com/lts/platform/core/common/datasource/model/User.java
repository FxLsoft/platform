package com.lts.platform.core.common.datasource.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lts.platform.core.common.datasource.annotations.Property;
import com.lts.platform.core.common.datasource.annotations.Translate;
import com.lts.platform.core.common.datasource.annotations.Validate;

import lombok.Data;

@Data
@TableName("pst_user")
public class User {

	private Long id;
	
	@Property(field = "employee_no", name = "employeeNo", desc="工号")
	@Validate(type = "regex", pattern = "/\\d{1, 7}/")
	private String employeeNo;

	@Property(field = "user_id", desc="用户ID")
	@Validate(type = "regex", pattern = "/\\d{1, 11}/", message = "格式错误")
	@Translate(type = "dic", key = "dic.key1")
	private String userId;

	private String name;
}
