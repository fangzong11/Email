package com.qf.pojo;

//将用户的信息封装
public class UserInfo {
    private  Integer id;
    private String nickname;
    private String gender;
    private String avatarURL;
    private  UserDetail userDetail;
    private  UserIdentify userIdentify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public UserIdentify getUserIdentify() {
        return userIdentify;
    }

    public void setUserIdentify(UserIdentify userIdentify) {
        this.userIdentify = userIdentify;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }
}
