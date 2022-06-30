package inheritence;

public class Person {

    private String firstname;
    private String lastname;
    private int sinNum;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSinNum() {
        return sinNum;
    }

    public void setSinNum(int sinNum) {
        this.sinNum = sinNum;
    }

    public Person() {
        System.out.println("in person default con");

    }
    // add constructor with parameters

    public Person(String firstname, String lastname, int sinNum) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.sinNum = sinNum;
    }

    public String Display() {
        return ("First name:" + firstname +"\n" + "Last name" + lastname + "\n" + "SinNum" + sinNum);
    }



}
