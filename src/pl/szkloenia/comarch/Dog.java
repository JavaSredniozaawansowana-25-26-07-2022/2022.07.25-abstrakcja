package pl.szkloenia.comarch;

public class Dog implements DogInterface {

    @Override
    public boolean bark() {
        return true;
    }

    @Override
    public void walk() {
        System.out.println("Ide !!!");
    }

    @Override
    public double run(int distance){
        return distance * 3.05;
    }
}
