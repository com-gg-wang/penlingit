package com.ontheroad.service.AppService;

import java.util.List;
import java.util.Map;

import org.springframework.remoting.service.annotation.RemoteService;

import com.ontheroad.mysql.entity.TbEula;
import com.ontheroad.mysql.entity.TbGuarantee;
import com.ontheroad.mysql.entity.TbWcal;
import com.ontheroad.mysql.entity.TsDetail;
import com.ontheroad.pojo.user.Customerpicture;
import com.ontheroad.pojo.user.Customerservice;
import com.ontheroad.pojo.user.Feedback;
import com.ontheroad.pojo.user.Guarantee;
import com.ontheroad.pojo.user.User;

@RemoteService
public interface AppUserService {

	Map<Object, Object> findUserByPhone(User user,String code);


	Map<Object, Object> appUserLogin(User user);

	Map<Object, Object> updatePassword(User user, String newPassword, String oldPassword);

	Map<Object, Object> updatePhone(User user, String newPhone, String code);

	Map<Object, Object> appUserUpdateData(User user);

	Map<Object, Object> forgetPassword(String phone, String newPassword,String code);

	Map<Object, Object> getGuaranteeDetail(Guarantee guarantee);

	Map<Object, Object> submitGuaranteeDetail(Guarantee guarantee);

	Map<Object, Object> getCustomerList(Customerservice customerservice);

	Map<Object, Object> getCustomerDetail(Customerservice customerservice);

	Map<Object, Object> getUserDetail(User user);

	Map<Object, Object> applyCustomer(Customerservice customerservice);

	Map<Object, Object> deleteCustomer(Customerservice customerservice);

	Map<Object, Object> getCommonProblemList();

	Map<Object, Object> insertFeedback(Feedback feedback);

	Map<Object, Object> appUserGetVerificationCode(String phone);

	Map<Object, Object> getEULA();
	/**
	 * 添加或更新保修卡
	 * @param t
	 */
	void saveOrUpdateTbGuarantee(TbGuarantee t);
	/**
	 * 添加或更新用户协议
	 * @param eula
	 */
	void updateOrAddEula(TbEula eula);
	/**
	 * 查询用户协议
	 * @param eula
	 */
	TbEula getEula();
	/**
	 * 获取报修最大id
	 * @return
	 */
	Integer getIndexCustomerService();
	
	/**
	 * 获取报修图片
	 * @return
	 */
	List<Customerpicture> getPicsCustomerService(Integer customer_id);
	
	/**
	 * 获取常见问题
	 * @return
	 */
	List<TsDetail> getTsDetailS();
	
	/**
	 * 获取流量校准参数
	 * @return
	 */
	TbWcal getTbwcal(String deviceNo);
	
}
