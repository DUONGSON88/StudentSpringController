<%--
  Created by IntelliJ IDEA.
  User: duongson
  Date: 12/11/2023
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Student</title>
    <style>
        table {
            border: 1px solid #000;
        }

        th, td {
            border: 1px dotted #555;
        }
    </style>
</head>
<body>
<center>
    <h3>Form Thêm Mới Sinh Viên</h3>
<table>
    <form action="/create" method="post">
   <tr>
       <th>ID</th>
       <th><input type="number" name="id"></th>
   </tr>
    <tr>
        <th>Tên</th>
        <th><input type="text" name="name"></th>
    </tr>
    <tr>
        <th>Email</th>
        <th><input type="text" name="email" ></th>
    </tr>
    <tr>
        <th>Địa chỉ</th>
        <th><input type="text" name="address"></th>
    </tr>
     <tr>
         <th colspan="2"><button type="submit">Thêm Mới</button></th>
     </tr>
    </form>
</table>
</center>
</body>
</html>
