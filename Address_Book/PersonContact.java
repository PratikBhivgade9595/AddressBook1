package Address_Book;

import java.util.ArrayList;

public class PersonContact {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");

        ArrayList<Object> list = new ArrayList<>();
        list.add("Rushikesh");
        System.out.println("First Name :" + list.get(0));
        list.add("Borkar");
        System.out.println("Second Name :" + list.get(1));
        list.add("Plot 25 Vijay Wada Hill Top.");
        System.out.println("Address :" + list.get(2));
        list.add("Pune");
        System.out.println("City :" + list.get(3));
        list.add("Maharastra");
        System.out.println("State :" + list.get(4));
        list.add(4520);
        System.out.println("Pin No :" + list.get(5));
        list.add("9236584521");
        System.out.println("Mobile No :" + list.get(6));
        list.add("rushi5652@gmail.com");
        System.out.println("Email ID :" + list.get(7));
    }
}
