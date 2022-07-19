package com.example.mywork.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Catalogue {//目录实体类
    public String path;//目录绝对路径
    public List<String> documents;//文件名字
    public Catalogue(String path2){
        path=path2;
        documents=new ArrayList<>();

        findDocument(path);
    }
    private void findDocument(String path){
        File file=new File(path);
        String[] strings=file.list();
        for(int i=0;i<strings.length;i++) {
            documents.add(strings[i]);
        }
    }



}
