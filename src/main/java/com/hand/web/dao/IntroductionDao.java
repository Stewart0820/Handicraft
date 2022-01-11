package com.hand.web.dao;


import com.hand.web.entity.Introduction;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Introduction)表数据库访问层
 *
 * @author Stewart
 * @since 2022-01-10 19:22:08
 */
public interface IntroductionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param introId 主键
     * @return 实例对象
     */
    Introduction queryById(Integer introId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Introduction> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param introduction 实例对象
     * @return 对象列表
     */
    List<Introduction> queryAll(Introduction introduction);

    /**
     * 新增数据
     *
     * @param introduction 实例对象
     * @return 影响行数
     */
    int insert(Introduction introduction);

    /**
     * 修改数据
     *
     * @param introduction 实例对象
     * @return 影响行数
     */
    int update(Introduction introduction);

    /**
     * 通过主键删除数据
     *
     * @param introId 主键
     * @return 影响行数
     */
    int deleteById(Integer introId);

}