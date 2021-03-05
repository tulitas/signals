<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/resources/css/sensorsList.css"/>" rel="stylesheet">

    <title>Sensors</title>
</head>
<body>
<h2>Sensors list</h2>

<table id="myTable" style="float: left;">
    <tr>
        <th>Name</th>
        <th>rtime</th>
        <th>rvalue</th>
    </tr>

    <c:forEach var="test" items="${test}">
        <tr>
            <td width="25%">${test.name}</td>
            <td width="25%">${test.rtime}</td>
            <td width="25%">${test.rvalue}</td>
        </tr>
    </c:forEach>

</table>
<table id="myTable">
    <tr>
        <th>metric</th>
    </tr>
    <c:forEach var="metrics" items="${metrics}">
        <tr>
            <td width="25%">${metrics.metric_name}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
