package com.carrot.emall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 购物车商品表
 * </p>
 *
 * @author carrot
 * @since 2020-11-11
 */
@TableName("Product_cart")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购物车id
     */
    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer prodId;

    /**
     * 商品名称
     */
    private String prodName;

    /**
     * 购物车中该商品的数量
     */
    private Integer cartProdNum;

    /**
     * 商品价格
     */
    private Double prodPrice;

    /**
     * 购物车中该商品的状态（1:可下单，2:该商品已下架，3:该商品库存不足）
     */
    private String cartProdStatus;


}
