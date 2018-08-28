package com.fane.whisper.demo.dto;

import com.fane.whisper.annotation.I18nMapping;
import lombok.Data;

@Data
public class Department {
    // this is the department id , we will translate the department name by this id
    @I18nMapping(i18nCode = "id")
    private Long departmentId;

    // this is the attribute we need to translate
    @I18nMapping(i18nCode = "name")
    private String departmentName;

    private String description;

    private Integer level;


}