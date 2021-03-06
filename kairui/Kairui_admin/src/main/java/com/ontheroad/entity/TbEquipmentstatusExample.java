package com.ontheroad.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbEquipmentstatusExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public TbEquipmentstatusExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andStatusIdIsNull() {
			addCriterion("status_id is null");
			return (Criteria) this;
		}

		public Criteria andStatusIdIsNotNull() {
			addCriterion("status_id is not null");
			return (Criteria) this;
		}

		public Criteria andStatusIdEqualTo(Integer value) {
			addCriterion("status_id =", value, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdNotEqualTo(Integer value) {
			addCriterion("status_id <>", value, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdGreaterThan(Integer value) {
			addCriterion("status_id >", value, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("status_id >=", value, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdLessThan(Integer value) {
			addCriterion("status_id <", value, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
			addCriterion("status_id <=", value, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdIn(List<Integer> values) {
			addCriterion("status_id in", values, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdNotIn(List<Integer> values) {
			addCriterion("status_id not in", values, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdBetween(Integer value1, Integer value2) {
			addCriterion("status_id between", value1, value2, "statusId");
			return (Criteria) this;
		}

		public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
			addCriterion("status_id not between", value1, value2, "statusId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdIsNull() {
			addCriterion("equipment_id is null");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdIsNotNull() {
			addCriterion("equipment_id is not null");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdEqualTo(Integer value) {
			addCriterion("equipment_id =", value, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdNotEqualTo(Integer value) {
			addCriterion("equipment_id <>", value, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdGreaterThan(Integer value) {
			addCriterion("equipment_id >", value, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("equipment_id >=", value, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdLessThan(Integer value) {
			addCriterion("equipment_id <", value, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdLessThanOrEqualTo(Integer value) {
			addCriterion("equipment_id <=", value, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdIn(List<Integer> values) {
			addCriterion("equipment_id in", values, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdNotIn(List<Integer> values) {
			addCriterion("equipment_id not in", values, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdBetween(Integer value1, Integer value2) {
			addCriterion("equipment_id between", value1, value2, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andEquipmentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("equipment_id not between", value1, value2, "equipmentId");
			return (Criteria) this;
		}

		public Criteria andWorkstatusIsNull() {
			addCriterion("workStatus is null");
			return (Criteria) this;
		}

		public Criteria andWorkstatusIsNotNull() {
			addCriterion("workStatus is not null");
			return (Criteria) this;
		}

		public Criteria andWorkstatusEqualTo(String value) {
			addCriterion("workStatus =", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusNotEqualTo(String value) {
			addCriterion("workStatus <>", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusGreaterThan(String value) {
			addCriterion("workStatus >", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusGreaterThanOrEqualTo(String value) {
			addCriterion("workStatus >=", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusLessThan(String value) {
			addCriterion("workStatus <", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusLessThanOrEqualTo(String value) {
			addCriterion("workStatus <=", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusLike(String value) {
			addCriterion("workStatus like", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusNotLike(String value) {
			addCriterion("workStatus not like", value, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusIn(List<String> values) {
			addCriterion("workStatus in", values, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusNotIn(List<String> values) {
			addCriterion("workStatus not in", values, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusBetween(String value1, String value2) {
			addCriterion("workStatus between", value1, value2, "workstatus");
			return (Criteria) this;
		}

		public Criteria andWorkstatusNotBetween(String value1, String value2) {
			addCriterion("workStatus not between", value1, value2, "workstatus");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastIsNull() {
			addCriterion("voicebroadcast is null");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastIsNotNull() {
			addCriterion("voicebroadcast is not null");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastEqualTo(String value) {
			addCriterion("voicebroadcast =", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastNotEqualTo(String value) {
			addCriterion("voicebroadcast <>", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastGreaterThan(String value) {
			addCriterion("voicebroadcast >", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastGreaterThanOrEqualTo(String value) {
			addCriterion("voicebroadcast >=", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastLessThan(String value) {
			addCriterion("voicebroadcast <", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastLessThanOrEqualTo(String value) {
			addCriterion("voicebroadcast <=", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastLike(String value) {
			addCriterion("voicebroadcast like", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastNotLike(String value) {
			addCriterion("voicebroadcast not like", value, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastIn(List<String> values) {
			addCriterion("voicebroadcast in", values, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastNotIn(List<String> values) {
			addCriterion("voicebroadcast not in", values, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastBetween(String value1, String value2) {
			addCriterion("voicebroadcast between", value1, value2, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVoicebroadcastNotBetween(String value1, String value2) {
			addCriterion("voicebroadcast not between", value1, value2, "voicebroadcast");
			return (Criteria) this;
		}

		public Criteria andVolumeIsNull() {
			addCriterion("volume is null");
			return (Criteria) this;
		}

		public Criteria andVolumeIsNotNull() {
			addCriterion("volume is not null");
			return (Criteria) this;
		}

		public Criteria andVolumeEqualTo(String value) {
			addCriterion("volume =", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeNotEqualTo(String value) {
			addCriterion("volume <>", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeGreaterThan(String value) {
			addCriterion("volume >", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeGreaterThanOrEqualTo(String value) {
			addCriterion("volume >=", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeLessThan(String value) {
			addCriterion("volume <", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeLessThanOrEqualTo(String value) {
			addCriterion("volume <=", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeLike(String value) {
			addCriterion("volume like", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeNotLike(String value) {
			addCriterion("volume not like", value, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeIn(List<String> values) {
			addCriterion("volume in", values, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeNotIn(List<String> values) {
			addCriterion("volume not in", values, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeBetween(String value1, String value2) {
			addCriterion("volume between", value1, value2, "volume");
			return (Criteria) this;
		}

		public Criteria andVolumeNotBetween(String value1, String value2) {
			addCriterion("volume not between", value1, value2, "volume");
			return (Criteria) this;
		}

		public Criteria andTemperatureIsNull() {
			addCriterion("temperature is null");
			return (Criteria) this;
		}

		public Criteria andTemperatureIsNotNull() {
			addCriterion("temperature is not null");
			return (Criteria) this;
		}

		public Criteria andTemperatureEqualTo(String value) {
			addCriterion("temperature =", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureNotEqualTo(String value) {
			addCriterion("temperature <>", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureGreaterThan(String value) {
			addCriterion("temperature >", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
			addCriterion("temperature >=", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureLessThan(String value) {
			addCriterion("temperature <", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureLessThanOrEqualTo(String value) {
			addCriterion("temperature <=", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureLike(String value) {
			addCriterion("temperature like", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureNotLike(String value) {
			addCriterion("temperature not like", value, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureIn(List<String> values) {
			addCriterion("temperature in", values, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureNotIn(List<String> values) {
			addCriterion("temperature not in", values, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureBetween(String value1, String value2) {
			addCriterion("temperature between", value1, value2, "temperature");
			return (Criteria) this;
		}

		public Criteria andTemperatureNotBetween(String value1, String value2) {
			addCriterion("temperature not between", value1, value2, "temperature");
			return (Criteria) this;
		}

		public Criteria andBacklightIsNull() {
			addCriterion("backlight is null");
			return (Criteria) this;
		}

		public Criteria andBacklightIsNotNull() {
			addCriterion("backlight is not null");
			return (Criteria) this;
		}

		public Criteria andBacklightEqualTo(String value) {
			addCriterion("backlight =", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightNotEqualTo(String value) {
			addCriterion("backlight <>", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightGreaterThan(String value) {
			addCriterion("backlight >", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightGreaterThanOrEqualTo(String value) {
			addCriterion("backlight >=", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightLessThan(String value) {
			addCriterion("backlight <", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightLessThanOrEqualTo(String value) {
			addCriterion("backlight <=", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightLike(String value) {
			addCriterion("backlight like", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightNotLike(String value) {
			addCriterion("backlight not like", value, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightIn(List<String> values) {
			addCriterion("backlight in", values, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightNotIn(List<String> values) {
			addCriterion("backlight not in", values, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightBetween(String value1, String value2) {
			addCriterion("backlight between", value1, value2, "backlight");
			return (Criteria) this;
		}

		public Criteria andBacklightNotBetween(String value1, String value2) {
			addCriterion("backlight not between", value1, value2, "backlight");
			return (Criteria) this;
		}

		public Criteria andIpIsNull() {
			addCriterion("ip is null");
			return (Criteria) this;
		}

		public Criteria andIpIsNotNull() {
			addCriterion("ip is not null");
			return (Criteria) this;
		}

		public Criteria andIpEqualTo(String value) {
			addCriterion("ip =", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotEqualTo(String value) {
			addCriterion("ip <>", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThan(String value) {
			addCriterion("ip >", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThanOrEqualTo(String value) {
			addCriterion("ip >=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThan(String value) {
			addCriterion("ip <", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThanOrEqualTo(String value) {
			addCriterion("ip <=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLike(String value) {
			addCriterion("ip like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotLike(String value) {
			addCriterion("ip not like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpIn(List<String> values) {
			addCriterion("ip in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotIn(List<String> values) {
			addCriterion("ip not in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpBetween(String value1, String value2) {
			addCriterion("ip between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotBetween(String value1, String value2) {
			addCriterion("ip not between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andPortIsNull() {
			addCriterion("port is null");
			return (Criteria) this;
		}

		public Criteria andPortIsNotNull() {
			addCriterion("port is not null");
			return (Criteria) this;
		}

		public Criteria andPortEqualTo(String value) {
			addCriterion("port =", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortNotEqualTo(String value) {
			addCriterion("port <>", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortGreaterThan(String value) {
			addCriterion("port >", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortGreaterThanOrEqualTo(String value) {
			addCriterion("port >=", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortLessThan(String value) {
			addCriterion("port <", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortLessThanOrEqualTo(String value) {
			addCriterion("port <=", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortLike(String value) {
			addCriterion("port like", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortNotLike(String value) {
			addCriterion("port not like", value, "port");
			return (Criteria) this;
		}

		public Criteria andPortIn(List<String> values) {
			addCriterion("port in", values, "port");
			return (Criteria) this;
		}

		public Criteria andPortNotIn(List<String> values) {
			addCriterion("port not in", values, "port");
			return (Criteria) this;
		}

		public Criteria andPortBetween(String value1, String value2) {
			addCriterion("port between", value1, value2, "port");
			return (Criteria) this;
		}

		public Criteria andPortNotBetween(String value1, String value2) {
			addCriterion("port not between", value1, value2, "port");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtIsNull() {
			addCriterion("last_active_at is null");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtIsNotNull() {
			addCriterion("last_active_at is not null");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtEqualTo(Date value) {
			addCriterion("last_active_at =", value, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtNotEqualTo(Date value) {
			addCriterion("last_active_at <>", value, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtGreaterThan(Date value) {
			addCriterion("last_active_at >", value, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtGreaterThanOrEqualTo(Date value) {
			addCriterion("last_active_at >=", value, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtLessThan(Date value) {
			addCriterion("last_active_at <", value, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtLessThanOrEqualTo(Date value) {
			addCriterion("last_active_at <=", value, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtIn(List<Date> values) {
			addCriterion("last_active_at in", values, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtNotIn(List<Date> values) {
			addCriterion("last_active_at not in", values, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtBetween(Date value1, Date value2) {
			addCriterion("last_active_at between", value1, value2, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andLastActiveAtNotBetween(Date value1, Date value2) {
			addCriterion("last_active_at not between", value1, value2, "lastActiveAt");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionIsNull() {
			addCriterion("firmware_version is null");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionIsNotNull() {
			addCriterion("firmware_version is not null");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionEqualTo(String value) {
			addCriterion("firmware_version =", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionNotEqualTo(String value) {
			addCriterion("firmware_version <>", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionGreaterThan(String value) {
			addCriterion("firmware_version >", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionGreaterThanOrEqualTo(String value) {
			addCriterion("firmware_version >=", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionLessThan(String value) {
			addCriterion("firmware_version <", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionLessThanOrEqualTo(String value) {
			addCriterion("firmware_version <=", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionLike(String value) {
			addCriterion("firmware_version like", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionNotLike(String value) {
			addCriterion("firmware_version not like", value, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionIn(List<String> values) {
			addCriterion("firmware_version in", values, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionNotIn(List<String> values) {
			addCriterion("firmware_version not in", values, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionBetween(String value1, String value2) {
			addCriterion("firmware_version between", value1, value2, "firmwareVersion");
			return (Criteria) this;
		}

		public Criteria andFirmwareVersionNotBetween(String value1, String value2) {
			addCriterion("firmware_version not between", value1, value2, "firmwareVersion");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_equipmentstatus
	 * @mbggenerated  Thu Oct 19 15:15:15 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_equipmentstatus
     *
     * @mbggenerated do_not_delete_during_merge Thu Oct 19 15:14:50 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}