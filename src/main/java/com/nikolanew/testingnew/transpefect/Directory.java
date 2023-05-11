package com.nikolanew.testingnew.transpefect;

import java.io.File;

public class Directory {


    public static String findLongestFileName(String path) {
        File root = new File(path);

        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Doesn't exist or is not directory.");
            return null;
        }

        String longest = "";
        for (File file : root.listFiles()) {
            if (file.isDirectory()) {
                String subdirectoryLongestFileName = findLongestFileName(file.getAbsolutePath());
                if (subdirectoryLongestFileName != null && subdirectoryLongestFileName.length() > longest.length()) {
                    longest = subdirectoryLongestFileName;
                }
            } else {
                String fileName = file.getName();
                if (fileName.length() > longest.length()) {
                    longest = fileName;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\nikola\\Documents\\test.txt";
        String lf = findLongestFileName(path);
        System.out.println("The longest file name: " + lf);
    }
}
