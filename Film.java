public class Film extends MediaBiblioteczne{
    private String rezyser;
    private int czasTrwania;

    public Film(String tytul, int rokWydania, String rezyser, int czasTrwania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Rezyser: " + rezyser);
        System.out.println("Czas Trwania: " + czasTrwania + "min");
    }

    public void sprawdzCzasTrwania() {
        if (czasTrwania > 120) System.out.println("Ten film jest dlugiiiii. " + czasTrwania + " minut.");
        else System.out.println("Ten film jest krotki. " + czasTrwania + " minut.");
    }
}
