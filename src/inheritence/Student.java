package inheritence;

public class Student  extends Person{

    private int studentNum;
    private double marks;

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    //add default constructor:
    public Student(){
        System.out.println("in student default constructor");
    }
    // add constructor with parameters
    public Student(String firstname, String lastname, int sinNum, int studentNum, double marks) {
        super(firstname, lastname, sinNum);
        this.studentNum = studentNum;
        this.marks = marks;
    }
    public String display(){
        System.out.println("student detail");
        return (super.Display()+"\n"+"student Num:"+studentNum+"\n"+"Marks"+marks);
    }
}

