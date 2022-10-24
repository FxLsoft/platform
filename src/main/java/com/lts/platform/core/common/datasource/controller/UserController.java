package com.lts.platform.core.common.datasource.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.lts.platform.core.common.datasource.entiy.Result;
import com.lts.platform.core.common.datasource.entiy.Where;
import com.lts.platform.core.common.datasource.service.BaseService;

// @RestController
// @RequestMapping("/user")
public class UserController {
	// @Autowired
	private BaseService baseService;

	@PostMapping("/selectByWhere")
	public Result selectByWhere(@RequestBody Where where) {
		return Result.OK(baseService.selectByWhere(where));
	}

}
