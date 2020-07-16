package com.example.management.mLogin.pojo;

public class Club extends Admin {
    private String name;
    private String logo;     //url
    private String intro;
    protected Integer isDeleted;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", clubName='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
