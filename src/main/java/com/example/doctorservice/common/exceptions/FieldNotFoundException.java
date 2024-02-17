package com.example.doctorservice.common.exceptions;


import com.example.doctorservice.common.enums.ResponseMessage;

public class FieldNotFoundException extends CustomRootException {
    private static final String MESSAGE_CODE = "RT410";

    public FieldNotFoundException(ResponseMessage message) {
        super(MESSAGE_CODE, message.getResponseMessage());
    }

    public FieldNotFoundException(String messageKey) {
        super(MESSAGE_CODE, messageKey);
    }

}
