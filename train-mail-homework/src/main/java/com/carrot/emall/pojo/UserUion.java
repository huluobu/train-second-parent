package com.carrot.emall.pojo;

import com.carrot.emall.entity.UserInfo;
import com.carrot.emall.entity.UserReaddress;
import com.carrot.emall.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: carrot
 * @Date: 2020/11/6 11:03
 * @Description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUion  {

    private Integer userId;

    /**
     * 用户昵称
     */
    private String userSecondName;

    /**
     * 用户手机号
     */
    private String userPhoneNum;

    /**
     * 用户状态
     */
    private String userStatus;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户角色
     */
    private UserRole userRole;
    /**
     * 用户信息
     */
    private UserInfo userInfo;
    /**
     * 用户收货地址
     */
    private List<UserReaddress> userReaddressList;

}
