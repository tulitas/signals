<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}findByDate" method="get">
    <input type="text" id="metricDate" name="metricDate">
<button onclick="location.href='/getAllSensors'">Sensors</button>
</form>
</body>
</html>
