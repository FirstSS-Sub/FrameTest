package lib;

public class Calculation_lib {
	
	private int m,n;

	public Calculation_lib(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public int getPlus(){ //足し算をし、結果を返す関数
		return m + n;
	}
	public int getMinus(){ //引き算
		return m - n;
	}
	public int getProduct(){ //掛け算
		return m * n;
	}
	public int getDivide(){ //割り算
		return m / n;
	}
	public int getMod(){ //余り
		return m % n;
	}
}