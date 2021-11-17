package main.java.com.valeryvash.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("src/main/java/com/valeryvash/javacore/chapter20/FileDemo.java");
        p("File name " + f1.getName());
        p("Path  " + f1.getPath());
        p("Absolute path " + f1.getAbsolutePath());
        p("Parent package " + f1.getParent());
        p(f1.exists()? "exist" : "not exist");
        p((f1.canWrite()? "" : " not ") + "allowed for write" );
        p((f1.canRead()? "" : " not ") + "allowed for read" );
        p((f1.isDirectory()? "" : " not ") + "directory" );
        p((f1.isFile()? "" : " not ") + " file" );
        p((f1.isAbsolute() ? "" : " not ") + " absolute");
        p("Size: " + f1.length() + " bytes");

//        f1.deleteOnExit()
        p(f1.getFreeSpace() + "");
        p(f1.getTotalSpace()+ "");
        p(f1.getUsableSpace()+ "");
        p(f1.isHidden()+ "");
        p(f1.setLastModified(0L)+ "");
        p(f1.setReadOnly()+ "");
    }
}
