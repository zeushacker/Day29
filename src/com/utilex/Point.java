package com.utilex;
// clone() :  자신을 복제해서 새로운 인스턴스를 생성하는 일을 함
public class Point  implements Cloneable{

	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x :"+x +", y :"+ y;
	}
	
	@Override
	public Object clone()  {
		Object obj = null;
		try {
			obj = super.clone();
		// 반드시 예외처리를 해 주어야함	
		}catch(CloneNotSupportedException ce) {}
		return obj;
	}
	
}
