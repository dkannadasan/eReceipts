<%-- 
    Document   : authenticate
    Created on : 7 Nov, 2011, 2:37:56 PM
    Author     : dkannadasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#5588bb">
        <h1>Authentication</h1>
    <form action="authorize.ess" method="post">
    <center>
        <c:when test="${message==null}">
        I am coming as null!
       </c:when>
        <h3><c:out value ="${message}"/></h3>
        Username: <input type="text" name="username"/></br>
        Password: <input type="password" name="password"/></br>
        <input type="submit" value="Login"/>
    </center>
    </form>
    </body>
</html>
