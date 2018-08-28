package com.fane.whisper.demo.config;

import com.fane.whisper.annotation.I18nTranslate;
import com.fane.whisper.demo.dto.ExceptionDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceAdvice {
    @ExceptionHandler(RuntimeException.class)
    @I18nTranslate
    public ResponseEntity<ExceptionDetail> handleValidationException(RuntimeException e) {

        ExceptionDetail detail = ExceptionDetail.builder().errorCode("e001").message("cccc").build();

        return new ResponseEntity(detail, HttpStatus.BAD_REQUEST);
    }
}