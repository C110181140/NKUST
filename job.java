public class job {

    int hp;
    int mp;
    int at;
    String name;

    job(String Name,int HP,int MP, int AT){

        name = Name;
        hp = HP;
        mp = MP;
        at = AT;

    }

    void get(){

        System.out.println("Job:"+name);
        System.out.println("Hp:"+hp);
        System.out.println("Mp:"+mp);
        System.out.println("Att:"+at);

    }

}
