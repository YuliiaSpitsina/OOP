package OOP;

class Enemy {
    String name;
    int health;

    public Enemy (String name, int health){
        this.name = name;
        this.health = health;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage){
        if (health > 0) {
            health = health - damage;
            if (health > 0)
            return health;
            else {
                health = 0;
                return health;
            }
        }
        else {
            health = 0;
            return health;
        }
    }
}
 class Hero {
    String name;
   int damage;
    public Hero (String name, int damage){
        this.name = name;
        this.damage = damage;

    }
    public String getName(){
        return name;
    }

    public void attackEnemy(Enemy health){
        System.out.println(name + " атакує ворога "  + damage + " урону");
        health.takeDamage(damage);
    }

}

class Warrior extends Hero {
    Warrior(String name, int damage) {
        super(name, damage);
    }
    public void attackEnemy(Enemy health){
        System.out.println(name + " розмахує мечом і завдає "  + damage + " урону");
        health.takeDamage(damage);
    }
}

class Mage extends Hero {
    Mage(String name, int damage) {
        super(name, damage);
    }
    public void attackEnemy(Enemy health){
        System.out.println(name + " викликає стовб світла і завдає "  + damage + " урону");
        health.takeDamage(damage);
    }
}
class Archer extends Hero {
   public Archer(String name, int damage) {
        super(name, damage);
    }
    public void attackEnemy(Enemy health){
        System.out.println(name + " стріляє с лука і завдає " + damage + " урону");
        health.takeDamage(damage);
    }
}

public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy("Greb", 25);

        System.out.println ("Ворога звати " + enemy1.getName() +",а здоровья в нього " + enemy1.getHealth());

        Warrior hero2 = new Warrior("Rory", 7);
        hero2.attackEnemy(enemy1);

        Mage hero3 = new Mage("Soul", 2);
        hero3.attackEnemy(enemy1);

        Archer hero4 = new Archer("John", 40);
        hero4.attackEnemy(enemy1);

        System.out.println ("Здоровья ворога після атак " + enemy1.getHealth());

    }
}
