package yyy.xxx.listviewsample01.model;

import java.io.Serializable;

/**
 * 곱셈결과를 리스트뷰에 표시할때 사용되는 VO(Value Object) Model class <br>
 */
public class Multiple implements Serializable {

	private static final long serialVersionUID = -7940340368545262207L;

	// 곱셈을 할 수
	private int multiplicand = -1;

	// 곱하는 수
	private int multiplier = -1;

	// 곱셈을 할수 와 곱하는 수의 곱한 결과 값
	private int result = -1;

	public int getMultiplicand() {
		return multiplicand;
	}

	public void setMultiplicand(int multiplicand) {
		this.multiplicand = multiplicand;
	}

	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
