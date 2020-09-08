import java.util.Scanner;

public class ProperCase{
    /*
    ord med store bogstaver skal ikke ændres
    ord med 3 bogstaver skal ikke ændres
    ord på mere end 3 bogstaver skal første bogstav skrives med stort og resten med småt
     */
    public static void sentenceCheck(String sentence){

        //her bruger vi split til at adskille stringen for mellemrum
        String[] parts = sentence.split(" ");

        //her laver vi et forloop af vores string array. Loopet køre det antalt gange som der er ord, så hvis 4 ord så looper det 4 gange.
        for(String string : parts){
            //hvis string er med store bogstaver er den lig med string, så forsæt.
            if(string.toUpperCase().equals(string))
                continue;
            //hvis længden på ordet er større end 3 så skal det første bogstav skrives med stort + resten skal skrives med små.
            if(string.length() > 3){
                String newString = string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
                System.out.println(newString);
            }
            // hvis stringen er lig med eller mindre end 3 så skal den skrives med småt.
            if(string.length() <= 3){
                String newString = string.toLowerCase();
                System.out.println(newString);
            }
        }



    }

}
