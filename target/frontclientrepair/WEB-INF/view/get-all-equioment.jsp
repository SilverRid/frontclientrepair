<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tekhnik
  Date: 26.01.2022
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get all Equipment</title>
</head>
<body>
<h2>Get equipments for repair</h2>
<table>
    <tr>
        <th>Name</th>
        <th>PartNumber</th>
        <th>SerialNumber</th>
        <th>Malfunction</th>
        <th>Status</th>
    </tr>
        <jsp:useBean id="allequip" scope="request" type="java.util.List"/>
        <c:forEach var="equp" items="${allequip}">
            <tr>
                <td>${equp.eqName}</td>
                <td>${equp.eqName}</td>
                <td>${equp.eqName}</td>
                <td>${equp.eqName}</td>
                <td>${equp.eqName}</td>
            </tr>


        </c:forEach>



</table>

</body>
</html>
