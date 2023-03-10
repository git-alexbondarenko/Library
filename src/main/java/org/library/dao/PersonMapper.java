package org.library.dao;

import org.springframework.jdbc.core.RowMapper;
import org.library.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setYearOfBirth(rs.getInt("year_of_birth"));

        return person;
    }
}
