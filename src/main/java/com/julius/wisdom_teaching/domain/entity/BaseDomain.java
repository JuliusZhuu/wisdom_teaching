package com.julius.wisdom_teaching.domain.entity;

/**
 * author julius.zhu
 * date   2019/9/11
 * time   20:54
 * describe:
 * 通用实体基类
 */
public class BaseDomain {
    //主键id
    private Integer id;
    //用户名
    private String username;
    //创建日期
    private String createDate;
    //更新日期
    private String updateDate;
    //当前页
    private Integer currentPage;
    //总页数
    private Integer totalPage;
    //每页显示的条数
    private Integer count;
    //总条数
    private Integer totalCount;

    public final String getUpdateDate() {
        return updateDate;
    }

    public final void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public final Integer getCurrentPage() {
        return currentPage;
    }

    public final void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public final Integer getTotalPage() {
        return totalPage;
    }

    public final void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public final Integer getCount() {
        return count;
    }

    public final void setCount(Integer count) {
        this.count = count;
    }

    public final Integer getTotalCount() {
        return totalCount;
    }

    public final void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public final String getCreateDate() {
        return createDate;
    }

    public final void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public final String getUsername() {
        return username;
    }

    public final void setUsername(String username) {
        this.username = username;
    }

}
