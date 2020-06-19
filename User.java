package com.sample;


public class User {

  private long id;
  private String username;
  private String password;
  private String email;
  private String qqOpenid;
  private String wxOpenid;
  private String realName;
  private long age;
  private String phone;
  private String gender;
  private String desc;
  private java.sql.Timestamp registerTime;
  private java.sql.Timestamp loginTime;
  private String pic;
  private long look;
  private String isSecret;
  private long deptId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getQqOpenid() {
    return qqOpenid;
  }

  public void setQqOpenid(String qqOpenid) {
    this.qqOpenid = qqOpenid;
  }


  public String getWxOpenid() {
    return wxOpenid;
  }

  public void setWxOpenid(String wxOpenid) {
    this.wxOpenid = wxOpenid;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }


  public java.sql.Timestamp getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(java.sql.Timestamp registerTime) {
    this.registerTime = registerTime;
  }


  public java.sql.Timestamp getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(java.sql.Timestamp loginTime) {
    this.loginTime = loginTime;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }


  public long getLook() {
    return look;
  }

  public void setLook(long look) {
    this.look = look;
  }


  public String getIsSecret() {
    return isSecret;
  }

  public void setIsSecret(String isSecret) {
    this.isSecret = isSecret;
  }


  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }

}
