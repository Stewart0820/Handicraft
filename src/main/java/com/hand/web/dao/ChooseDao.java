package com.hand.web.dao;


import com.hand.web.entity.Choose;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Why Choose Us(Choose)表数据库访问层
 *
 * @author Stewart
 * @since 2022-01-10 19:22:06
 */
public interface ChooseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Choose queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Choose> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param choose 实例对象
     * @return 对象列表
     */
    List<Choose> queryAll(Choose choose);

    /**
     * 新增数据
     *
     * @param choose 实例对象
     * @return 影响行数
     */
    int insert(Choose choose);

    /**
     * 修改数据
     *
     * @param choose 实例对象
     * @return 影响行数
     */
    int update(Choose choose);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}