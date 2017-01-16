package ru.IldarBiktimerov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by User on 15.01.2017.
 */
public class TelBook {
    static  HashMap<String, ArrayList<String>> bd;
    static HashMap create() {
        ArrayList<String> telNum = new ArrayList<String>();
        ArrayList<String> telNum2 = new ArrayList<String>();
        ArrayList<String> telNum3 = new ArrayList<String>();
        telNum.add("+8 800 2000 500");
        telNum.add("+8 800 2000 600");
        telNum2.add("+8 800 2000 700");
        telNum3.add("+8 800 2000 800");
        telNum3.add("+8 800 2000 900");
        telNum3.add("+8 800 2000 000");

        HashMap<String,ArrayList> bd = new HashMap<String, ArrayList>();
        bd.put("Иванов И.И.", telNum);
        bd.put("Петров П.П.", telNum2);
        bd.put("Сидоров С.С.",telNum3);
        bd.put("Хасанов Р.X.",null);
        return  bd;
    }
    static void find(String fio){
        ArrayList<String> temp;
        try {
            temp = bd.get(fio);
            temp.get(0).equals(null);
            for (String s : temp)
               System.out.println(s);

        }catch (Exception e){
            System.out.println("Данных ФИО нет в телефонной книге!");
        }

    }

    public static void main(String [] args) throws IOException {
       bd= create();
       System.out.println("Для поиска номера/номеров введите ФИО абонента. Для выхода введите 'exit'.");
       while (true) {
           BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
           String strTemp = keyboardInput.readLine();
           if(strTemp.equals("exit"))
               break;
           find(strTemp);

       }
    }

}
