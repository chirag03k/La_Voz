<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page import="org.lavoz.website.Article"%>
<%@ page import="java.util.ArrayList" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article Browser</title>
    <meta contentType="text/html;charset=UTF-8" language="java">
    <link rel="stylesheet" href="Stylesheet.css">
    <meta name="google" content="notranslate">
</head>
<body>

<div class="fixedwidth">
    <div class="logo">
        <h1>LA VOZ</h1>
        <span class="date">
            <% out.println((new java.util.Date()).toString());%>
        </span>
    </div>
    <div class="description">
        Mira Loma High School Newspaper
    </div>
    <ul class="list">
        <li><a href="/browse/?type=News">News</a></li>
        <li><a href="/browse/?type=Features">Features</a></li>
        <li><a href="/browse/?type=Sports">Sports</a></li>
        <li><a href="/browse/?type=Student-Voices">Student Voices</a></li>
        <li><a href="/browse/?type=About">About Us</a></li>
    </ul>

    <c: set var="numToPrint" value="0"></c:>
    <c:forEach var="i" begin="numToPrint" end="numToPrint+10">
        <div class="Article">
            <a href="link to article page"><img class="image" src="${articles[i].imagePath}"></a>
            <h1 class="toptitle"><a href="link to article page"><c:out value="${articles[i].title}"/></a></h1>
            <p class="preview"><c:out value="${articles[i].preview}"/></p>
        </div>
    </c:forEach>


</div>

</body>
</html>
