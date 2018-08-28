package com.fane.whisper.demo.config;

import com.fane.whisper.service.TranslateToolService;

public class MyTranslateToolService implements TranslateToolService {


    public String getCurrentLanguage() {

        //some exist logic to get current user language
        //for example from token or some other table
        return "en";
    }


}
