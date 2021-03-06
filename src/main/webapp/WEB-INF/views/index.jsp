<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}findByDate" method="get">
    <label for="metricData">You can find dates from 2019.01.01 up to 2019.09.09</label><br>
    <input type="date" id="metricData" name="metricData">
    <button onclick="location.href='/findByDate'">Find</button>

</form>
<br>
<form action="/findByParameter" method="get">
    <input type="date" id="metricData" name="metricData" required>
    <label> Find by parameter<br>
        <select required name="parameter1">
            <optgroup label="Find By Metrics">
                <option  value="1">Temperature</option>
                <option  value="2">Humidity</option>
                <option  value="3">CO₂</option>
                <option  value="4">Atmospheric Pressure</option>
                <option  value="5">Voltage</option>
                <option  value="6">Current</option>
                <option  value="7">Weight</option>
            </optgroup>
        </select>
        <select required name="parameter2">
            <optgroup label="Find By Sensors">
                <option  value="22">Classroom</option>
                <option  value="34">Hall</option>
                <option  value="58">Gate</option>
                <option  value="73">Lobby</option>
                <option  value="97">Meeting room</option>
            </optgroup>
        </select>
    </label>
    <button onclick="location.href='/findByParameter'">By Parameter</button>
</form>
<button onclick="location.href='/getAllSensors'">All sensors list</button>
</body>
</html>
