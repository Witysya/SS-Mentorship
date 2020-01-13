public class Sparrow extends Animal implements eating, flying {

    private static String name = "Jack";
    private static String animalClass = "Birds Animal's Class";
    private static String mowing = "Always I am moving like -";

    @Override
    public void eating() {
        System.out.println("Yummy");
    }

    @Override
    public void flying() {
        System.out.println("My name is " + name + " I am from " + animalClass + mowing + " Fly Fly ");
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eating();
        sparrow.flying();
    }
}
