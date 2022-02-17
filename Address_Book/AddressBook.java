package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");

        ArrayList<Object>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Contact Details");
        System.out.println("Enter First Name :");
        String firstName = sc.next();
        System.out.println("Enter Last Name :");
        String lastName = sc.next();
        System.out.println("Enter Address :");
        String address = sc.next();
        System.out.println("Enter City :");
        String city = sc.next();
        System.out.println("Enter State :");
        String state = sc.next();
        System.out.println("Enter Pin :");
        int pin = sc.nextInt();
        System.out.println("Enter Mobile No :");
        long mobileNumber = sc.nextLong();
        System.out.println("Enter Email ID :");
        String email = sc.next();

        Contact person = new Contact(firstName, lastName, address, city, state, pin, mobileNumber, email);
        list.add(person);
        person.output();
    }
}
