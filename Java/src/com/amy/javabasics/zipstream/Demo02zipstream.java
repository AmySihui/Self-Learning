package com.amy.javabasics.zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Demo02zipstream {
    public static void main(String[] args) throws IOException {
        File src = new File("Java\\a.txt");
        File dest = new File("Java\\");
        toZip(src,dest);

    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        ZipEntry entry = new ZipEntry("a.txt");
        zos.putNextEntry(entry);
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
