<%--
  Created by IntelliJ IDEA.
  User: Xiaomi
  Date: 04.06.2019
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaEE Blog</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <h1>Create new Post</h1>
        <form action="${pageContext.request.contextPath}/newPost" method="post">
            <input class="form-control" name="name" placeholder="Name"><br>
            <input class="form-control" name="subject" placeholder="Subject"><br>
            <textarea class="form-control" name="text" rows="5" style="resize: none" placeholder="Text"></textarea><br>
            <button type="submit" class="btn btn-outline-primary form-control">Save</button>
        </form>
    </div>

</body>
</html>
