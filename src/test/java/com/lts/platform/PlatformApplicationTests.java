package com.lts.platform;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.lts.platform.entity.Cell;
import com.lts.platform.entity.Va;
import com.lts.platform.mapper.CellMapper;
import com.lts.platform.mapper.VaMapper;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class PlatformApplicationTests {

	@Autowired
	private CellMapper cellMapper;

	@Autowired
	private VaMapper valMapper;

	@Test
	void testCell() {
		log.info("--- 测试Cell ---");
		List<Cell> cells = this.cellMapper.selectList(null);
		List<Va> vas = valMapper.selectList(null);
		cells.forEach(System.out::println);
		vas.forEach(System.out::println);
		
	}

}
