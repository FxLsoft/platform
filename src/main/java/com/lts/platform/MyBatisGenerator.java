package com.lts.platform;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MyBatisGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create(
                "jdbc:mysql://localhost:3306/platform?serverTimezone=GMT%2B8&characterEncoding=utf8&useSSL=true",
                "root", "fengliang123")
                .globalConfig(builder -> {
                    builder.author("fxlsoft") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("./"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.lts.platform.generator") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./mapper/xml")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("T_Cell"); // 设置需要生成的表名
                            // .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
