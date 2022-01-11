package com.hand.web.dao;


import com.hand.web.entity.JaveeeMember;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 开发人员信息表(JaveeeMember)表数据库访问层
 *
 * @author Stewart
 * @since 2022-01-10 19:22:11
 */
public interface JaveeeMemberDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    JaveeeMember queryById(Long mId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JaveeeMember> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param javeeeMember 实例对象
     * @return 对象列表
     */
    List<JaveeeMember> queryAll(JaveeeMember javeeeMember);

    /**
     * 新增数据
     *
     * @param javeeeMember 实例对象
     * @return 影响行数
     */
    int insert(JaveeeMember javeeeMember);

    /**
     * 修改数据
     *
     * @param javeeeMember 实例对象
     * @return 影响行数
     */
    int update(JaveeeMember javeeeMember);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 影响行数
     */
    int deleteById(Long mId);

}