import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

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
        System.out.println("The List printed is ..." + people);*/

        //Test avec les LinkedList
        System.out.println("Test a LinkedList");
        //Declaration d'un linkedList de type Integer
        LinkedList<Integer> list = new LinkedList<>();//Se trouve dans Java.util.linkedList
        //Populate the LinkedList with add function linkedList
        list.add(1);
        list.add(2);
        list.add(3);
        //impresion de la liste
        System.out.println("The List printed is ..." + list);
        //supprimer des éléments de la liste
        list.remove(1);//suppression par index
        System.out.println("The List printed is now ..." + list);
        list.remove(Integer.valueOf(3)); //suppression par valeur
        System.out.println("The List printed is now ..." + list);
        //Effacer la liste
        list.clear();
        System.out.println("The List printed is now ..." + list);
        //Populate list with offer function
        list.offer(1);
        list.offer(2);
        list.offer(3);
        //System.out.println("The List printed with offer function is  ..." + list);
        //Order list by FIFO
        //System.out.println("The List printed with offer function and FIFO order is  ..." + list.poll());
        //Print the list on FIFO order with a poll function
        while (!list.isEmpty()) {
            System.out.println("The List printed with offer function and FIFO order is  ..." + list.poll());
        }
        //Print the list on LIFO order with a push and pop function
        list.push(1);
        list.push(2);
        list.push(3);

        while (!list.isEmpty()) {
            System.out.println("The List printed with offer function and LIFO order is  ..." + list.pop());
        }
    }
}