
## Overview

- PostgreSQL [array](https://www.postgresql.org/docs/current/arrays.html) type columns with [GIN indexing](https://www.postgresql.org/docs/current/gin.html)
- Liquibase
  - [createTable](https://docs.liquibase.com/community/reference-guide-5-0/change-types/createtable) with `TEXT[]` as [column](https://docs.liquibase.com/community/reference-guide-5-0/change-types/column) type
  - [createIndex](https://docs.liquibase.com/community/reference-guide-5-0/change-types/createindex.html) where `using` can specify the index type for PostgreSQL
- [Spring Data JDBC](https://docs.spring.io/spring-data/relational/reference/jdbc.html)
- [Lombok `@Builder`](https://projectlombok.org/features/Builder) on a Java record excluding the auto-generated `id` field

## Try it out

Execute the unit tests, specifically `[TrySpringDataJdbcPgArrayApplicationTests.java](src/test/java/app/TrySpringDataJdbcPgArrayApplicationTests.java)`

```shell
./gradlew test
```