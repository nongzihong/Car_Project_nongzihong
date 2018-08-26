<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
<link href="dashboard.css" rel="stylesheet">
<head>
    <title>Title</title>
</head>
<style>
    #body {
        width: 80%;
        height: auto;
        position: absolute;
        top: 50px;
        left: 200px;
        text-align: center;
        color: black;
        font-size: 30em;
    }

    th {
        color: blue;
    }
</style>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">nf147汽车商城</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">首页</a></li>
                <li><a href="#">设置</a></li>
                <li><a href="#">帮助</a></li>
            </ul>
            <form class="navbar-form navbar-right" action="/Car/q">
                <input type="text" class="form-control" name="name" placeholder="查询条件(名字)">
            </form>
        </div>
    </div>
</nav>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
                <li><a href="/car">产品列表</a></li>
                <li><a href="/jsp/Car_Add.jsp">添加产品</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="">订单管理</a></li>
                <li><a href="">库存管理</a></li>
                <li><a href="">用户管理</a></li>
                <li><a href="">导出数据</a></li>
                <li><a href="">系统设置</a></li>
            </ul>
        </div>
    </div>
</div>

<div id="body">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">编号</th>
            <th scope="col">品牌</th>
            <th scope="col">价格</th>
            <th scope="col">颜色</th>
            <th scope="col">制造厂商</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="cars" items="${requestScope.cars}">
            <tr>
                <td>${cars.id}</td>
                <td><a href="/Car/Det?id=${cars.id}">${cars.name}</a></td>
                <td><fmt:formatNumber type="currency" value="${cars.price}"/></td>
                <td>${cars.color}</td>
                <td>${cars.manufacturer}</td>
                <td><a href="/Car/del?id=${cars.id}">删除</a>
                    <a href="/Car/update?id=${cars.id}">更新</a>
                    <a href="/jsp/Car_Add.jsp">添加</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="../../assets/js/vendor/holder.min.js"></script>
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
