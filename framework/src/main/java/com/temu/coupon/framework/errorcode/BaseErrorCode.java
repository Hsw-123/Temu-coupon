package com.temu.coupon.framework.errorcode;

public enum BaseErrorCode implements IErrorCode{
    //客户端错误
    CLIENT_ERROR("A000001","客户端错误"),
    //服务端错误
    SERVICE_ERROR("B000001","服务端错误"),
    //第三方出错
    REMOTE_ERROR("C000001","第三方出错");
    BaseErrorCode(String code,String messege){
        this.code=code;
        this.message=messege;
    }
    private String code;
    private String message;

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
