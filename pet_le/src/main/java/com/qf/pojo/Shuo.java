package com.qf.pojo;

import java.util.List;

public class Shuo {

    //"show": true,
    private Integer id;
    private String usericon;
    private String nickname;
    private String province;
    private String city;
    private String imgUrl;
    private String title;
    private String content;
    private Integer likeNumber;
    private List<UserIcons> userIcons;
    private Integer number;
    private List<Message> commentList;
    private Integer user_Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsericon() {
        return usericon;
    }

    public void setUsericon(String usericon) {
        this.usericon = usericon;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public List<UserIcons> getUserIcons() {
        return userIcons;
    }

    public void setUserIcons(List<UserIcons> userIcons) {
        this.userIcons = userIcons;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Message> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Message> commentList) {
        this.commentList = commentList;
    }

    public Integer getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }
}
