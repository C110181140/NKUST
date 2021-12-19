public class job {

    int hp;
    int mp;
    int at;
    String name,skillname,player1,player2,player3;

    job(String Name,int HP,int MP, int AT,String Skillname){

        name = Name;
        hp = HP;
        mp = MP;
        at = AT;
        skillname = Skillname;

    }

    void get(){

        System.out.print("JOB:" + name);
        System.out.print("/HP:" + hp);
        System.out.print("/MP:" + mp);
        System.out.print("/Att:" + at);
        System.out.print("\n");

    }

    void setgame(String player1, String player2, String player3) {

        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;

    }



}
