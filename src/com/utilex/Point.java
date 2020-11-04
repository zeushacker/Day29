package com.utilex;
// clone() :  �ڽ��� �����ؼ� ���ο� �ν��Ͻ��� �����ϴ� ���� ��
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
		// �ݵ�� ����ó���� �� �־����	
		}catch(CloneNotSupportedException ce) {}
		return obj;
	}
	
}
