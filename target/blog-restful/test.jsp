<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/22
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>这个是什么鬼</title>
</head>
<body>
  <cc:forEach items="1,2,3" var="index">
    ${index} <br/>
  </cc:forEach>
</body>
</html>
