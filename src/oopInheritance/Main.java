package oopInheritance;

public class Main {
    public static void main(String[] args) {
        new Cat().run(5);
        new Cat().run(300);
new Cat().swim(12);// как лучше
        new Dog().run(5);
        new Dog().run(550);
        new Dog().swim(5);
        new Dog().swim(100);

        System.out.println("counting created cats - " + Cat.getInstanceCount());
        System.out.println("counting created dogs - " + Dog.getInstanceCount());
        System.out.println("counting created cats, dogs and animals - " + Animal.getInstanceCount());
    }
}
