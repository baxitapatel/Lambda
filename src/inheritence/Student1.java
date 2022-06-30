package inheritence;

public class Student1 extends Person1 {

    private int grade;

    public Student1(String name, String address, int age, int grade) {
        super(name, address, age);
        this.grade = grade;
    }

    public int getGrade() {

        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}


