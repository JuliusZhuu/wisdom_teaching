package com.julius.wisdom_teaching.repository;

import com.julius.wisdom_teaching.domain.entity.StudentInfo;
import com.julius.wisdom_teaching.domain.entity.User;

import java.util.List;

/**
 * author julius.zhu
 * date   2019/5/29
 * time   17:56
 * describe:
 * 用户信息持久层接口
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户信息实体对象
     */
    User findUserByUsername(String username);

    /**
     * 检查登录
     *
     * @param user 用户信息对象实体
     * @return 用户信息实体对象
     */
    User loginCheck(User user);

    /**
     * 用户修改密码
     *
     * @param user 用户信息对象
     * @return 受影响的行数
     */
    Integer alterPassWord(User user);

    /**
     * 用户信息查询
     *
     * @return
     */
    List<User> queryUser();

    /**
     * 添加一个用户,返回受影响的行数
     *
     * @param user 用户信息对象
     * @return 受影响的行数
     */
    Integer addOne(User user);

    /**
     * 更新一条学生信息
     *
     * @param studentInfo 学生信息对象
     * @return 受影响的行数
     */
    Integer updateStudent(StudentInfo studentInfo);
}
