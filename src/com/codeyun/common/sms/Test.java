package com.codeyun.common.sms;

import com.codeyun.common.log.CodeYunLogger;


public class Test {
	@org.junit.Test
	public void test(){
		ISmsSender sender = new MiaoDiSmsSender();
		SmsRequest req = new SmsRequest();
		req.setContent("���������̡���֤�룺486257����������Ҫ���߱���Ŷ��");
		req.setPhone("");
		SmsResponse res = sender.send(req);
		CodeYunLogger.log(res.toString());
	}
}
