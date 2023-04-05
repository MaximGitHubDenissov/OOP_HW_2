package Aquarium;

public class Snail extends Animal implements Crowlable{
    public Snail(String type, int ID, double size, double weight){
        super(type, ID, size, weight);
    }
    public int crowlSpeed(){
        return 1;
    }
    @Override
    public String toString() {
    String res = String.format("%s Скорость: %d км/ч",super.toString(),crowlSpeed());
    return res;
}
}
