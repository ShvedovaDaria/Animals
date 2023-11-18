package hmwrk16;

public class Animals {
    private int age;

    public Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal instance with age: " + age;
    }

    public static void main(String[] args) {
        Animals animal = new Animals(3);
        System.out.println(animal.toString());
    }
}