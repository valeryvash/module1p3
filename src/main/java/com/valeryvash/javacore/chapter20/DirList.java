package main.java.com.valeryvash.javacore.chapter20;

import java.io.File;
import java.util.Arrays;

public class DirList {
    public static void main(String[] args) {
        String dirName = "src/main/java/com/valeryvash/javacore";
        File f1 = new File(dirName);

        if (f1.isDirectory()) {
            System.out.println("Directory " + dirName);
            String[] dirList = f1.list();

            for (int i = 0; i < dirList.length; i++) {
                File f = new File(dirName + "\\" +dirList[i]);

                if (f.isDirectory()) {
                    System.out.println(f.getName() + " is directory");
                } else {
                    System.out.println(f.getName() + " is file");
                }
            }
        } else {
            System.out.println(dirName + " is not directory");
        }

    }
}
