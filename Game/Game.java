package Game;

public class Game {
    public static void main(String[] args) {
        Magician Magician = new Magician(10,30,40);//HP MP ATT
        Berserker Berserker = new Berserker(20,5,15);
        Archer Archer = new Archer(15,10,30);
        Magician.getCurrentStatus();
        Berserker.getCurrentStatus();
        Archer.getCurrentStatus();

    }
}
