package com.hand.web.dao;


import com.hand.web.entity.JavaeeTeam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 开发团队表(JavaeeTeam)表数据库访问层
 *
 * @author Stewart
 * @since 2022-01-10 19:22:10
 */
public interface JavaeeTeamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teamId 主键
     * @return 实例对象
     */
    JavaeeTeam queryById(Long teamId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JavaeeTeam> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param javaeeTeam 实例对象
     * @return 对象列表
     */
    List<JavaeeTeam> queryAll(JavaeeTeam javaeeTeam);

    /**
     * 新增数据
     *
     * @param javaeeTeam 实例对象
     * @return 影响行数
     */
    int insert(JavaeeTeam javaeeTeam);

    /**
     * 修改数据
     *
     * @param javaeeTeam 实例对象
     * @return 影响行数
     */
    int update(JavaeeTeam javaeeTeam);

    /**
     * 通过主键删除数据
     *
     * @param teamId 主键
     * @return 影响行数
     */
    int deleteById(Long teamId);

}