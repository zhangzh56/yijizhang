package cn.ahyc.yjz.mapper.base;

import cn.ahyc.yjz.model.SubjectLength;
import cn.ahyc.yjz.model.SubjectLengthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectLengthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int countByExample(SubjectLengthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int deleteByExample(SubjectLengthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int insert(SubjectLength record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int insertSelective(SubjectLength record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    List<SubjectLength> selectByExample(SubjectLengthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    SubjectLength selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByExampleSelective(@Param("record") SubjectLength record, @Param("example") SubjectLengthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByExample(@Param("record") SubjectLength record, @Param("example") SubjectLengthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByPrimaryKeySelective(SubjectLength record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_length
     *
     * @mbggenerated Wed Sep 30 16:20:19 CST 2015
     */
    int updateByPrimaryKey(SubjectLength record);
}