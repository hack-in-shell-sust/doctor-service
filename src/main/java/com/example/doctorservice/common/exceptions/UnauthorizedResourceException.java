package com.example.doctorservice.common.exceptions;


import com.example.doctorservice.common.enums.ResponseMessage;

public class UnauthorizedResourceException extends CustomRootException {
    private static final String MESSAGE_CODE = "ERPS401";

    public UnauthorizedResourceException(ResponseMessage message) {
        super(MESSAGE_CODE, message.getResponseMessage());
    }

    public UnauthorizedResourceException(String messageKey) {
        super(MESSAGE_CODE, messageKey);
    }
}
