<<<<<<< HEAD
package com.example.management.entity;



public class Department  {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.id
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.name
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.club_id
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    private Long clubId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.username
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.password
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.is_deleted
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    private Boolean isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.id
     *
     * @return the value of department.id
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.id
     *
     * @param id the value for department.id
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.name
     *
     * @return the value of department.name
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.name
     *
     * @param name the value for department.name
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.club_id
     *
     * @return the value of department.club_id
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public Long getClubId() {
        return clubId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.club_id
     *
     * @param clubId the value for department.club_id
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.username
     *
     * @return the value of department.username
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.username
     *
     * @param username the value for department.username
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.password
     *
     * @return the value of department.password
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.password
     *
     * @param password the value for department.password
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.is_deleted
     *
     * @return the value of department.is_deleted
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.is_deleted
     *
     * @param isDeleted the value for department.is_deleted
     *
     * @mbg.generated Fri Jul 17 18:55:40 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
=======
package com.example.management.entity;

public class Department extends Admin{

    private String name;
    private Long comId;
    private Integer IsDeleted;

    public Integer getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        IsDeleted = isDeleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comId=" + comId +
                '}';
    }
}
>>>>>>> d6715d13c4105f3bad237cb16a4800213875f9be
