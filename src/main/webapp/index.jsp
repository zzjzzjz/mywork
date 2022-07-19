<%@ page import="com.example.mywork.entity.Catalogue" %>
<%@ page import="java.net.InetAddress" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
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
    String path="D:\\mywork\\music";
    String pathrequest="";



    Catalogue catalogue=new Catalogue(path);
    String url=" ";

    for(int i=0;i<catalogue.documents.size();i++){
        url=catalogue.documents.get(i);
        char[] ch=url.toCharArray();
        String b="";
        for(int j=0;j<ch.length;j++){
            if(ch[j]==' '){
                b=b+"+";
            }
            else {
                b=b+ch[j];
            }
        }
        url=b;


        out.println("<p><a href="+"http://"+ InetAddress.getLocalHost().getHostAddress()+":8090/documentHandle?name="+url+"&path=/"+">"+catalogue.documents.get(i)+"</a></p>");
        //System.out.println(url);
        //System.out.println(URLDecoder.decode(url));
    }




%>
</body>
</html>