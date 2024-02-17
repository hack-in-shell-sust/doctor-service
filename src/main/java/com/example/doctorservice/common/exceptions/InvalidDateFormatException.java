package com.example.doctorservice.common.exceptions;


import com.example.doctorservice.common.enums.ResponseMessage;

public class InvalidDateFormatException extends CustomRootException {
    private static final String MESSAGE_CODE = "RT414";

    public InvalidDateFormatException(ResponseMessage message) {
        super(MESSAGE_CODE, message.getResponseMessage());
    }

    public InvalidDateFormatException(String messageKey) {
        super(MESSAGE_CODE, messageKey);
    }
}
