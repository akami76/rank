package com.akami.app.rank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SplitTest {

    @Test
    public void doSplit(){
        char regx ='|';
        String sample_test = "김종필 별세|김종필 사망|김영삼|김영삼대통령서거|노태우|전두환|김대중|진천 김종필|김종필나이|김종필 방언|";
        String rex ="|";


        String[] testList = split(sample_test, "|");

        for (int i = 0; i < testList.length; i++) {
            String string = testList[i];
            System.out.println(string);

        }


    }


    public static String[] split(String text , String rex ) {
        if (text == null) {
            return null;
        }else{
            text = text.substring(0, text.length()-1);
        }

        List<String> list = new ArrayList<String>();



        while(text.indexOf(rex) > 0) {
            int index = text.indexOf(rex);
            if (index > 0) {
                String word = text.substring(0, index);
                list.add(word);
                System.out.println("WORD : " + word);
                text = text.substring(index+1);
                System.out.println("text : " + text);
            }
        }
        String[] testList = new String[list.size()];
        testList = list.toArray(testList);

        return testList;
    }




}
