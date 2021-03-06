package com.carrot.emall.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author carrot
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private String code;
    private String message;
    private T data;
}
