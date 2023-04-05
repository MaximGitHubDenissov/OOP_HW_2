package Aquarium;

public class Cancer extends Animal implements Crowlable{
    public Cancer(String type, int ID, double size, double weight){
        super(type, ID, size, weight);
    }
    public int crowlSpeed(){
        return 5;
    }
    @Override
    public String toString() {
    String res = String.format("%s Скорость: %d км/ч",super.toString(),crowlSpeed());
    return res;
    }
}
