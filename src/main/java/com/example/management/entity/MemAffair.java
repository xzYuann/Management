<<<<<<< HEAD
package com.example.management.entity;



public class MemAffair  {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mem_affair.id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mem_affair.mem_id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    private Long memId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mem_affair.affair_id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    private Long affairId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mem_affair.is_deleted
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    private Boolean isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mem_affair.id
     *
     * @return the value of mem_affair.id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mem_affair.id
     *
     * @param id the value for mem_affair.id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mem_affair.mem_id
     *
     * @return the value of mem_affair.mem_id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public Long getMemId() {
        return memId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mem_affair.mem_id
     *
     * @param memId the value for mem_affair.mem_id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public void setMemId(Long memId) {
        this.memId = memId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mem_affair.affair_id
     *
     * @return the value of mem_affair.affair_id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public Long getAffairId() {
        return affairId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mem_affair.affair_id
     *
     * @param affairId the value for mem_affair.affair_id
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public void setAffairId(Long affairId) {
        this.affairId = affairId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mem_affair.is_deleted
     *
     * @return the value of mem_affair.is_deleted
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mem_affair.is_deleted
     *
     * @param isDeleted the value for mem_affair.is_deleted
     *
     * @mbg.generated Sat Jul 18 11:00:36 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
=======
package com.example.management.entity;

public class MemAffair {
    private Long id;
    private Long memId;
    private Long affairId;
    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemId() {
        return memId;
    }

    public void setMemId(Long memId) {
        this.memId = memId;
    }

    public Long getAffairId() {
        return affairId;
    }

    public void setAffairId(Long affairId) {
        this.affairId = affairId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "MemAffair{" +
                "id=" + id +
                ", memId=" + memId +
                ", affairId=" + affairId +
                '}';
    }

}
>>>>>>> d6715d13c4105f3bad237cb16a4800213875f9be
