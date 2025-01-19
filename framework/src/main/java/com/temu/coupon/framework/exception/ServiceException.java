package com.temu.coupon.framework.exception;

import com.temu.coupon.framework.errorcode.BaseErrorCode;
import com.temu.coupon.framework.errorcode.IErrorCode;

public class ServiceException extends AbstractException{

    public ServiceException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ServiceException(String message) {
        this(message, null, BaseErrorCode.SERVICE_ERROR);
    }

    public ServiceException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }
    public ServiceException(String message, Throwable throwable, IErrorCode errorCode){
        super(message,throwable,errorCode);
    }
    @Override
    public String toString() {
        return "ServiceException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
