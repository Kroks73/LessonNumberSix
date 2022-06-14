public class Animals {
    private String nickname;
    protected String typeOfAnimal;
    protected int maxRunDistance;
    protected int maxSwimmingDistance;

    public Animals(String nickname, String typeOfAnimal, int maxRunDistance, int maxSwimmingDistance) {
        this.nickname = nickname;
        this.typeOfAnimal = typeOfAnimal;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxSwimmingDistance() {
        return maxSwimmingDistance;
    }

    public void setMaxSwimmingDistance(int maxSwimmingDistance) {
        this.maxSwimmingDistance = maxSwimmingDistance;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "nickname='" + nickname + '\'' +
                ", typeOfAnimal='" + typeOfAnimal + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxSwimmingDistance=" + maxSwimmingDistance +
                '}';
    }

    public void doAction (){
        System.out.println(typeOfAnimal + " " + nickname + " " + "совершает действие");
    }


}