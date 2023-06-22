package service.impl;

import service.SampleService;

public class SampleServiceimpl implements SampleService {

	public String callResponse() {
		String hoge = "こんにちは";
		return hoge;
	}
}