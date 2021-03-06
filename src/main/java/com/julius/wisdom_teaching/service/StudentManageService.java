package com.julius.wisdom_teaching.service;

import com.julius.wisdom_teaching.domain.entity.StudentInfo;

import java.util.List;

/**
 * author julius.zhu
 * date   2019/5/30
 * time   23:04
 * describe:
 * 学生信息维护业务层接口
 */
public interface StudentManageService {
    /**
     * 添加一条学生信息
     *
     * @param studentInfo 学生信息对象实体
     * @return 受影响的行数
     */
    Integer add(StudentInfo studentInfo);

    /**
     * 插入多个学生信息
     *
     * @param students 学生信息实体集合
     * @return 受影响的行数
     */
    Integer insertStudentInfo(List<StudentInfo> students);

    /**
     * 更新一条学生信息
     *
     * @param studentInfo 学生信息对象实体
     * @return 受影响的行数
     */
    Integer update(StudentInfo studentInfo);

    /**
     * 根据id删除一条学生信息
     *
     * @param id 学生唯一id
     * @return 受影响的行数
     */
    Integer delete(Integer id);

    /**
     * 根据用户名查询学号
     *
     * @param username 用户名
     * @return
     */
    Integer findStudentNumberByUsername(String username);

    /**
     * 添加学生学号,后续让其或者管理员自己完善
     *
     * @param number 学号
     * @param userId 用户id
     * @return 记录数
     */
    int register(Integer number, Integer userId);

    /**
     * 更新学生信息
     *
     * @param studentInfo 学生信息对象
     */
    void updateStudentInfo(StudentInfo studentInfo);

}
