<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/resources/css/sensorsList.css"/>" rel="stylesheet">
    <title>Sensors</title>
</head>
<body>
<h2>Sensors list</h2>
<button onclick="location.href='/'">Home</button>
<br>
<table id="myTable" style="float: left;">
    <tr>
        <th>Name</th>
        <th>rtime</th>
        <th>rvalue</th>
    </tr>
    <c:forEach var="findSensors" items="${findSensors}">
        <tr>
            <td width="25%">${findSensors.name}</td>
            <td width="25%">${findSensors.rtime}</td>
            <td width="25%">${findSensors.rvalue}</td>
        </tr>
    </c:forEach>
</table>
<table id="myTable">
    <tr>
        <th>metric</th>
    </tr>
    <c:forEach var="findMetrics" items="${findMetrics}">
        <tr>
            <td width="15%">${findMetrics.metric_name}</td>
        </tr>
    </c:forEach>
</table>

<table id="myTable" style="float: left;">
    <tr>
        <th>Name</th>
        <th>rtime</th>
        <th>rvalue</th>
    </tr>
    <c:forEach var="findSensors" items="${findSensorsM}">
        <tr>
            <td width="25%">${findSensors.name}</td>
            <td width="25%">${findSensors.rtime}</td>
            <td width="25%">${findSensors.rvalue}</td>
        </tr>
    </c:forEach>
</table>
<table id="myTable">
    <tr>
        <th>metric</th>
    </tr>
    <c:forEach var="findMetrics" items="${findMetricsM}">
        <tr>
            <td width="15%">${findMetrics.metric_name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
