public class Dog extends Animals {
    public Dog(String nickname) { super(nickname, "собака", 500, 10);
    }

    @Override
    public void doAction() {
        System.out.println( getTypeOfAnimal() + " " + getNickname() + " " + "пробежал 500м и проплыл 10м");
    }
}