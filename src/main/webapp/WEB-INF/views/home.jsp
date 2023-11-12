<%--
  Created by IntelliJ IDEA.
  User: duongson
  Date: 12/11/2023
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>StudentList</title>
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
    <h1>Quản Lý Sinh Viên</h1>
    <p>Số sinh viên hiện tại là ${list.size()} </p>
    <a href="/create" style="text-decoration-line: none">
        <button>Thêm Sinh Viên Mới</button>
    </a>
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Tên</th>
            <th>Email</th>
            <th>Đại chỉ</th>
            <th colspan="2">Chức Năng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${list}">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.email}</td>
                <td>${item.address}</td>
                <td>
                    <a href="/update&id=${item.id}">
                        <button style="background-color: blue; color: white">Sửa</button>
                    </a>
                </td>
                <td>
                    <a href="/delete&id=${item.id}">
                        <button style="background-color: red; color: white">Xóa</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</center>
</body>
</html>
