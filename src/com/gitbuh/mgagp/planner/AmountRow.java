package com.gitbuh.mgagp.planner;

public class AmountRow {

	int age;
	
	int year;

	double amount;

	double sub;

	double add;

	double rate;

	double inc;

	AmountRow() {

	}

	AmountRow(int age, int year, double amount, double sub, double add, double rate) {
		this.age = age;
		this.year = year;
		this.amount = amount;
		this.sub = sub;
		this.add = add;
		this.rate = rate;
	}

	AmountRow apply(double debit) {
		AmountRow n = new AmountRow();
		n.age = age;
		n.add = 0;
		n.amount = amount;
		n.sub = debit;
		n.inc = (amount - debit) * rate;;
		n.rate = rate;
		n.year = year;
		return n;
	}

	AmountRow next(double debit) {
		AmountRow n = new AmountRow();
		n.age = age + 1;
		n.year = year + 1;
		n.amount = (amount - debit) * (1 + rate) + add;
		n.sub = debit;
		n.add = add;
		n.rate = rate;
		n.inc = (amount - debit) * rate;
		return n;
	}

	@Override
	public String toString() {
		return "AmountRow [age=" + age + ", year=" + year + ", amount="
				+ amount + ", sub=" + sub + ", add=" + add + ", rate=" + rate
				+ ", inc=" + inc + "]";
	}

	
}
