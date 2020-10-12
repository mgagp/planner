package com.gitbuh.mgagp.planner;

import java.util.ArrayList;
import java.util.List;

public class FTQ {

	List<AmountRow> amountList;

	FTQ(double init, int startYear, int startAge) {
		List<Double> debitList = new ArrayList<Double>();
		int nb = 65 - startAge;
		double yearly= init / nb;
		for (int i=0;i<nb;i++) {
			debitList.add(yearly);
		}
		AmountRow a = new AmountRow(startAge, startYear, init, 0d, 0d, .01d);
		SerieCalc serieCalc = new SerieCalc();
		serieCalc.debitList = debitList;
		amountList = serieCalc.calc(a, 12);
	}

	@Override
	public String toString() {
		String sb = "";
		for (AmountRow a : amountList) {
			sb += a.toString() + "\n";
		}
		return sb;
		
	}

}
