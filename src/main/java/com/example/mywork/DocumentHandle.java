package com.example.mywork;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.file.Files;

@WebServlet(value ="/documentHandle")
public class DocumentHandle extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/catalogue.jsp");
        String name=req.getParameter("name");
        String path=req.getParameter("path");
        String basePath="D:\\mywork\\music";
        //name = new String(name.getBytes("ISO8859-1"),"UTF-8");
        //name= URLEncoder.encode(name);
        System.out.println(name);
        System.out.println(path);

        path=basePath+path+name;
        System.out.println(path);

        File file=new File(path);

        if (file.isDirectory()){
            requestDispatcher.forward(req,resp);
        }
        else {
            OutputStream os=resp.getOutputStream();

            String type=path.split("\\.")[path.split("\\.").length-1];
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
        System.out.println("fasdasdasdasd");


    }
}
