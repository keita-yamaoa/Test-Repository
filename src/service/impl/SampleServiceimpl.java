package service.impl;

import java.util.Calendar;

import service.SampleService;

public class SampleServiceimpl implements SampleService {

	public String callResponse() {
		Calendar cal = Calendar.getInstance();
		String aisatsu = "";
		int hour = cal.get ( Calendar.HOUR_OF_DAY );

		if ( hour >= 5 && hour < 11 ) {
			aisatsu = "おはようございます";
		} else if ( hour >= 11 && hour < 16 ) {
			aisatsu = "こんにちは";
		} else {
			aisatsu = "おやすみなさい";
		}

		return aisatsu;
	}
}