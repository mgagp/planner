package com.gitbuh.mgagp.planner;

import java.util.ArrayList;
import java.util.List;

public class SerieCalc {

	List<Double> debitList;
	
	public List<AmountRow> calc(AmountRow a, int i) {
		List<AmountRow> rowList = new ArrayList<AmountRow>();
		AmountRow n = a.apply(debitList.get(0));
		rowList.add(n);
		a = n;
		for (int j = 1; j < i; j++) {
			n = a.next(debitList.get(j));
			rowList.add(n);
			a = n;
		}
		return rowList;
	}

}
