package com;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewSwift implements MethodReplacer{
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("newSwift");
		return null;
	}
}
