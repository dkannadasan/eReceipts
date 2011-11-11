<%-- 
    Document   : subscribe
    Created on : 4 Nov, 2011, 1:48:52 PM
    Author     : dkannadasan
--%>
<%@include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>eReceipts - powered by Verifone</title>
    </head>
    <body bgcolor="#5588bb">
        <h1>eReceipts</h1>
        <h3>Safe.Secure.Hassle Free</h3>
    <c:out value ="${error}"/>
        
    <form action="register.ess" method="post">
    <center>
         Email ID: <input type="text" name="emailId"/><br />
         <center>or</center>
         Mobile: <input type="text" name="mobile" /><br />
         <input type="submit" value="Continue" />
    </center>
    </form>
    </body>
    
<!--    <a href="/eRecipts/addedituser.ess">Sample User Registration</a>-->
</html>
