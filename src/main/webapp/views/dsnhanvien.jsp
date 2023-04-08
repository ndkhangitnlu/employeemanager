<jsp:useBean id="employees" scope="request" type="java.util.List"/>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee Manager</title>
</head>
<body>
    <div class="container">
        <h1>Danh sách nhân viên</h1>
        <div class="header">
            <p>Tổng số nhân viên: ${fn:length(employees)}</p>
            <a href="/employee/add"><button>Thêm nhân viên</button></a>
            <a href=""><button disabled>Xóa</button></a>
        </div>
        <div class="table">
            <table>
                <tr>
                    <th>Sửa</th>
                    <th>Chọn</th>
                    <th>Mã NV</th>
                    <th>Họ tên</th>
                    <th>Ngày sinh</th>
                </tr>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td><a href=""><input type="button" value="Sửa"/></a></td>
                        <td><input type="checkbox"/></td>
                        <td><a href="/employee/detail?employeeId=${employee.employeeId}">${employee.employeeId}</a></td>
                        <td>${employee.name}</td>
                        <td>${employee.address}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>