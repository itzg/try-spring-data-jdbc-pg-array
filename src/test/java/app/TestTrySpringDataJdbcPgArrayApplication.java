package app;

import org.springframework.boot.SpringApplication;

public class TestTrySpringDataJdbcPgArrayApplication {

    static void main(String[] args) {
        SpringApplication.from(TrySpringDataJdbcPgArrayApplication::main).with(TestcontainersConfiguration.class).run(
            args);
    }

}
