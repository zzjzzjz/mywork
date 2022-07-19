<%@ page import="com.example.mywork.entity.Catalogue" %>
<%@ page import="java.net.InetAddress" %><%--
  Created by IntelliJ IDEA.
  User: 86133
  Date: 2022/7/18
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    String path="D:\\mywork\\music"+request.getParameter("path")+request.getParameter("name");
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


        out.println("<p><a href="+"http://"+ InetAddress.getLocalHost().getHostAddress()+":8090/documentHandle?name="+url+"&path="+request.getParameter("path")+request.getParameter("name")+"/>"+catalogue.documents.get(i)+"</a></p>");
        //System.out.println(url);
        //System.out.println(URLDecoder.decode(url));
    }




%>
</body>
</html>
