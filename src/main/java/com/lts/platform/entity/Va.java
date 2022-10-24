package com.lts.platform.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("T_Va")
public class Va {
    private Long id;
    private String code;
    private String name;
    private Long cellId;
    private Integer dataType;
    private Integer intValue;
    private Double doubleValue;
    private String stringValue;

}
