public class Sparrow extends Animal implements eating, flying {

    private static String name = "Jack";
    private static String animalClass = "Birds";
    private static String mowing = "Always I am moving like -";

    Sparrow sparrow = new Sparrow();


    @Override
    public void eating() {
        System.out.println("Yummy");
    }

    @Override
    public void flying() {
        System.out.println("My name is" + name + "I am from" + animalClass + mowing + "Fly Fly");
    }
}
