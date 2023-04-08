<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add - Employee</title>
</head>
<style>
    .error {
        color: red;
        font-style: italic;
    }
</style>
<body>
<h1>Thêm nhân viên</h1>
<%--@elvariable id="employee" type="com.fiti.nlu.employeemanager.employeemanager.entity.Employee"--%>
<form:form action="/employee/add-employee" method = "POST" modelAttribute="employee">
    <div>
    <form:label path="employeeId">* Mã NV</form:label>
    <form:input path="employeeId"/>
    <form:errors path="employeeId" cssClass="error"/>
    <br/>
    </div>
    <div>
    <form:label path="name">* Họ tên</form:label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
    <br/>
    </div>
    <div>
    <form:label path="female">Nữ</form:label>
    <form:checkbox path="female"/><br/>
    </div>
    <div>
    <form:label path="birthday">* Ngày sinh</form:label>
    <form:input path="birthday"/>dd/mm/yyyy
    <form:errors path="birthday" cssClass="error"/>
    <br/>
    </div>
    <div>
    <form:label path="address">* Địa chỉ</form:label>
    <form:input path="address"/>
    <form:errors path="address" cssClass="error"/>
    <br/>
    </div>
    <div>
    <form:label path="phone">Số điện thoại </form:label>
    <form:input path="phone"/><br/>
    </div>
    <div>
    <form:label path="department">Phòng ban </form:label>
    <form:select path="department">
        <form:option value="SX">SX</form:option>
        <form:option value="KT">KT</form:option>
        <form:option value="KHTV">KHTV</form:option>
        <form:option value="BDĐ">BDĐ</form:option>
    </form:select><br/>
    </div>
    <div>
    <form:label path="title">Chức vụ </form:label>
    <form:select path="title">
        <form:option value="GĐ">GĐ</form:option>
        <form:option value="PGĐ">PGĐ</form:option>
        <form:option value="TP">TP</form:option>
        <form:option value="PP">PP</form:option>
        <form:option value="NV">NV</form:option>
    </form:select><br/>
    </div>
    <div>
    <form:label path="wageRate">Lương căn bản </form:label>
    </div>
    <div>
    <form:button>Lưu</form:button>
    <a href="/employee/list"><form:button >Hủy</form:button></a>
    </div>
</form:form>
</body>
</html>