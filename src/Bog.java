public class Bog {
    private String name;
    private int ISBN;
    private int release;

    public Bog(String name, int ISBN, int release){
        this.name = name;
        this.ISBN = ISBN;
        this.release = release;
    }


    // setters
    public void setName(String name){ this.name = name; }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public void setRelease(int release){
        this.release = release;
    }

    // getters
    public String getName(){
        return name;
    }

    public int getISBN(){
        return ISBN;
    }

    public int getRelease(){
        return release;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nISBN: " + ISBN + "\nRelease: " + release;
    }

}
