package com.notifcation.api.exception;

public interface AbstractException {

    int getStatusCode();

    String getErrorMessage();
}
