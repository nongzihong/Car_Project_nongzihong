<%@ page import="java.util.List" %>
<%@ page import="com.nf147.MyCar.entity.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Car cars = (Car) request.getAttribute("cars");%>
<form action="/Car/update" method="post">
    <div class="form-group has-success">
        <input type="hidden"  class="form-control" id="inputSuccess1" name="id" value="<%=cars.getId()%>" aria-describedby="helpBlock2">
    </div>
    <div class="form-group has-warning">
        <label class="control-label" for="inputWarning1">品牌</label>
        <input type="text" class="form-control" id="inputWarning1" value="<%=cars.getName()%>" name="name">
    </div>
    <div class="form-group has-error">
        <label class="control-labe2" for="inputError2">价格</label>
        <input type="text" class="form-control" id="inputError2" name="price" value="<%=cars.getPrice()%>">
    </div>
    <div class="form-group has-error">
        <label class="control-label" for="inputError3">颜色</label>
        <input type="text" class="form-control" id="inputError3" name="color" value="<%=cars.getColor()%>">
    </div>

    <div class="form-group has-error">
        <label class="control-label" for="inputError4">制造厂商</label>
        <input type="text" class="form-control" id="inputError4" name="manufacturer" value="<%=cars.getManufacturer()%>">
    </div>
    <div class="form-group has-error">
        <input type="submit" class="form-control" value="确定">
    </div>
</form>
</body>
</html>
