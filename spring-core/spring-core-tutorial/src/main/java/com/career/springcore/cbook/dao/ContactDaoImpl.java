package com.career.springcore.cbook.dao;

import com.career.springcore.cbook.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class ContactDaoImpl implements ContactDao{

    private final JdbcTemplate jdbcTemplate;

    private static final String INSERT_CONTACT = "insert into contact(name,email,mobile) values(?,?,?)";

    private static final String UPDATE_CONTACT = "update contact set name=?,email=?,mobile=? where id=?";

    private static final String DELETE_CONTACT = "delete from contact where id=?";

    private static final String SELECT_CONTACT = "select id,name,email,mobile from contact where id=?";

    private static final String SEARCH_CONTACT = "select id,name,email,mobile from contact where name like ? or email like ? or mobile like ?";
    private static final String SELECT_CONTACTS = "select id,name,email,mobile from contact";
    @Override
    public Contact insertContact(Contact contact) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            var ps = connection.prepareStatement(INSERT_CONTACT,new String[]{"id"});
            ps.setString(1,contact.getName());
            ps.setString(2,contact.getEmail());
            ps.setString(3,contact.getMobile());
            return ps;
        },keyHolder);
        long id = keyHolder.getKey().longValue();
        contact.setId(id);
        return contact;
    }

    @Override
    public Contact updateContact(Contact contact) {
        jdbcTemplate.update(connection -> {
            var ps = connection.prepareStatement(UPDATE_CONTACT);
            ps.setString(1,contact.getName());
            ps.setString(2,contact.getEmail());
            ps.setString(3,contact.getMobile());
            ps.setLong(4,contact.getId());
            return ps;
        });

        return contact;
    }

    @Override
    public boolean deleteContact(long id) {
        int count = jdbcTemplate.update(connection ->{
            var ps = connection.prepareStatement(DELETE_CONTACT);
            ps.setLong(1,id);
            return  ps;
        });
        return count == 1;
    }

    @Override
    public Contact selectContact(long id) {
      return jdbcTemplate.queryForObject(SELECT_CONTACT, new ContactRowMapper(),id);
    }

    @Override
    public List<Contact> search(String str) {
        return jdbcTemplate.query(con -> {
            var ps = con.prepareStatement(SEARCH_CONTACT);
            ps.setString(1,"%"+str+"%");
            ps.setString(2,"%"+str+"%");
            ps.setString(3,"%"+str+"%");
            return ps;
        },new ContactRowMapper());
        }

        @Override
    public List<Contact> selectContacts() {
        return jdbcTemplate.query(SELECT_CONTACTS,new ContactRowMapper());
    }
}
