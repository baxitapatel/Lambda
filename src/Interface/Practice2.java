package Interface;

public class Practice2 {
    public static void main(String[] args) {
        Work2 work2 = new Father();
        work2.work();
        Play2 play2 = new Father();
        play2.play();

    }
}
interface Work2{
    void work();
}
interface Play2{
    void play();
}
class Father implements Work2,Play2{
    @Override
    public void work() {
        System.out.println("work");

    }

    @Override
    public void play() {
        System.out.println("play");

    }
}
