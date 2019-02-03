package pl.sdacademy.db.jdbc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcUserExampleTest {
  @Test
  void test() throws Exception {
    try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:");
         Statement statement = connection.createStatement()) {
      statement.execute("create table user_test_table(id int auto_increment, name varchar(30), surname varchar(50) )");
      statement.execute("insert into user_test_table(name,surname) values ('Czesiek','Kowalski')");
      ResultSet resultSet = statement.executeQuery("select* from user_test_table  ");
      resultSet.next();
      String name = resultSet.getString("name");
      String surname = resultSet.getString("surname");
      String fullName = name + " " + surname;
      Assertions.assertThat(fullName).isEqualTo("Czesiek Kowalski");

    }


  }
}
