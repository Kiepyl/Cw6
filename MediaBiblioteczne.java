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
        if (dostepny){
            dostepny = false;
            System.out.println("Media zostalo wypozyczone.");
        }
        else{System.out.println("Media jest niedostepne");}
    }

    public void zwroc(){
        if (!dostepny){
            dostepny = true;
            System.out.println("Media zostalo zwrocone");
        }
        else{System.out.println("Media nie zostalo wypozyczone.");}
    }

    // test ? ifTrue : ifFalse;

    public void wyswietlInformacje(){
        System.out.println(tytul + " " + rokWydania);
        System.out.println(dostepny ? "Media jest dostepne." : "Media nie jest dostepne.");
    }
}