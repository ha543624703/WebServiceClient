package com.hyan.client;

public class ServiceTest
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();
        String name = hello.getValue("Hyan");
        System.out.println(name);
		String age = hello.getAge("31岁");
		System.out.println(age);
	}
}
