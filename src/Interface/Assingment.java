package Interface;

public class Assingment {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.play();
        employee.work();

    }

    }

    interface Work {
        void work();
    }

    interface IPlay {
        void play();
    }
    class Employee implements Work,IPlay{
        @Override
        public void work() {
            System.out.println("i am working");

        }

        @Override
        public void play() {
            System.out.println("i am playing");

        }
    }

