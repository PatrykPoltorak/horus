package org.example;

import java.util.ArrayList;
import java.util.List;

public class MultiFolderImpl implements MultiFolder{
    List<Folder> folders = new ArrayList<>();

    public void init(){
        Folder f1 = new FolderImp("folder1", Size.SMALL.name());
        Folder f2 = new FolderImp("folder2", Size.SMALL.name());
        Folder f3 = new FolderImp("folder3", Size.MEDIUM.name());
        Folder f4 = new FolderImp("folder4", Size.LARGE.name());
        folders.add(f1);
        folders.add(f2);
        folders.add(f3);
        folders.add(f4);
    }

    @Override
    public List<Folder> getFolders() {
        return folders;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getSize() {
        return null;
    }

}
