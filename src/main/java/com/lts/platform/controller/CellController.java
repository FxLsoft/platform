package com.lts.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lts.platform.entity.Cell;
import com.lts.platform.entity.Va;
import com.lts.platform.mapper.CellMapper;
import com.lts.platform.mapper.VaMapper;

@RestController
@RequestMapping("/cell")
public class CellController {
    
	@Autowired
	private CellMapper cellMapper;

	@Autowired
	private VaMapper valMapper;

    @RequestMapping("/get")
    public List<Cell> getCell() {
        return cellMapper.selectList(null);
    }

    @RequestMapping("/getValue")
    public List<Va> getValue() {
        return valMapper.selectList(null);
    }
}
