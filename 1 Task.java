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

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Foggy");
        hero1.attackEnemy();
    }
}
