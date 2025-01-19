package com.temu.coupon.framework.result;

import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Result<T> implements Serializable {
    /*
    *返回码
    */
    private String code;
    /*
    * 返回消息
    */
    private String messege;
    /*
    * 返回数据体
    */
    T Data;
    /*
    * 成功返回码
    */
    public static final String SUCCESS_CODE ="0";

    public boolean isSuccess(){ return SUCCESS_CODE.equals(code);}
}
