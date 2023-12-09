package com.career.springcore.cbook.service;

import com.career.springcore.cbook.dao.ContactDao;
import com.career.springcore.cbook.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService{

    private final ContactDao contactDao;
    @Override
    public Contact addContact(Contact contact) {
        Assert.notNull(contact.getName(),"Name should not be null");
        Assert.notNull(contact.getEmail(),"Email should not be null");
        Assert.notNull(contact.getMobile(),"Mobile should not be null");

        return contactDao.insertContact(contact);
    }

    @Override
    public Contact updateContact(Contact contact) {
        Assert.notNull(contact,"Contact should not be null");
        Assert.notNull(contact.getId(),"Id should not be null");
        Assert.notNull(contact.getName(),"Name should not be null");
        Assert.notNull(contact.getEmail(),"Email should not be null");
        Assert.notNull(contact.getMobile(),"Mobile should not be null");
        return contactDao.updateContact(contact);
    }

    @Override
    public boolean removeContact(Long id) {
        Assert.notNull(id,"Id should not be null");
        return contactDao.deleteContact(id);
    }

    @Override
    public Contact getContact(Long id) {
        Assert.notNull(id,"Id should not be null");
        return contactDao.selectContact(id);
    }

    @Override
    public List<Contact> search(String str) {
        Assert.notNull(str,"Search string should not be null");
        return contactDao.search(str);
    }

    @Override
    public List<Contact> getContacts() {
        return contactDao.selectContacts();
    }
}
