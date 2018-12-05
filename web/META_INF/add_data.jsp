<%--
  Created by IntelliJ IDEA.
  User: chirag
  Date: 10/17/2018
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html><head><title>Web log Entry</title></head><body bgcolor="white">

<form action="/upload-article">
    Log Entry:<br>
    <%
        String data = request.getParameter("data");
    %>

    <textarea name="data" rows="10" cols="60"> <%= data != null ? data : "" %></textarea>
    <br>
    Password: <input type="text" name="password" value="" size="30">
    <br>
    <input type="submit" value="Submit">
</form>

</body></html>
