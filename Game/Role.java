package Game;

public class Role {
    int HP; //data member
    int MP; //data member
    int ATTACK; //data member
    String Skill;

    Role(int roleHP, int roleMP, int roleATTACK) {
        HP = roleHP;
        MP = roleMP;
        ATTACK = roleATTACK;
    }
    void getCurrentStatus() {
        System.out.println("Attack:"+ ATTACK);
        System.out.println("HP:" + HP);
        System.out.println("MP:" + MP);
    }
}
