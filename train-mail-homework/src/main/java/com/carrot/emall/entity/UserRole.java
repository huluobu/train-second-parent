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
@TableName("User_Role")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色菜单权限
     */
    private String roleMenus;

    /**
     * 角色状态：Y 可用,N 删除
     */
    private String roleStatus;

}
