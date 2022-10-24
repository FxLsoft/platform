package com.lts.platform.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("T_Cell")
public class Cell {
    private Long id;
    private String dnaCode;
    private String dnaName;
    private String bizType;
    private Long parentId;
    private Long rootId;
}
