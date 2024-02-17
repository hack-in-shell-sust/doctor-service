package com.example.doctorservice.common.exceptions;


import com.example.doctorservice.common.enums.ResponseMessage;

public class JsonProcessingException extends CustomRootException {
    private static final String MESSAGE_CODE = "RT412";

    public JsonProcessingException(ResponseMessage message) {
        super(MESSAGE_CODE, message.getResponseMessage());
    }

    public JsonProcessingException(String messageKey) {
        super(MESSAGE_CODE, messageKey);
    }
}
