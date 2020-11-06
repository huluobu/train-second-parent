package com.carrot.emall.entity;

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
 * @since 2020-11-06
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

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 冗余字段3
     */
    private String userRemark3;

    /**
     * 冗余字段4
     */
    private String userRemark4;

    /**
     * 冗余字段5
     */
    private String userRemark5;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserSecondName() {
        return userSecondName;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }
    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }
    public Integer getUserDefaulReaddrId() {
        return userDefaulReaddrId;
    }

    public void setUserDefaulReaddrId(Integer userDefaulReaddrId) {
        this.userDefaulReaddrId = userDefaulReaddrId;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserRemark3() {
        return userRemark3;
    }

    public void setUserRemark3(String userRemark3) {
        this.userRemark3 = userRemark3;
    }
    public String getUserRemark4() {
        return userRemark4;
    }

    public void setUserRemark4(String userRemark4) {
        this.userRemark4 = userRemark4;
    }
    public String getUserRemark5() {
        return userRemark5;
    }

    public void setUserRemark5(String userRemark5) {
        this.userRemark5 = userRemark5;
    }

    @Override
    public String toString() {
        return "UserMid{" +
            "userId=" + userId +
            ", userSecondName=" + userSecondName +
            ", userPhoneNum=" + userPhoneNum +
            ", userStatus=" + userStatus +
            ", userRoleId=" + userRoleId +
            ", userDefaulReaddrId=" + userDefaulReaddrId +
            ", userPassword=" + userPassword +
            ", userRemark3=" + userRemark3 +
            ", userRemark4=" + userRemark4 +
            ", userRemark5=" + userRemark5 +
        "}";
    }
}
