package me.designpatterns.behavioral.command.java;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import me.designpatterns.behavioral.command.after.Command;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class CommandInSpring {

    private DataSource dataSource;

    public CommandInSpring(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void add(Command command) {
        SimpleJdbcInsert insert = new SimpleJdbcInsert(dataSource)
                .withTableName("command")
                .usingGeneratedKeyColumns("id");

        Map<String, Object> data = new HashMap<>();
        data.put("name", command.getClass().getSimpleName());
        data.put("when", LocalDateTime.now());
        insert.execute(data);
    }

}
