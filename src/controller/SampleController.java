package controller;

import service.SampleService;
import service.impl.SampleServiceimpl;

public class SampleController {

// この処理が動いたら取得したaisatsuの値が出力される
	public static void main(String args[]) {
		SampleService test = new SampleServiceimpl();
		String aisatsu = test.callResponse();
		System.out.println(aisatsu);
	}

};

