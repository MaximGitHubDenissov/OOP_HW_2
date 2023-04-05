package Aquarium;

abstract class Animal {
    String type;
    int ID;
    double size;
    double weight;

    public Animal(String type, int ID, double size, double weight){
        this.type = type;
        this.ID = ID;
        this.size = size;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        String res = String.format("Тип: %s ID: %d Размер: %.1f Вес: %.1f",type,ID,size,weight);
        return res;
    }
}

