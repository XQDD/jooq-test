### Run the TestJooq clss show this:
```log
org.springframework.jdbc.BadSqlGrammarException: jOOQ; bad SQL grammar [select `PUBLIC`.`BOOK`.`ID`, `PUBLIC`.`BOOK`.`NAME`, `PUBLIC`.`BOOK`.`PAGENUM`, `PUBLIC`.`BOOK`.`AUTHOR_ID` from `PUBLIC`.`BOOK`]; nested exception is com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Table 'PUBLIC.BOOK' doesn't exist
```

## Problems
#### 1. The schema's name is PUBLIC, but here is jooq_test for mysql, and can't config by \<inputSchema\>


#### 2. The mysql table's name is lower case but here is upper case and can't find a place to config it 
