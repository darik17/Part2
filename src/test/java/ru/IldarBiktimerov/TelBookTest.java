package ru.IldarBiktimerov;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by User on 16.01.2017.
 */
public class TelBookTest {
    @Before
    public void create() throws Exception {
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
        assertEquals(bd,TelBook.create());
        assertNotNull(bd);


    }

    @Test
    public void find() throws Exception {
        String fio1="Иванов И.И.";
        String fio2="AAAAAAAA";
        String fio3="Хасанов Р.X.";
        String fio4="";
        TelBook.find(fio4);

    }

}