package com.fiti.nlu.employeemanager.employeemanager.entity;

import com.fiti.nlu.employeemanager.employeemanager.validator.ExistEmployeeId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @ExistEmployeeId
    @NotBlank(message = "Mã nhân viên không được để trống")
    private String employeeId;
    @NotBlank(message = "Họ tên không được để trống")
    private String name;
    private boolean female;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "Ngày sinh không được để trống")
    private Date birthday;
    @NotBlank(message = "Địa chỉ không được để trống")
    private String address;
    private String phone;
    private String department;
    private String title;
    private long wageRate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getWageRate() {
        return wageRate;
    }

    public void setWageRate(long wageRate) {
        this.wageRate = wageRate;
    }
}
