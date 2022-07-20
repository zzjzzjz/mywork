package com.example.mywork.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
@author: zzjzzjz
@className: Catalogue
@packetName: com.example.mywork.entity
@description: a class of catalogue file, save its path from base path and sub file
@date: 2022-07-20
 */
public class Catalogue {
    public String path;//path from base path
    public List<String> documents;//sub file name list
    public Catalogue(String path2){
        path=path2;
        documents=new ArrayList<>();

        findDocument(path);
    }
    /*
    @author: zzjzzjz
    @methodsName: findDocument
    @description: a private method to find all document name and assign param documents
    @param: path
     */
    private void findDocument(String path){
        File file=new File(path);
        String[] strings=file.list();
        for(int i=0;i<strings.length;i++) {
            documents.add(strings[i]);
        }
    }



}
