<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户保存页面</h1>
<form action="${pageContext.request.contextPath}/account/save" method="post">
    请输入字符串:<input type="text" name="name">
    <%--金额:<input type="text" name="money">--%>
<input type="submit" value="提交">


</form>

</body>
</html>
