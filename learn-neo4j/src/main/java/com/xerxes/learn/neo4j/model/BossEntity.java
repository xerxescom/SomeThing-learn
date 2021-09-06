package com.xerxes.learn.neo4j.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * @author xerxes
 */
@Node("Boss")
public class BossEntity {

    @Id @GeneratedValue
    private Long id;

    private final String name;

    @Property("address")
    private final String companyAddress;

    public BossEntity(String name, String companyAddress) {
        this.id = null;
        this.name = name;
        this.companyAddress = companyAddress;
    }

    public BossEntity withId(Long id) {
        if (this.id.equals(id)) {
            return this;
        } else {
            BossEntity bossEntity = new BossEntity(this.name, this.companyAddress);
            bossEntity.id=id;
            return bossEntity;
        }
    }
}
