package Interface;

public class Practice {
    public static void main(String[] args) {
        Work1 work = new Employee1();
    }
}
    interface Work1{
        void work();
    }
    class Employee1 implements Work1{
        @Override
        public void work() {

        }
    }


