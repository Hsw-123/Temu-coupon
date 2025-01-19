package com.temu.coupon.framework.web;

import com.temu.coupon.framework.errorcode.BaseErrorCode;
import com.temu.coupon.framework.exception.AbstractException;
import com.temu.coupon.framework.result.Result;

import java.util.Optional;

public class Results {

    public static Result<Void> succuss(){
        return new Result<Void>().setCode(Result.SUCCESS_CODE);
    }

    public static <T> Result<T> succuss(T data){
        return new Result<T>().setCode(Result.SUCCESS_CODE)
                .setData(data);
    }

    protected static Result<Void> failure(){
        return new Result<Void>()
                .setCode(BaseErrorCode.SERVICE_ERROR.code())
                .setMessege(BaseErrorCode.SERVICE_ERROR.message());
    }

    protected static Result<Void> failure(AbstractException abstractException){
        String errorCode = Optional.ofNullable(abstractException.errorCode)
                .orElse(BaseErrorCode.SERVICE_ERROR.code());
        String errorMessage = Optional.ofNullable(abstractException.errorMessage)
                .orElse(BaseErrorCode.SERVICE_ERROR.message());
        return new Result<Void>()
                .setCode(errorCode)
                .setMessege(errorMessage);
    }

    protected static Result<Void> failure(String errorCode, String errorMessage) {
        return new Result<Void>()
                .setCode(errorCode)
                .setMessege(errorMessage);
    }

}
