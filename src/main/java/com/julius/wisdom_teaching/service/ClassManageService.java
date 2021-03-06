package com.julius.wisdom_teaching.service;

import com.julius.wisdom_teaching.domain.entity.OnlineCheckName;

import java.util.List;

/**
 * author julius.zhu
 * date   2019/9/11
 * time   17:44
 * describe:
 * 课堂管理业务层
 */
public interface ClassManageService {
    /**
     * 考堂考勤
     *
     * @param onlineCheckNames 考勤信息对象
     * @return
     */
    String onlineCheckName(OnlineCheckName[] onlineCheckNames);

    /**
     * 根据学生id查询学生考勤信息
     *
     * @param userId    添加者id
     * @param studentId 学生id
     * @return 考勤信息对象集合
     */
    List<OnlineCheckName> studentOnlineCheck(Integer userId, Integer studentId);
}
