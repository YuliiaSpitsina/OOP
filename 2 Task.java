package OOP;

class Hero {
    String name;
    public Hero (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void attackEnemy(){
        System.out.println(name + " атакує ворога");
    }
}

class Warrior extends Hero {
    Warrior(String name) {
        super(name);
    }
    public void attackEnemy(){
        System.out.println(name + " розмахує мечом");
    }
}

class Mage extends Hero {
    Mage(String name) {
        super(name);
    }
    public void attackEnemy(){
        System.out.println(name + " викликає стовб світла");
    }
}
class Archer extends Hero {
   public Archer(String name) {
        super(name);
    }
    public void attackEnemy(){
        System.out.println(name + " стріляє с лука");
    }
}

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Foggy");
        hero1.attackEnemy();

        Warrior hero2 = new Warrior("Rory");
        hero2.attackEnemy();

        Mage hero3 = new Mage("Soul");
        hero3.attackEnemy();

        Archer hero4 = new Archer("John");
        hero4.attackEnemy();
    }
}

