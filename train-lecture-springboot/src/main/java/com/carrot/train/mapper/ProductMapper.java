package com.carrot.train.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.carrot.train.model.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 产品mapper
 * @author: Lance
 * @create: 2020-10-23
 **/
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
