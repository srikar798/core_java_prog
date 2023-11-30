package com.career.springcore.cbook.dao;

import com.career.springcore.cbook.domain.Contact;

import java.util.List;

public interface ContactDao {

    Contact insertContact(Contact contact);
    Contact updateContact(Contact contact);

    boolean deleteContact(long id);

    Contact selectContact(String str);

    List<Contact> selectContacts();
}
