import java.util.ArrayList;
public class Bibliotek
{
    private ArrayList<Bog> books = new ArrayList<Bog>();

    public void addBog(Bog bog)
    {
        books.add(bog);
    }

    public boolean erISBNPåListe(Bog bog)
    {
        for(Bog fundetBog : books)
        {

            if(fundetBog.getISBN() == bog.getISBN())
            {
                System.out.println("ISBN blev fundet på listen");
                return true;
            }
        }
        // vi når kun herned, hvis der ikke er nogen bøger med samme ISBN på listen
        System.out.println("ISBN er ikke på listen");
        return false;
    }
}
