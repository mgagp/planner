package com.gitbuh.mgagp.planner;

public class Planner {

	public static void main(String[] args) {
		Planner p = new Planner();
		p.plan();
	}

	void plan() {
		FTQ ftq = new FTQ(1000d, 2021, 53);
		System.out.println(ftq);
	}
}