public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Люся");
        Dog dog = new Dog("Тоша");


        cat.printInfo();
        dog.printInfo();

        cat.doAction();
        dog.doAction();

    }
}
