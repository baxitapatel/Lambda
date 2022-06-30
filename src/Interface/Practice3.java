package Interface;

public class Practice3 {
    public static void main(String[] args) {
        Play3 play3 = new Play3() {
            @Override
            public void play3() {
                System.out.println("playing");
            }
        };
        play3.play3();
        Work3 work3 = new Work3() {
            @Override
            public void work3() {
                System.out.println("working");

            }
        };
        work3.work3();

    }

}
interface Play3{
    void play3();
}
interface Work3{
    void work3();
}
