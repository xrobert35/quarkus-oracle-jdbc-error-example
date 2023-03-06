package org.test.jdbcoracle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TEST_ENTITY")
public class TestEntity {

    @Id
    @Column(name = "IDTEST")
    private Integer idtBody;

}
