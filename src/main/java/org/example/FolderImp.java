package org.example;

public class FolderImp implements Folder{
    private String name;
    private String size;

    public FolderImp(String name, String size){
        this.name = name;
        this.size = size;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
