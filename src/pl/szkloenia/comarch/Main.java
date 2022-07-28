package pl.szkloenia.comarch;

public class Main {
    public static void main(String[] args) {
        DogInterface dog = new Dog();
        if(dog.bark()) {
            System.out.println("pies szczeka !!");
        } else {
            System.out.println("pies nie szczeka !!");
        }

        dog.walk();

        double time = dog.run(10);
        System.out.println(time);


        /*DogInterface dogInterface = new DogInterface();
        dogInterface.walk();*/

        TestClass object = new TestClass();
        object.a();

        System.out.println(Constants.a);
    }
}
