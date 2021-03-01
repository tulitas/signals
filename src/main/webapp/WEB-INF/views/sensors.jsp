<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/resources/css/sensorsList.css"/>" rel="stylesheet">

    <title>Sensors</title>
</head>
<body>
<h2>Sensors list</h2>
<table id="myTable">
    <tr>
        <th>Name</th>
        <th>Serial Code</th>
    </tr>
    <c:forEach var="sensors" items="${sensors}">
        <tr>
            <td width="25%">${sensors.name}</td>
            <td width="25%">${sensors.serial_code}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
