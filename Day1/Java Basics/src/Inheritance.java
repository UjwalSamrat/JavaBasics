class Animal{
    void Sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void Sound(){
        super.Sound();
        super.Sound();
        System.out.println("Dog barks!!!");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog germanShepherd = new Dog();

        animal.Sound();
        germanShepherd.Sound();

    }
}
