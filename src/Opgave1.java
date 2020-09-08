import java.util.*;
public class Opgave1{
    public boolean doesArraylistContainString(String stringViVilTjekke, ArrayList<String> listeViVilTjekke){
        for(String string : listeViVilTjekke) // for each String (string) in the library
            {
                if(string.equals(stringViVilTjekke))
                {
                    System.out.println("The String has been found");
                    return true;
                }
            }

            listeViVilTjekke.add(stringViVilTjekke);
            System.out.println("The String, " + stringViVilTjekke + ", was not found, but has been added to the ArrayList");

            return false;
        }
}
