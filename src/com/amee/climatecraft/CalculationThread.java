package com.amee.climatecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.amee.client.util.Choice;

public class CalculationThread implements Runnable {

	private Calculation item;
  private boolean emit;

	public CalculationThread(Calculation _item, boolean _emit) {
		item = _item;
    emit = _emit;
	}
	public void run() {
		item.blockingCalculate(emit);
	}
}