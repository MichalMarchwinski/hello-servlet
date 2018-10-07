<%--
  Created by IntelliJ IDEA.
  User: Właściciel
  Date: 07.10.2018
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Michal</title>
</head>
<body>
Moje imię to: <br/>

<%= request.getAttribute("nameMichal") %> <br/>

<c:out value="Hello my friend ${nameMichal}, sit down, and listen." />

</body>
</html>
