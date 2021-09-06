package com.xerxes.learn.neo4j.BossRepository;

import com.xerxes.learn.neo4j.model.BossEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @author xerxes
 */
public interface BossRepository extends Neo4jRepository<BossEntity, Long> {
}
