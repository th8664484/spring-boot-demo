package com.controller;

import com.bean.Guest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GuestController {

    @RequestMapping("/guest")
    public String add(@Valid Guest guest , BindingResult bindingResult){
        if(bindingResult.getErrorCount()>0){
            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
            StringBuffer stringBuffer = new StringBuffer();
            for(FieldError fieldError : fieldErrorList){
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return "Success";
    }
}
