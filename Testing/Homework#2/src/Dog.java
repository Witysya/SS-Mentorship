public class Dog extends Animal implements barking, eating {

    private static String name = "Muchtar";
    private static String animalClass = "Mammals";
    private static String saying = "Always I am saying like -";


    @Override
    public void barking() {
        System.out.println("My name is" + name + "I am from" + animalClass + saying + "Wof Wof");
    }

    @Override
    public void eating() {
        System.out.println("Yummy");
    }


}
