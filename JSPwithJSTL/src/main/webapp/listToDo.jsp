<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset-UTF-8" language="java" %>

<html>
<head>
    <title> My Tasks </title>
</head>

<body>
<h2> My ToDo List</h2>

<form action="complete" method="post">
    <table width="100%" border="1" align="center">
        <tr bgcolor="#a9a9a9">
            <th> Name </th>
            <th> Category </th>
            <th> Complete </th>
        </tr>
        <c:forEach var="task" items="${toDoList}">
            <tr>
                <td>${task.task}</td>
                <td>${task.category}</td>
                <td><input type="checkbox" name="completed[]" value="${task.id}"></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Update Tasks"/>
</form>

<hr>

<form action="create" method="post">
    <table width="100%" cellspacing="0" cellpadding="4">
        <tr>
            <td align="right" width="100"> Task Name: </td>
            <td><input type="text" name="task" required placeholder="Enter name" maxlength="100" size="20" </td>
        </tr>
        <tr>
            <td align="right"> Task Category </td>
            <td><input type="text" name="category" required placeholder="Enter category" maxlength="100" size="20" </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Add Task"/> </td>
        </tr>
    </table>
</form>


</body>
</html>