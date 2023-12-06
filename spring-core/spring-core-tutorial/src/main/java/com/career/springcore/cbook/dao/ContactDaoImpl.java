package com.career.springcore.cbook.dao;

import com.career.springcore.cbook.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactDaoImpl implements ContactDao{

    private final JdbcTemplate jdbcTemplate;

    private static final String INSERT_CONTACT = "insert into contact(name, email,mobile) values(?,?,?)";
    @Override
    public Contact insertContact(Contact contact) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            var ps = connection.prepareStatement(INSERT_CONTACT,new String[]{"id"});
            ps.setString(1,contact.getName());
            ps.setString(1,contact.getEmail());
            ps.setString(1,contact.getMobile());
            return ps;
        },keyHolder);
        long id = keyHolder.getKey().longValue();
        contact.setId(id);
        return contact;
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }

    @Override
    public boolean deleteContact(long id) {
        return false;
    }

    @Override
    public Contact selectContact(String str) {
        return null;
    }

    @Override
    public List<Contact> selectContacts() {
        return null;
    }
}
