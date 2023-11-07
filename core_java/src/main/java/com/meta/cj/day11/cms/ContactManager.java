package com.meta.cj.day11.cms;

import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactService cs = new ContactService();
        while (true) {
            System.out.println("-----------------Contact Manager-------------------");
            System.out.println("""
                    1. Add contact
                    2. Show all contacts
                    3. Search contact
                    4. Delete contact
                    5. Update contact
                    6. Exit
                    Enter your choice(1-6):
                    """);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter name :");
                    String name = sc.next();
                    System.out.println("Enter email :");
                    String email = sc.next();
                    System.out.println("Enter mobile :");
                    String mobile = sc.next();
                    Contact contact = new Contact(name, email, mobile);
                    cs.addContact(contact);
                    break;
                case 2:
                    cs.showAllContacts();
                    break;
                case 3:
                    System.out.println("Enter name or email or mobile :");
                    String str = sc.next();
                    cs.search(str);
                    break;
                case 4:
                    System.out.println("Enter mobile :");
                    String delMobile = sc.next();
                    cs.deleteContact(delMobile);
                    break;
                case 5:
                    System.out.println("Enter mobile :");
                    String mobile2 = sc.next();
                    if (cs.isContactExist(mobile2)) {
                        System.out.println("Enter new details");
                        System.out.println("Enter name :");
                        String name1 = sc.next();
                        System.out.println("Enter email :");
                        String email1 = sc.next();
                        Contact contact1 = new Contact(name1, email1, mobile2);
                        cs.updateContact(contact1);
                    } else {
                        System.out.println("Contact with mobile " + mobile2 + " does not exist");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
