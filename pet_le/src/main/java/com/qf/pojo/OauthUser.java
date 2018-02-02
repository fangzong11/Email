package com.qf.pojo;

//将第三方登录的用户信息封装在此 持久化到数据库中
public class OauthUser {

    private Integer id;
    private Integer userId;
    private String oauthName;
    private String oauthId;
    private String oauthAccessToken;
    private Long oauthExpries;

    public OauthUser() {
    }

    public OauthUser(String oauthName, String oauthId, String oauthAccessToken, Long oauthExpries) {
        this.oauthName = oauthName;
        this.oauthId = oauthId;
        this.oauthAccessToken = oauthAccessToken;
        this.oauthExpries = oauthExpries;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOauthName() {
        return oauthName;
    }

    public void setOauthName(String oauthName) {
        this.oauthName = oauthName;
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId;
    }

    public String getOauthAccessToken() {
        return oauthAccessToken;
    }

    public void setOauthAccessToken(String oauthAccessToken) {
        this.oauthAccessToken = oauthAccessToken;
    }

    public Long getOauthExpries() {
        return oauthExpries;
    }

    public void setOauthExpries(Long oauthExpries) {
        this.oauthExpries = oauthExpries;
    }
}
