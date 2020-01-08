package MainTasks;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Kill Bill";
        one.genre = "Block-buster";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Fighting club";
        three.genre = "Tragedy";
        three.rating = 127;

    }
}
