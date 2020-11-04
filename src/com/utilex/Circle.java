package com.utilex;

public class Circle implements Cloneable{

	Point p; // 원점
	double r; // 반지름
	
	public Circle(Point p,double r) {

		this.p=p;
		this.r = r;
	}
	
	//얕은 복사
	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException ce) {}
		return (Circle)obj;
	
	}
	
	// 깊은 복사
	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException ce) {}
		
		Circle c =(Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		
		return c;
	}
	
   @Override
   	public String toString() {
   	
   		return "[p="+p+ ", r="+r+"]";
   	}	
}
