package com.amy.javabasics.testPa;


import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        String firstNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet = "https://qm.d1xz.net/article/77426.html";
        String girlNameNet = "https://qm.d1xz.net/article/76801.html";

        String firstNameStr = HttpUtil.get(firstNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        ArrayList<String> familyNameTempList = (ArrayList<String>) ReUtil.findAll("([\\u4e00-\\u9fa5·]{4})(，|。)", firstNameStr, 1);
        ArrayList<String> boyNameList = (ArrayList<String>) ReUtil.findAll("([\\u4e00-\\u9fa5·]{2})(、|。)", boyNameStr, 1);
        ArrayList<String> girlNameList = (ArrayList<String>) ReUtil.findAll("([\\u4e00-\\u9fa5·]{2})(、|。)", girlNameStr, 1);

        ArrayList<String> firstNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                firstNameList.add(c + "");
            }
        }

        ArrayList<String> list = getInfos(firstNameList, boyNameList, girlNameList, 20, 20);
        Collections.shuffle(list);

        FileUtil.writeLines(list,"names.txt","UTF-8");


    }

    public static ArrayList<String> getInfos(ArrayList<String> firstNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boycount, int girlcount) {
        HashSet<String> boyhs = new HashSet<>();
        while (true) {
            if (boyhs.size() == boycount) {
                break;
            }
            Collections.shuffle(firstNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(firstNameList.get(0) + boyNameList.get(0));
        }

        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlcount) {
                break;
            }
            Collections.shuffle(firstNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(firstNameList.get(0) + girlNameList.get(0));
        }

        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }

        for (String girlName : girlhs) {
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-女-" + age);
        }

        return list;
    }


}
