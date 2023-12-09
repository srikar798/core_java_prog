package com.career.springcore.cbook.dao;

import com.career.springcore.cbook.domain.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactRowMapper implements RowMapper<Contact> {
    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact contact = new Contact();
        contact.setId(rs.getLong("id"));
        contact.setEmail(rs.getString("email"));
        contact.setName(rs.getString("name"));
        contact.setMobile(rs.getString("mobile"));
        return contact;
    }
}
