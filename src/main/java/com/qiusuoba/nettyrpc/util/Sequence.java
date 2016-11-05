package com.qiusuoba.nettyrpc.util;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

/**
 * 序列类
 * 
 * @Author:caimin
 * @Since:2015年9月28日
 * @Version:
 */
public class Sequence {
	private static AtomicInteger sequence = new AtomicInteger(1000);

	public static int next() {
		return sequence.addAndGet(1);
	}

	@Test
	public void MyTest() {
		int next =0;
		for (int i = 0; i < 1000; i++) {
			next = Sequence.next();
		}
		System.out.println(next);
	}
}
