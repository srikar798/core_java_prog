package com.career.springcore.cbook;

import com.career.springcore.cbook.domain.Contact;
import com.career.springcore.cbook.service.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan(basePackages = "com.career.springcore.cbook")
public class CbookApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CbookApplication.class);
        ContactService contactService = context.getBean(ContactService.class);

        /*Contact contact= new Contact();
        contact.setName("Srikar");
        contact.setEmail("srikar@gmail.com");
        contact.setMobile("9876543210");
        Contact savedContact = contactService.addContact(contact);
        System.out.println("Contact saved with id : " + savedContact.getId());*/



        /*Contact contact= new Contact();
        contact.setId(2L);
        contact.setName("Manoj PV");
        contact.setEmail("manoj.pv@gmail.com");
        contact.setMobile("9876543212");
        Contact savedContact = contactService.updateContact(contact);
        System.out.println("Contact saved with id : " + savedContact.getId());*/


        //contactService.removeContact(1L);

        List<Contact> list = contactService.search("8");
        list.forEach(contact -> { System.out.println(contact.getId());
        System.out.println(contact.getName());
        System.out.println(contact.getMobile());
        System.out.println(contact.getEmail());
                });

        /*Contact contact1 = contactService.getContact(2L);
        System.out.println(contact1.getId());
        System.out.println(contact1.getName());
        System.out.println(contact1.getMobile());
        System.out.println(contact1.getEmail());*/

        /*contactService.getContacts().forEach(contacts -> {
            System.out.println(contacts.getId());
            System.out.println(contacts.getName());
            System.out.println(contacts.getMobile());
            System.out.println(contacts.getEmail());
        });*/
    }
}
