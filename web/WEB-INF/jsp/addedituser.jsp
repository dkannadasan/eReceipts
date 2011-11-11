<%-- 
    Document   : user
    Created on : 9 Nov, 2011, 4:50:00 PM
    Author     : dkannadasan
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <form name="userTO"  method="POST" action="addedituser.htm">
            <table style="width: 500px;"  border="0" align="center">
                <tbody>
                    <tr>
                        <td colspan="2" style="width: 100px;" align="center"><H3>User Registration</H3></td>
                    </tr>
                    <tr>
                        <td style="width: 100px;" >First Name</td>
                        <td >
                            <spring:bind path="UserTO.firstName">
                                <input type="text" name="${status.expression}"  maxlength="50" style="width:128px;" value="<c:out value='${status.value}' escapeXml='true'/>" >
                            </spring:bind>
                        </td>
                    </tr>

                    <tr>
                        <td style="width: 100px;" >Last Name</td>
                        <td >
                            <spring:bind path="UserTO.lastName">
                                <input type="text" name="${status.expression}"  maxlength="50" style="width:128px;" value="<c:out value='${status.value}' escapeXml='true'/>" >
                            </spring:bind>
                        </td>
                    </tr>

                    <tr>
                        <td style="width: 100px;" >Company</td>
                        <td >
                            <spring:bind path="UserTO.company">
                                <input type="text" name="${status.expression}"  maxlength="50" style="width:128px;" value="<c:out value='${status.value}' escapeXml='true'/>" >
                            </spring:bind>
                        </td>
                    </tr>

                    <tr>
                        <td style="width: 100px;" >Comments</td>
                        <td >
                            <spring:bind path="UserTO.comments">
                                <textarea name="${status.expression}" id="comments" style="width:400px;" rows="5"><c:out value='${status.value}' escapeXml='true'/></textarea>
                            </spring:bind>
                        </td>
                    </tr>

                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" name="submit" value="Submit"> 
                            <input type="reset" name="reset" value="Reset">
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>

