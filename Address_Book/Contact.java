package Address_Book;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int pin;
    private long mobileNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int pin, long mobileNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    void output(){
        System.out.println("First Name :" + firstName);
        System.out.println("Last Name :" + lastName);
        System.out.println("Address :" + address);
        System.out.println("City :" + city);
        System.out.println("State :" + state);
        System.out.println("Pin :" + pin);
        System.out.println("Mobile Number :" + mobileNumber);
        System.out.println("Email ID :" + email);
    }
}
