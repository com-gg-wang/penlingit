package com.ontheroad.mysql.entity;

public class InformationUser {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long informationId;

    /**
     * 
     */
    private Long userId;

    /**
     * 获取
     *
     * @cgw 2017-11-13 16:52:37
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id the value for information_user.id
     *
     * @cgw 2017-11-13 16:52:37
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @cgw 2017-11-13 16:52:37
     */
    public Long getInformationId() {
        return informationId;
    }

    /**
     * 设置
     *
     * @param informationId the value for information_user.information_id
     *
     * @cgw 2017-11-13 16:52:37
     */
    public void setInformationId(Long informationId) {
        this.informationId = informationId;
    }

    /**
     * 获取
     *
     * @cgw 2017-11-13 16:52:37
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置
     *
     * @param userId the value for information_user.user_id
     *
     * @cgw 2017-11-13 16:52:37
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}