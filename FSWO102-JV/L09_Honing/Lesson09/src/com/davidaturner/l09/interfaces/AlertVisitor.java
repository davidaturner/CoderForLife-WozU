package com.davidaturner.l09.interfaces;

import com.davidaturner.l09.designpatterns.Radio;
import com.davidaturner.l09.designpatterns.Smartphone;
import com.davidaturner.l09.designpatterns.TV;

public interface AlertVisitor {

	void alert(Smartphone smartPhone);
	void alert(TV tv);
	void alert(Radio radio);
}
