<jsp:useBean id="employee" scope="request" type="com.fiti.nlu.employeemanager.employeemanager.entity.Employee"/>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Employee - Detail</title>
</head>
<body>
<h1>Chi tiết nhân viên</h1>
<div class="container">
    <p>Mã nhân viên ${employee.employeeId}</p>
    <p>Họ tên ${employee.name}</p>
    <p>Nữ <input type="checkbox" ${employee.female} ? '' : checked/></p>
    <p>Ngày sinh <fmt:formatDate value="${employee.birthday}" pattern="dd/MM/yyyy" /></p>
    <p>Địa chỉ ${employee.address}</p>
    <p>Số ĐT ${employee.phone}</p>
    <p>Phòng ban ${employee.department}</p>
    <p>Chức vụ ${employee.title}</p>
    <p>Lương căn bản ${employee.wageRate}</p>
    <a href="/employee/list"><input type="button" value="Danh sách nhân viên"/></a>
    <a href="/employee/edit-employee?employeeId=${employee.employeeId}"><input type="button" value="Sửa"/></a>
</div>

</body>
</html>