package com.example.mywork;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Enumeration;

@WebServlet(value = "/testFindResource")
public class testFindResource extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("content-type","text/html;charset=UTF-8");
        OutputStream os =resp.getOutputStream();

        String rj =req.getParameter("rj");
        String num=req.getParameter("num");
        String type=req.getParameter("type");//后缀名

        String path="F:\\preResource\\series2\\"+rj+"\\"+num+"."+type;//文件完整地址
        System.out.println(path);

        //文件寻址
        File file=new File(path);
        if(type.equals("mp3")){
            resp.setContentType("audio/mp3");
        }
        else if(type.equals("wav")){
            resp.setContentType("audio/wav");
        }
        else if(type.equals("jpg")){
            resp.setContentType("image/jpg");
        }
        else if(type.equals("png")){
            resp.setContentType("image/png");
        }

        byte[] data= Files.readAllBytes(file.toPath());
        resp.setContentLength(data.length);
        os.write(data);


    }

}
