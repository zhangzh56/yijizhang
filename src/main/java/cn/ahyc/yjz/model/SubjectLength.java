package cn.ahyc.yjz.model;

import java.io.Serializable;
import java.util.Date;

public class SubjectLength implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_length.id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_length.length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private Integer length;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_length.level
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_length.book_id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private Long bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_length.company_id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private String companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_length.create_time
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject_length.modify_time
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public SubjectLength(Long id, Integer length, Integer level, Long bookId, String companyId, Date createTime, Date modifyTime) {
        this.id = id;
        this.length = length;
        this.level = level;
        this.bookId = bookId;
        this.companyId = companyId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public SubjectLength() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_length.id
     *
     * @return the value of subject_length.id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_length.id
     *
     * @param id the value for subject_length.id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_length.length
     *
     * @return the value of subject_length.length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public Integer getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_length.length
     *
     * @param length the value for subject_length.length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_length.level
     *
     * @return the value of subject_length.level
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_length.level
     *
     * @param level the value for subject_length.level
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_length.book_id
     *
     * @return the value of subject_length.book_id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_length.book_id
     *
     * @param bookId the value for subject_length.book_id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_length.company_id
     *
     * @return the value of subject_length.company_id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_length.company_id
     *
     * @param companyId the value for subject_length.company_id
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_length.create_time
     *
     * @return the value of subject_length.create_time
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_length.create_time
     *
     * @param createTime the value for subject_length.create_time
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject_length.modify_time
     *
     * @return the value of subject_length.modify_time
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject_length.modify_time
     *
     * @param modifyTime the value for subject_length.modify_time
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}