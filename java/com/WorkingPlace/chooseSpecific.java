package com.WorkingPlace;

public class chooseSpecific {

    public int chech (int a) {
        switch (a){
            case (1):{
                System.out.println("spasibo1");
//                SQL connect = new SQL();
//                connect.connectToSQL();
                break;
            }case (2):{
                System.out.println("spasibo2");
                break;
            }case (3):{
                System.out.println("spasibo3");
                break;
            }default:
                System.out.println("Упс. Вы где-то ошиблись");
                break;
        }
        return a;
    }
}
