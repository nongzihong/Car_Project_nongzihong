<%@ page import="com.nf147.MyCar.entity.Car" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    span {
        color: darkcyan;
        font-size: 30px
    }

    li {
        font-size: 30px;
        color: black;
    }

    a {
        text-decoration: none;
    }
</style>
<body>
<%--
<% Car phone= (Car) request.getAttribute("phones");%>
<h1><a href="/phone">＜</a></h1>
    <h1><%=phone.getName()%></h1>
    <ul>
        <span>价格:</span>
        <li><%=phone.getPrice()%></li>
        <span>颜色:</span>
        <li><%=phone.getColor()%></li>
        <span>出厂地:</span>
        <li><%=phone.getManufacturer()%></li>
    </ul>
--%>
<h1><a href="/car">＜</a></h1>
<h1>${requestScope.cars.name}</h1>
<ul>
    <span>价格:</span>
    <li>${requestScope.cars.price}</li>
    <span>颜色:</span>
    <li>${requestScope.cars.color}</li>
    <span>出厂地:</span>
    <li>${requestScope.cars.manufacturer}</li>
</ul>

</body>
</html>
