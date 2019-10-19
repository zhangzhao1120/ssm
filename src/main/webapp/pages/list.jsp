<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" >
    <tr>
        <th>编号</th>
        <th>原字符串</th>
        <th>大写</th>
        <th>小写</th>
        <th>其他</th>
    </tr>
    <c:forEach items="${map}" var="map">
        <tr>
            <td>${map.id}</td>
            <td>${map.self}</td>
            <td>${map.daxie}</td>
            <td>${map.xiaoxie}</td>
            <td>${map.qita}</td>

        </tr>
    </c:forEach>

</table>

</body>
</html>
