package com.amy.javabasics.testPa;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String firstNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet = "https://qm.d1xz.net/article/77426.html";
        String girlNameNet = "https://qm.d1xz.net/article/76801.html";

        String firstNameStr = webCrawler(firstNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        ArrayList<String> firstNameTempList = getData(firstNameStr,"([\\u4e00-\\u9fa5]{4})(，|。)",1);
        ArrayList<String> boyNameTempList = getData(boyNameStr,"([\\u4e00-\\u9fa5]{2})(、|。)",1);
        ArrayList<String> girlNameList = getData(girlNameStr,"([\\u4e00-\\u9fa5]{2})(、|。)",1);

        ArrayList<Character> familyNameList = new ArrayList<>();
        for (String str : firstNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c);
            }
        }

        

    }

    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group(index));
        }
        return list;
    }

    //网络爬取数据，拼接成字符串
    public static String webCrawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char)ch);
        }
        isr.close();
        return sb.toString();
    }
}
