package com.carrot.emall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author carrot
 * @since 2020-11-05
 */
@TableName("User_Info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户真实姓名
     */
    private String userFirtname;

    /**
     * 用户性别
     */
    private String userGender;

    /**
     * 用户邮箱
     */
    private String userMail;

    /**
     * 用户地址
     */
    private String userAddr;

    /**
     * 用户状态：Y 可用,N 删除
     */
    private String userStatus;

}
