<%-- 
    Document   : register
    Created on : 4 Nov, 2011, 5:37:16 PM
    Author     : dkannadasan
--%>
<%@include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>eReceipts - Register</title>
    </head>
    <body bgcolor="#5588bb">
        <h1>Register</h1>
       <c:out value ="${model.error}"/> 
    <center> 
        Enter Receipt ID from one of the physical receipt.</br>
<c:choose>
<c:when test="${model.emailId !=null}">
    Email Id: <c:out value ="${model.emailId}"/>
</c:when>
<c:otherwise >
    Mobile: <c:out value ="${model.mobile}"/>
</c:otherwise>
</c:choose>
    <form action="login.ess" method="post">
        Receipt Id: <input type="text" name="receiptId"/><br/>
        <input type="submit" value="Register" />
        <input type="hidden" name="email" value="<c:out value ="${model.emailId}"/> "/>
    </form>
      
    </center>       
    </body>
</html>
