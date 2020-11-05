package com.carrot.email.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author carrot
 * @since 2020-11-05
 */
@TableName("User_Mid")
public class UserMid implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
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
     * 用户角色id
     */
    private Integer userRoleId;

    /**
     * 用户默认收货地址
     */
    private Integer userDefaulReaddrId;



}
