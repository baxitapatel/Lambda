package abc;

public class FirstDemo {
    public static void main(String[] args) {
        //FirstDemo
        System.out.println("hello");
        System.out.println("hi");
        System.out.println("hello..hi");
        FirstDemo.greeting();
        String cup = makeTea();
        System.out.println(cup);
        int result = doubleMe(2);
        System.out.println(result);
        int answer = doubleMe(3, 7);
        System.out.println(answer);
        int answer2 = divideMe(3);
        System.out.println(answer2);
    }

    public static String makeTea() {
        System.out.println("ok,stared preparing tea");
        return "cup of tea";
    }

    public static int doubleMe(int x) {
        return 2 * x;

    }

    public static void greeting() {
        System.out.println("good morning");

    }

    public static int doubleMe(int x, int y) {
        return 2 * x + y;

    }

    public static int divideMe(int x) {
        return 5 - x;

    }
}
