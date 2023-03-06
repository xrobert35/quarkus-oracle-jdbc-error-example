package org.test.jdbcoracle;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class TestJDBC {
    public static void main(String... args) {
        Quarkus.run(args);
    }
}
