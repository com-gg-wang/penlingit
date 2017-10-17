package com.ontheroad.dao;

import com.ontheroad.entity.TbNewsinformation;
import com.ontheroad.entity.TbNewsinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNewsinformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int countByExample(TbNewsinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int deleteByExample(TbNewsinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int insert(TbNewsinformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int insertSelective(TbNewsinformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    List<TbNewsinformation> selectByExampleWithBLOBs(TbNewsinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    List<TbNewsinformation> selectByExample(TbNewsinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    TbNewsinformation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbNewsinformation record, @Param("example") TbNewsinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") TbNewsinformation record, @Param("example") TbNewsinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int updateByExample(@Param("record") TbNewsinformation record, @Param("example") TbNewsinformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int updateByPrimaryKeySelective(TbNewsinformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(TbNewsinformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newsinformation
     *
     * @mbggenerated Tue Oct 17 16:17:00 CST 2017
     */
    int updateByPrimaryKey(TbNewsinformation record);
}