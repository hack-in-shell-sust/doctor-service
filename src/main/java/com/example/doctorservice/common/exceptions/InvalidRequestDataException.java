package com.example.doctorservice.common.exceptions;


import com.example.doctorservice.common.enums.ResponseMessage;

public class InvalidRequestDataException extends CustomRootException {
    private static final String MESSAGE_CODE = "ERPS400";

    public InvalidRequestDataException(ResponseMessage message) {
        super(MESSAGE_CODE, message.getResponseMessage());
    }

    public InvalidRequestDataException(String messageKey) {
        super(MESSAGE_CODE, messageKey);
    }
}
