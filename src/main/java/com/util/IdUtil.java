package com.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/*
 * 订单编号生成（15位）
 */
public class IdUtil {

	public static String getDateIdGenerate() {
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateId = format.format(date);
		return dateId;
	}

	public static String getDateLongIdGenerate() {
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateId = format.format(date);
		Random random = new Random();
		int randomId = random.nextInt(900) + 100;
		return dateId + randomId;
	}
}
