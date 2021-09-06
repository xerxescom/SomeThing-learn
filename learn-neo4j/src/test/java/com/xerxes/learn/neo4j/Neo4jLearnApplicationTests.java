package com.xerxes.learn.neo4j;

import com.xerxes.learn.neo4j.BossRepository.BossRepository;
import com.xerxes.learn.neo4j.model.BossEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class Neo4jLearnApplicationTests {
	@Autowired
	private BossRepository bossRepository;
	@Test
	void neo4jText(){
		BossEntity bossEntity = new BossEntity("tom", "chengdu");
		BossEntity save = bossRepository.save(bossEntity);
		System.out.println(save);
		List<BossEntity> bossEntities = new ArrayList<>(bossRepository.findAll());
		System.out.println(bossEntities);
	}
}
