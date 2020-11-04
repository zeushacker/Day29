package com.utilex;

public class Circle implements Cloneable{

	Point p; // ����
	double r; // ������
	
	public Circle(Point p,double r) {

		this.p=p;
		this.r = r;
	}
	
	//���� ����
	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException ce) {}
		return (Circle)obj;
	
	}
	
	// ���� ����
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
