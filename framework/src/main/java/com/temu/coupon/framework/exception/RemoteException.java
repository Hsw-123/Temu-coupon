package com.temu.coupon.framework.exception;

import com.temu.coupon.framework.errorcode.BaseErrorCode;
import com.temu.coupon.framework.errorcode.IErrorCode;

public class RemoteException extends AbstractException{

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message,Throwable throwable, IErrorCode errorCode){
        super(message,throwable,errorCode);
    }
    @Override
    public String toString() {
        return "RemoteException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
