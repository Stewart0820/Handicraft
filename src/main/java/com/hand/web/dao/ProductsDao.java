package com.hand.web.dao;


import com.hand.web.entity.Products;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Products)表数据库访问层
 *
 * @author Stewart
 * @since 2022-01-10 19:22:12
 */
public interface ProductsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param newId 主键
     * @return 实例对象
     */
    Products queryById(Integer newId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Products> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param products 实例对象
     * @return 对象列表
     */
    List<Products> queryAll(Products products);

    /**
     * 新增数据
     *
     * @param products 实例对象
     * @return 影响行数
     */
    int insert(Products products);

    /**
     * 修改数据
     *
     * @param products 实例对象
     * @return 影响行数
     */
    int update(Products products);

    /**
     * 通过主键删除数据
     *
     * @param newId 主键
     * @return 影响行数
     */
    int deleteById(Integer newId);

}