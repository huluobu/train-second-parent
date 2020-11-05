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
 * @since 2020-11-05
 */
@TableName("User_ReAddress")
public class UserReaddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收货地址主键
     */
    @TableId(value = "addr_id", type = IdType.AUTO)
    private Integer addrId;

    /**
     * 绑定用户id
     */
    private String userId;

    /**
     * 省直辖市
     */
    private String addrProvince;

    /**
     * 市
     */
    private String addrCity;

    /**
     * 详细地址
     */
    private String addrDetail;

    /**
     * 联系人
     */
    private String addrContactPerson;

    /**
     * 联系人手机号
     */
    private String addrContactPersonPhoneNo;

}
