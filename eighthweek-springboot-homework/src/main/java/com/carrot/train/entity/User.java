package com.carrot.train.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 5237730257103305078L;

    @ExcelProperty("id")
    private Integer id;
    @ExcelProperty("username")
    private String username;
    @ExcelProperty("password")
    private String password;
    @ExcelProperty("email")
    private String email;
    @ExcelProperty("status")
    private String status;


}
