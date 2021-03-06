package com.julius.wisdom_teaching.domain.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * author julius.zhu
 * date   2019/9/17
 * time   11:10
 * describe:
 * 试题信息记录表
 */
@Setter
@Getter
public class ExaminationRecord extends BaseDomain {
    //试题记录id
    private Integer id;
    //问题名称
    private String question;
    //选项A
    private String selectA;
    private String selectB;
    private String selectC;
    private String selectD;
    private String selectE;
    private String selectF;
    //正确答案
    private String correct;
    //解析
    private String analyze;
    //分数
    private Double score;
    //题目类型1单选2多选3简答4填空
    private Integer questionType;
    //对应试题id
    private Integer examinationId;

    @Override
    public String toString() {
        return "ExaminationRecord{" +
                "question='" + question + '\'' +
                ", selectA='" + selectA + '\'' +
                ", selectB='" + selectB + '\'' +
                ", selectC='" + selectC + '\'' +
                ", selectD='" + selectD + '\'' +
                ", selectE='" + selectE + '\'' +
                ", selectF='" + selectF + '\'' +
                ", correct='" + correct + '\'' +
                ", analyze='" + analyze + '\'' +
                ", questionType=" + questionType +
                ", examinationId=" + examinationId +
                "} ";
    }
}
