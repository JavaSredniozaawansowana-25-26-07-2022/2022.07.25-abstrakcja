package pl.szkloenia.comarch;

 abstract class Algorytm {

    public abstract void wczytajDane();

    private void pierwszyKrokLiczenia() {
        //kod
    }

    private void drugiKrokLiczenia() {
        //kod
    }

    private void trzeciKrokLiczenia() {
        //kod
    }

    public abstract void zapiszDane();

    public void calculate() {
        wczytajDane();
        pierwszyKrokLiczenia();
        drugiKrokLiczenia();
        trzeciKrokLiczenia();
        zapiszDane();
    }
}
