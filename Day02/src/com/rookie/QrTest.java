package com.rookie;

import cn.tedu.qr.CreateQR;

public class QrTest {

	public static void main(String[] args) {
		int width= 150;
		int height= 150;
		String url = "www.baidu.com";
		String path = "/users/lee/Work/qr.png";
		CreateQR.create(width, height, url, path);
	}
}
