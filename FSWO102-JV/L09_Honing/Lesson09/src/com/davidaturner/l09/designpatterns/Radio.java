package com.davidaturner.l09.designpatterns;

import com.davidaturner.l09.interfaces.AlertVisitor;
import com.davidaturner.l09.interfaces.Alertable;

public class Radio implements Alertable {

	@Override
	public void alert(AlertVisitor alertVisitor) {
		alertVisitor.alert(this);
	}

}
