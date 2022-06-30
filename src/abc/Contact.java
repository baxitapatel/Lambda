package abc;

public class Contact {
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String email;

    public Contact(String firstname, String lastname, String phoneNumber, String email) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

