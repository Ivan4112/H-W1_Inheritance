package Abstract;

public class Cat extends Animal{

    public Cat(String nameAnimal, int age) {
        super(nameAnimal, age);
    }

    @Override
    public void voice() {
        System.out.println("-----Cat-----\n" + getNameAnimal() + "\nAge: " + getAge()  +  "\nHe is Mewing\n");
    }
}
