package com.fane.whisper.demo.dto;

import com.fane.whisper.annotation.I18nMapping;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ExceptionDetail {
    @I18nMapping(i18nCode = "message")
    private String message;

    @I18nMapping(i18nCode = "id")
    private String errorCode;
}