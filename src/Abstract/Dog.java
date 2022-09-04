package Abstract;

public class Dog extends Animal{


    public Dog(String nameAnimal, int age) {
        super(nameAnimal, age);
    }

    @Override
    public void voice() {
        System.out.println("-----Dog-----\n" + getNameAnimal() + "\nAge: " + getAge()  +  "\nHe is Barking\n");
    }
}
