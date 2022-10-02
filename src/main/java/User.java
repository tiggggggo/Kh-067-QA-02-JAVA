import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    private final String name;
    private final int height;
    private final double weight;

    public User(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name is empty String");
        }

        String[] userParameters = name.split(" ");
        if (userParameters.length != 3) {
            throw new IllegalArgumentException("Provided parameter name is invalid. Name, height and weight should be separated by space");
        }

        this.name = userParameters[0];
        if (!isInteger((userParameters[1]))) {
            throw new IllegalArgumentException("Parameter height=" + (userParameters[1]) + " is not an integer");
        }
        this.height = Integer.parseInt(userParameters[1]);

        if (!isDouble((userParameters[2]))) {
            throw new IllegalArgumentException("Parameter weight=" + (userParameters[2]) + " is not double");
        }
        this.weight = Double.parseDouble(userParameters[2]);

    }

    public User()  {
        try {
            this.name = readName();
            this.height = readHeight();
            this.weight = readWeight();
        }catch (IOException ex) {
            throw new RuntimeException("Unexpected error happened working with steams: ", ex);
        }
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getStringRepresentation() {
        return "User{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    private double readWeight() throws IOException {
        System.out.print("Enter weight: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String weightAsString = reader.readLine();

        while (!isDouble(weightAsString)) {
            System.out.print("Input value is not double, please enter weight again: ");
            weightAsString = reader.readLine();
        }

        return Double.parseDouble(weightAsString);
    }

    private int readHeight() throws IOException {
        System.out.print("Enter height: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String heightAsString = reader.readLine();

        while (!isInteger(heightAsString)) {
            System.out.print("Input value is not an integer, please enter height again: ");
            heightAsString = reader.readLine();
        }

        return Integer.parseInt(heightAsString);
    }

    private boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private String readName() throws IOException {
        System.out.print("Enter name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}






