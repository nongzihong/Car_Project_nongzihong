<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<html>
<head>
    <title>添加产品</title>
</head>
<body>
<form action="/Car/add" method="post">
<div class="form-group has-success">
    <label class="control-label" for="inputSuccess1">编号</label>
    <input type="text" class="form-control" id="inputSuccess1" name="id" aria-describedby="helpBlock2">
</div>
<div class="form-group has-warning">
    <label class="control-label" for="inputWarning1">品牌</label>
    <input type="text" class="form-control" id="inputWarning1" name="name">
</div>
<div class="form-group has-error">
    <label class="control-labe2" for="inputError2">价格</label>
    <input type="text" class="form-control" id="inputError2" name="price">
</div>
<div class="form-group has-error">
    <label class="control-label" for="inputError3">颜色</label>
    <input type="text" class="form-control" id="inputError3" name="color">
</div>

<div class="form-group has-error">
    <label class="control-label" for="inputError4">制造厂商</label>
    <input type="text" class="form-control" id="inputError4" name="manufacturer">
</div>
<div class="form-group has-error">
    <input type="submit" class="form-control" value="确定">
</div>
</form>
</body>
</html>
