package OOP;
import java.util.Scanner;
interface Mortal{
    boolean isAlive();
}
class Enemy implements Mortal{
    String name;
    int health;

    public Enemy (String name, int health){
        this.name = name;
        this.health = health;
    }
    public boolean isAlive(){
        if (health > 0 )
            return true;
        else
            return
                    false;
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
abstract class Hero {
    String name;
    int damage;
    public Hero (String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public Hero() {
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy health);

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


public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy("Greb", 25);
        System.out.println ("Ворога звати " + enemy1.getName() +",а здоровья в нього " + enemy1.getHealth());

        Scanner name = new Scanner(System.in);
       System.out.println("\nНапишіть ім'я героя: ");
       String names = name.nextLine();
        int num;
        do {
        Scanner in = new Scanner(System.in);
        menu();
        num = in.nextInt();
        if (num > 3)
            System.out.println("Нема такого героя");
       } while (num > 3);
        Hero hero = new Hero() {
            @Override
            public void attackEnemy(Enemy health) {
            }
        };

        switch (num) {
            case 1:
                System.out.println("\nВи обрали воїна");
                hero = new Warrior(names, 5);
                break;
            case 2:
                System.out.println("\nВи обрали мага");
                hero = new Mage(names, 6);
                break;
            case 3:
                System.out.println("\nВи обрали стрільця");
                hero = new Archer(names, 7);
                break;
           }

       do {
           hero.attackEnemy(enemy1);
           System.out.println ("Здоровья ворога після атак " + enemy1.getHealth());

          boolean check = enemy1.isAlive();
           if (!check){
               System.out.println("\nВорог мертвый");
               System.exit(0);
           }

       } while (true);
    }

    public static void menu() {
        System.out.println("\nОберіть тип героя: \n1)Воїн \n2)Маг \n3)Стрілок");

    }
}
