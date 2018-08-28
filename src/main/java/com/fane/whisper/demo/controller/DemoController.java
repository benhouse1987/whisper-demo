package com.fane.whisper.demo.controller;

import com.fane.whisper.annotation.I18nTranslate;
import com.fane.whisper.demo.dto.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping(value = "/getOneDepartment")
    @I18nTranslate
    @ResponseBody
    public Department getOneDepartment() {
        Department department = new Department();
        department.setDepartmentId(1L);
        department.setDepartmentName("english department name");
        department.setDescription("english description");
        department.setLevel(0);
        throw new RuntimeException("i18n exception test");

    }
}
