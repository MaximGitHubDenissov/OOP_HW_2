package Aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aq = new Aquarium();
        aq.AddAnimal(new Shark("Акула", 12,5.2,34.2,5.4))
        .AddAnimal(new DevilFish("Скат",15,2.1,20,220))
        .AddAnimal(new Carp("Карп",17,0.5,2.3))
        .AddAnimal(new Sturgeon("Осетр",19,0.7,3.2))
        .AddAnimal(new Cancer("Рак",21,0.5,1.5))
        .AddAnimal(new Crab("Краб",23,0.5,1.7))
        .AddAnimal(new Snail("Улитка",34,0.3,0.5));
        
        aq.ShowAll();
        System.out.println("------------------------");
        aq.ShowSwimable();
        System.out.println("-----------------------");
        aq.ShowCrowlable();
        
        
}
}
