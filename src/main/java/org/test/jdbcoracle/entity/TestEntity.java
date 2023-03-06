package org.test.jdbcoracle.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TEST_ENTITY")
public class TestEntity {

    @Id
    @Column(name = "IDTEST")
    private Integer idtBody;

}
