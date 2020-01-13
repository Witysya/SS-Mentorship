import java.util.ArrayList;
import java.util.HashMap;

public class Lists {

    static class Car {
        public static void main(String[] args) {
            String[] cars = {"Volvo", "Opel", "Porsche", "Audi"};
            for (int i = 0; i < 4; i++) {
                System.out.println(cars[i]);
            }
            Principle principle = new Principle();
            principle.testingPrinciples();

            Colors colors = new Colors();
            colors.testingColors();

            // Principle.Colors colors = principle.new Colors();
            //  colors.testingColors();
        }


        static class Principle {
            public void testingPrinciples() {

                ArrayList<String> principles = new ArrayList<>();
                Principle first = new Principle();
                principles.add("Testing shows presence of defects");
                principles.add("Exhaustive testing is not possible");
                principles.add("Early testing");
                principles.add("Defect clusering");
                principles.add("Pesticide paradox");
                principles.add("Testing is context depentent");
                principles.add("Absense of errors fallacy");
                System.out.println(principles.toString());

            }
        }

        static class Colors {
            public void testingColors() {
                HashMap<String, String> colors = new HashMap<String, String>();
                colors.put("Green", "Warm type");
                colors.put("Blue", "Cold type");
                colors.put("Red", "Warm type");
                colors.put("Silver", "Cold type");
                System.out.println(colors);
            }

        }
    }
}



