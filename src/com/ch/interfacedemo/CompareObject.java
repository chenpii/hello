package com.ch.interfacedemo;

/*
 * interface CompareObject{
 * 	public int compartTo(Object o)
 * 	//若返回值是0，代表相等
 *	//若为正数，代表当前对象大；负数代表当前对象小
 *  * }
 */
public interface CompareObject {
	public int compartTo(Object o);
}
