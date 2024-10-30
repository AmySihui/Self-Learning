package com.amy.javabasics.zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo01zipstream {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\hamba\\Desktop\\aaa.zip");
        File dest = new File("C:\\Users\\hamba\\Desktop");
        unzip(src, dest);

    }

    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                File file = new File(dest, entry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();

    }

}
