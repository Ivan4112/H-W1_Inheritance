package Abstract;

public abstract class Animal {

    private String nameAnimal;

    private int age;

    public Animal(String nameAnimal, int age) {
        this.nameAnimal = nameAnimal;
        this.age = age;
    }

    public abstract void voice();

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
