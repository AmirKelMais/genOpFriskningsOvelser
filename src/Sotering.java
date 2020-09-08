
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Sotering {

    public ArrayList<String> Alfabetisk(){
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Skriv dine ord");

        for(int i =0; i < 5; i++){
            list.add(s.nextLine());

        }
        list.sort((s1, s2) -> s2.compareToIgnoreCase(s1));
        return list;
    }
}
