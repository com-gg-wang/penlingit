package com.ontheroad.dao;

import com.ontheroad.entity.TbEquipmentstatus;
import com.ontheroad.entity.TbEquipmentstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEquipmentstatusMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int countByExample(TbEquipmentstatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int deleteByExample(TbEquipmentstatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int deleteByPrimaryKey(Integer statusId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int insert(TbEquipmentstatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int insertSelective(TbEquipmentstatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	List<TbEquipmentstatus> selectByExample(TbEquipmentstatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	TbEquipmentstatus selectByPrimaryKey(Integer statusId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int updateByExampleSelective(@Param("record") TbEquipmentstatus record,
			@Param("example") TbEquipmentstatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int updateByExample(@Param("record") TbEquipmentstatus record, @Param("example") TbEquipmentstatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int updateByPrimaryKeySelective(TbEquipmentstatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	int updateByPrimaryKey(TbEquipmentstatus record);
}