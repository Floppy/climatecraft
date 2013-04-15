package com.amee.climatecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.amee.client.util.Choice;

public class CalculationThread implements Runnable {

	private Calculation item;

	public CalculationThread(Calculation _item) {
		item = _item;
	}
	public void run() {
		item.blockingCalculate();
	}
}