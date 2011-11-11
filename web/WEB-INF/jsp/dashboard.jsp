<%-- 
    Document   : dashboard
    Created on : 7 Nov, 2011, 3:09:46 PM
    Author     : dkannadasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#5588bb">
        <h1>eReceipts Dashboard</h1>
        <c:forEach items="${receipts}" var="entry">
                Receipt Id = ${entry.key}, Receipt Date = ${entry.value}<br>
        </c:forEach>
    </body>
</html>
