package com.dyh.test;

import client.MobileCodeWS;
import client.MobileCodeWSSoap;

public class PhoneNumTest {

public static void main(String[] args) {
		
		MobileCodeWS mc = new MobileCodeWS();
		MobileCodeWSSoap soap = mc.getMobileCodeWSSoap();
		String msg = soap.getMobileCodeInfo("", null);
		System.out.println(msg);
	}
	
}
