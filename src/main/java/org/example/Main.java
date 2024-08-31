package org.example;

public class Main {
    public static void main(String[] args) {

        FileCabinet file = new FileCabinet();

        System.out.println("SMALL:");
        System.out.println(file.findFoldersBySize(Size.SMALL.name()));
        System.out.println("--------------------------------------------");
        System.out.println("MEDIUM:");
        System.out.println(file.findFoldersBySize(Size.MEDIUM.name()));
        System.out.println("--------------------------------------------");
        System.out.println("LARGE:");
        System.out.println(file.findFoldersBySize(Size.LARGE.name()));
        System.out.println("--------------------------------------------");
        System.out.println("findFolderByName:");
        System.out.println(file.findFolderByName("folder1"));
        System.out.println("--------------------------------------------");
        System.out.println(file.count());
        System.out.println("--------------------------------------------");
    }
}