package Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressEditDelete {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");

        ArrayList<Object> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


            System.out.println("Enter 1. To Edit Details" + "--" + "Enter 2. To Delete Details" + "--" + "Enter 3. To Add Details");
            int value = sc.nextInt();
            while (value != 0){
            if (value == 1) {
                System.out.println("Edit Details");
                //System.out.println("Enter Contact Details");
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
            }else if (value == 2) {
                System.out.println("Delete Details");
            } else if (value == 3) {
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
            }break;
        }
    }
}
