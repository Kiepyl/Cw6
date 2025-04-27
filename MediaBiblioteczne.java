import javax.print.attribute.standard.Media;

public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz(){
        if (dostepny == true){
            dostepny = false;
            System.out.println("Media zostalo wypozyczone.");
        }
        if (dostepny == false){
            System.out.println("Media jest niedostepne");
        }
    }

    public void zwroc(){
        if (dostepny == false){
            dostepny = true;
            System.out.println("Media zostalo zwrocone");
        }
        if (dostepny == true){
            System.out.println("Media nie zostalo wypozyczone.");
        }
    }

    public void wyswietlInformacje(){
        System.out.println(tytul + "\n" + rokWydania + "\n" + dostepny);
    }
}

public class ksiazka extends MediaBiblioteczne {
    private String autor;
    private int liczbaStron;

    public ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super();
    }
}