import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five names: ");
        ArrayList<String> listA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String names = sc.next();
            listA.add(names);
        }
        System.out.println("List A: " + listA);

        System.out.println("----------------");
        System.out.println("Enter five more names: ");
        ArrayList<String> listB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String names = sc.next();
            listB.add(names);
        }
        System.out.println("List B: " + listB);

        Collections.reverse(listB);
        System.out.println("Reversed List B: " + listB);
        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < listB.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("List C: " + listC);
        listC.sort(Comparator.comparingInt(String::length));
        System.out.println(listC);

    }
}