package game;

public class person {

    String name;            //名稱
    String Skill;           //技能名稱
    String arm;             //武器
    int hp;                  //生命值
    int attack;                //攻擊力
    int mp;                     //魔力值
    int mps;                    //魔力消耗量
    int hr;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMps() {
        return mps;
    }

    public void setMps(int mps) {
        this.mps = mps;
    }

    //遭到攻擊時的處理函式
    public void kick(int attack, int mps) {
        int hurt = 0;             //受到的傷害
        int residue_hp;          //剩餘生命值

        if (die()) {//呼叫下面的陣亡處理函式
            hurt = 0;
            hurt = hp - attack;
            if(hurt > 0) {
                residue_hp = hp - attack;//每回合計算剩餘生命值
                System.out.println(this.name + "使出" + this.Skill);
                System.out.println(this.name + "受到" + attack + "點傷害！");//受到多少傷害
                if (residue_hp < 0) {
                    residue_hp = 0;
                }
                System.out.println("還剩" + residue_hp + "點生命值");          //剩餘生命值
                hp = residue_hp;//當前生命值
            }else{
                hp = 0;
                System.out.println(this.name + "使出" + this.Skill);
                System.out.println("對手受到大於生命的傷害！");

            }
        } else {

        }
    }


    //陣亡時的處理函式，返回一個布林值，代表是否死亡
    public boolean die() {
        boolean flag = true;                     //初始化，代表活著
        if (hp <= 0) {                       //生命值小於等於0則陣亡
            System.out.println(this.name + "陣亡,遊戲結束！");
            flag = false;
        }
        return flag;                           //返回生存狀態
    }

}


