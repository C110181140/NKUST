package game;

import java.util.Scanner;//匯入java.util包下的Scanner類，以讀取來自System.in的輸入
public class game {
    public static void main(String[] args) {

        Archer Archer = new Archer();    //建立一個弓箭手物件
        Berserker Berserker = new Berserker();    //建立一個狂戰士物件
        Magician Magician = new Magician();       //建立一個魔法師物件
        Scanner input = new Scanner(System.in);//建立一個Scanner物件input

        String role = "";    //宣告變數cole,用於獲取從控制檯輸入角色
        String opponent = "";//宣告變數opponent,用於獲取從控制檯選擇的對手
        String battle = "";    //宣告變數battle,用於選擇對戰過程
        int number = 0;      //用於記錄回合數

        //提示玩家進行選擇
        System.out.println("請選擇一個角色，並輸入角色編號：" + "\n");
        System.out.println("A:弓箭手");
        System.out.println("B:狂戰士");
        System.out.println("C:魔法師" + "\n");
        role = input.nextLine();//獲取玩家輸入的角色選擇
        System.out.println("請選擇一個對手，並輸入對手編號：" + "\n");
        System.out.println("A:弓箭手");
        System.out.println("B:狂戰士");
        System.out.println("C:魔法師" + "\n");
        opponent = input.nextLine();//獲取玩家選擇的對手

        //角色和對手不能相同
        if (role.equals(opponent)) {//字串之間的比較
            System.out.println("角色不能和對手相同,請重新選擇對手：");
            opponent = input.nextLine();//重新獲取從控制檯選擇的對手
        }

        battle = role + opponent;  //用於對戰雙方角色限定
        switch (battle) {

            //弓箭手對狂戰士
            case "AB":{
                System.out.println("");
                System.out.println("弓箭手 vs 狂戰士");
                while(Berserker.die() && Archer.die()) {     //雙方都活著，迴圈繼續
                    number++;                               //迴圈一次自增1，表示回合數
                    System.out.println("第"+number+"回合：");//每回合輸出回合數
                    if(Archer.getHr()==1) {    //弓箭手打中狂戰士
                        Berserker.kick(Archer.getAttack(),Archer.getMps());
                    }
                    if(Berserker.getHr()==1 && Berserker.getHp() > 0 ){//狂戰士當前生命值大於0（即活著），並且打中弓箭手
                        Archer.kick(Berserker.getAttack(),Berserker.getMps());
                    }
                }
                break;
            }

            //弓箭手對魔法師
            case "AC":{
                System.out.println("");
                System.out.println("弓箭手 vs 魔法師");
                while(Magician.die() && Archer.die()) {     //雙方活著，迴圈繼續
                    number++;                              //迴圈一次自增1，表示回合數
                    System.out.println("第"+number+"回合：");//每回合輸出回合數
                    if(Archer.getHr()==1 ){     //弓箭手打中魔法師
                        Magician.kick(Archer.getAttack(),Archer.getMps());
                    }
                    if(Magician.getHr()==1 && Magician.getHp() > 0) {//魔法師活著，打中弓箭手
                        Archer.kick(Magician.getAttack(),Magician.getMps());
                    }

                }
                break;
            }

            //狂戰士對魔法師
            case "BC":{
                System.out.println("");
                System.out.println("狂戰士 vs 魔法師");
                while(Magician.die() && Berserker.die()) {     //雙方或者，迴圈繼續
                    number++;                               //迴圈一次自增1，表示回合數
                    System.out.println("第"+number+"回合：");//每回合輸出回合數
                    if(Berserker.getHr()==1) {     //騎兵打中法師
                        Magician.kick(Berserker.getAttack(),Berserker.getMps());  //法師防禦
                    }
                    if(Magician.getHr()==1 && Magician.getHp() > 0) {//法師活著，打中騎兵
                        Berserker.kick(Magician.getAttack(), Magician.getMps());
                    }
                }
                break;
            }
        }

    }
    }

