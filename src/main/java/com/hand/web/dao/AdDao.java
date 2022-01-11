package com.hand.web.dao;

import com.hand.web.entity.Ad;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Ad)表数据库访问层
 *
 * @author Stewart
 * @since 2022-01-10 19:21:57
 */
public interface AdDao {

    /**
     * 通过ID查询单条数据
     *
     * @param adId 主键
     * @return 实例对象
     */
    Ad queryById(Integer adId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ad> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ad 实例对象
     * @return 对象列表
     */
    List<Ad> queryAll(Ad ad);

    /**
     * 新增数据
     *
     * @param ad 实例对象
     * @return 影响行数
     */
    int insert(Ad ad);

    /**
     * 修改数据
     *
     * @param ad 实例对象
     * @return 影响行数
     */
    int update(Ad ad);

    /**
     * 通过主键删除数据
     *
     * @param adId 主键
     * @return 影响行数
     */
    int deleteById(Integer adId);

}