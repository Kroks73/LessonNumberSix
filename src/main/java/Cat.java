public class Cat extends Animals{
    public Cat(String nickname) { super(nickname, "кошка", 200,0);

    }

    @Override
    public void doAction() {
        System.out.println(getTypeOfAnimal() + " " + getNickname() + " " + "пробежала 200м и не умеет плавать");
    }
}
