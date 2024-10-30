package com.amy.javabasics.commonsIO;

import cn.hutool.core.io.FileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01CommonsIO {
    public static void main(String[] args) throws IOException {
        //File src = new File("Java\\a.txt");
        //File file1 = new File("Java\\copy.txt");
        //FileUtils.copyFile(src,dest);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //File file = FileUtil.appendLines(list, "C:\\Users\\hamba\\Desktop\\123.txt", "UTF-8");
        //System.out.println(file);

        List<String> strings = FileUtil.readLines("C:\\Users\\hamba\\Desktop\\123.txt", "UTF-8");
        System.out.println(strings);
    }
}
