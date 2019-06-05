<%--
  Created by IntelliJ IDEA.
  User: rosad
  Date: 04.06.2019
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>JavaEE Blog</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </head>
    <body>
    <div class="container">
        <div align="center">
            <div>
                <h1>JavaEE Blog</h1>
            </div>

            <div align="right">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/newPost">New Post 2</a>
            </div>
            <div style="margin-top: 20px">
                <c:forEach items="${requestScope.posts}" var="post">
                    <div style="background-color: lightblue; margin-bottom: 20px; padding: 20px;">
                        <h2>${post.getName()}</h2>
                        <h4>${post.getSubject()}</h4>
                        <a style="color: white" href="${pageContext.request.contextPath}/readPost?id=${post.getId()}" >Read</a>
                    </div>
                </c:forEach>
            </div>

        </div>

    </div>
    </body>
</html>