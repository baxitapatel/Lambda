package abc;

public class Dog {

    String breed;
    int age;
    double size;
    String barking;

    public Dog(String breed, int age, double size, String barking) {
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.barking = barking;
    }

    public Dog() {
        System.out.println(" constructor ");
    }


}
