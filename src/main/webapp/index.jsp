<%--
  Created by IntelliJ IDEA.
  User: rosad
  Date: 04.06.2019
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      <%--xmlns:h="http://java.sun.com/jsf/html"--%>>

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
                    <h:outputLink value="createPost.jsp">New Post 1</h:outputLink>
                    <a href="createPost.jsp">New Post 2</a>
                    <button class="btn btn-primary">Add post</button>
                </div>
                <div>
                    <c:forEach items="${requestScope.posts}" var="post">
                        <div align="left" style="background-color: lightblue; margin-bottom: 20px; padding: 20px">
                            <h2>${post.getName()}</h2>
                            <h4>${post.getSubject()}</h4>
                        </div>
                    </c:forEach>
                </div>

            </div>

        </div>
    </body>
</html>
