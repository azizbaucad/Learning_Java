import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Test a ArrayList");
        ArrayList<String> people = new ArrayList<>();
        //Populate the ArrayList with add function arrayList
        people.add("John");
        people.add("Abdou");
        people.add("Aziz");
        people.add("hamidou Sylla");
        //Print the List
        System.out.println("The List printed is ..." + people);

        //Verification
        if (people.contains("John")) {
            System.out.println("John is in the list");
        }
        if (people.contains("Aziz")) {
            System.out.println("Aziz is in the list");
        }
        //Verification si le tableau est vide
        if (people.isEmpty()) {
            System.out.println("The list is empty!");
        }
        //Effacer la liste
        people.clear();
        //Verification si le tableau est vide
        if (people.isEmpty()) {
            System.out.println("The list is empty!");
        }
        System.out.println("The List printed is ..." + people);
    }
}