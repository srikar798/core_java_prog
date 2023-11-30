package com.career.springcore.cbook.dao;

import com.career.springcore.cbook.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactDaoImpl implements ContactDao{
    @Override
    public Contact insertContact(Contact contact) {
        return null;
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
