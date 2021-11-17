package main.java.com.valeryvash.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "src/main/java/com/valeryvash/javacore/chapter15";

        File f1 = new File(dirName);
        FilenameFilter ff = new OnlyExt("java");

        String dirList[] = f1.list(ff);

        for (int i = 0; i < dirList.length; i++) {
            System.out.println(dirList[i]);
        }

    }
}
