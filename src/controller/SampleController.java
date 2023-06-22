package controller;

import service.SampleService;
import service.impl.SampleServiceimpl;

public class SampleController {


	public static void main(String args[]) {
		SampleService test = new SampleServiceimpl();
		String hoge = test.callResponse();
		System.out.println(hoge);
	}

};

