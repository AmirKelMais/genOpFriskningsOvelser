public class Græs {
    public int dageTilGræsslåning(double currentLængde, double længdeLimit){

        // double vokser = 0.8;
        // double cmAtVokse = længdeLimit - currentLængde;
        // double dageTilKlipning =  cmAtVokse / vokser;
        // double længdeForskel = (længdeLimit - currentLængde);
        // int dageTilKlipningIInt = (int) længdeForskel / 0.8;
        // System.out.println(dageTilKlipningIInt);


        return (int) ((længdeLimit - currentLængde) / 0.8);
    }


    /*currentLænge = 1;
    længdeLimit = 4;

    cmAtVokse = 3;

    3/0.8;
    */



}
