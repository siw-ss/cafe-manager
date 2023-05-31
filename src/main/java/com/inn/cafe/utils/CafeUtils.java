package com.inn.cafe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//Utils are functions to use throughout all the project - repetitive functions in the app
public class CafeUtils {

    private CafeUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"messag\":\""+responseMessage+"\"}", httpStatus);
    }
}
