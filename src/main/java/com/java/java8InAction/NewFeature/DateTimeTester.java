package com.java.java8InAction.NewFeature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

public class DateTimeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("当前时间:"+currentTime);
		
		LocalDate localDate = currentTime.toLocalDate();
		System.out.println("当前日期:"+localDate);
		
		int year = currentTime.getYear();
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int hour = currentTime.getHour();
		int minute = currentTime.getMinute();
		int second = currentTime.getSecond();
		int nano = currentTime.getNano();
		
		System.out.println("格式化:"+year+"-"+month.getValue()+"-"+day+" "+hour+":"+minute+":"+second+":"+nano);
		
		LocalDateTime localDateTime2 = currentTime.withYear(2020).withDayOfMonth(10);
		
		System.out.println("改变后:"+localDateTime2);
		
		LocalDate localDate2 = LocalDate.of(2021, Month.JULY, 1);
		
		System.out.println("再次改变:"+localDate2);
		
		LocalTime localTime = LocalTime.of(22, 15);
		System.out.println("时分:"+localTime);
		
		LocalTime localTime2 = LocalTime.parse("22:21:23");
		System.out.println("转换:"+localTime2);
		
		
		ZonedDateTime date1 = ZonedDateTime.parse("2019-12-03T10:15:30+05:30[Asia/Shanghai]");
		System.out.println("时区:"+date1);
		
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);
		
		ZoneId currentZone = ZoneId.systemDefault();
	    System.out.println("当期时区: " + currentZone);
	    
	   List.of();
		
	}

}
