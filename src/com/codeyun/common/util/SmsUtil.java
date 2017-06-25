package com.codeyun.common.util;

import com.codeyun.common.sms.ISmsSender;
import com.codeyun.common.sms.MiaoDiSmsSender;
import com.codeyun.common.sms.SmsRequest;
import com.codeyun.common.sms.SmsResponse;

public class SmsUtil {
	private static ISmsSender sender = new MiaoDiSmsSender();
	public static boolean sendIdentityCode(String phone, int code){
		SmsRequest request = new SmsRequest();
		request.setPhone(phone);
		request.setContent("���������̡���֤�룺"+code+"����������Ҫ���߱���Ŷ��");
		SmsResponse resp = sender.send(request);
		return resp.isSuccess();
	}
}
