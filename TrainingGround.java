package OOP;

class Hero {
    private String name;
    public Hero (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

   public void attackEnemy(){
        System.out.println("Герой атакує ворога");
    }
}

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Foggy");
     System.out.println(hero1.getName());
        hero1.attackEnemy();
    }
}
