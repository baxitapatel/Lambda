package abc;

public class Person {

    private long salary;
    private String name;
    private int bankPass;

    public Person(long salary, String name, int bankPass) {
        System.out.println("in parameterized con");
        this.salary = salary;
        this.name = name;
        this.bankPass = bankPass;
    }

    public Person() {
        System.out.println("in constructor");
        System.out.println(name+ "  " +salary+ "  " +bankPass);

    }
    public int getBankPass(){
        return bankPass;
    }

    public void setBankPass(int bankPass ) {

        this.bankPass = bankPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {


        this.salary = salary;
    }
}
