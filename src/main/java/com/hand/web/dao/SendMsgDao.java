package com.hand.web.dao;


import com.hand.web.entity.SendMsg;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SendMsg)表数据库访问层
 *
 * @author Stewart
 * @since 2022-01-10 19:22:12
 */
public interface SendMsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    SendMsg queryById(Integer cId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SendMsg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sendMsg 实例对象
     * @return 对象列表
     */
    List<SendMsg> queryAll(SendMsg sendMsg);

    /**
     * 新增数据
     *
     * @param sendMsg 实例对象
     * @return 影响行数
     */
    int insert(SendMsg sendMsg);

    /**
     * 修改数据
     *
     * @param sendMsg 实例对象
     * @return 影响行数
     */
    int update(SendMsg sendMsg);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 影响行数
     */
    int deleteById(Integer cId);

}