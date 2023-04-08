package com.fiti.nlu.employeemanager.employeemanager.controller;

import com.fiti.nlu.employeemanager.employeemanager.entity.Employee;
import com.fiti.nlu.employeemanager.employeemanager.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(value="/list")
    public String getEmployeeList(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "dsnhanvien";
    }
    @GetMapping(value="/detail")
    public String getEmployeeDetail(Model model, @RequestParam String employeeId) {
        model.addAttribute("employee", employeeService.getEmployeeById(employeeId).get());
        return "chitietnhanvien";
    }
    @GetMapping(value="/add")
    public String getAddEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "themnhanvien";
    }
    @PostMapping(value="/add-employee")
    public String postAddEmployee(Model model, @Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/employee/add";
        }
        employeeService.addEmployee(employee);
        return "redirect:/employee/list";
    }

    @GetMapping(value="/edit-employee")
    public String postEditEmployee(Model model, @RequestParam String employeeId) {
       model.addAttribute("employee", employeeService.getEmployeeById(employeeId).get());
         return "suanhanvien";
    }
    @PostMapping(value="/edit")
    public String postEditEmployee(Model model, @ModelAttribute("employee") Employee employee) {
        Employee employeeEdit = employeeService.getEmployeeById(employee.getEmployeeId()).get();
        employeeEdit.setName(employee.getName());
        employeeEdit.setAddress(employee.getAddress());
        employeeEdit.setBirthday(employee.getBirthday());
        employeeEdit.setDepartment(employee.getDepartment());
        employeeEdit.setFemale(employee.isFemale());
        employeeEdit.setTitle(employee.getTitle());
        employeeEdit.setWageRate(employee.getWageRate());
        employeeEdit.setPhone(employee.getPhone());
        employeeService.addEmployee(employeeEdit);
        return "redirect:/employee/list";
    }
}
