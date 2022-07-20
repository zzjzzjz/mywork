<%@ page import="com.example.mywork.entity.Catalogue" %>
<%@ page import="java.net.InetAddress" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="com.example.mywork.util.URLNormalize" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        p{
            font-size: 30px;
        }
    </style>
</head>
<body>
<%

    String path="D:\\mywork\\music";//Base path

    Catalogue catalogue=new Catalogue(path);//
    String url=" ";

    for(int i=0;i<catalogue.documents.size();i++){
        url=catalogue.documents.get(i);
        url= URLNormalize.normalize(url);


        out.println("<p><a href="+"http://"+ InetAddress.getLocalHost().getHostAddress()+":8090/documentHandle?name="+url+"&path=/"+">"+catalogue.documents.get(i)+"</a></p>");
        //System.out.println(url);
        //System.out.println(URLDecoder.decode(url));
    }




%>
</body>
</html>