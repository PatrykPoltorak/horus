package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileCabinet implements Cabinet{
    MultiFolderImpl multi = new MultiFolderImpl();
    public FileCabinet(){
        multi.init();
    }
    List<Folder> folders = multi.getFolders();


    void add (){

    }

    @Override
    public Optional<Folder> findFolderByName(String name) {
        for(Folder f:folders){
            if(f.getName().equals(name)){
                return Optional.of(f);
            }
        }
        return null;
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        List<Folder> l1 = new ArrayList<>();
        for(Folder l: folders){
            if(l.getSize().equals(size)){
                l1.add(l);
            }
        }
        return l1;
    }

    @Override
    public int count() {
        return folders.size();
    }
}
