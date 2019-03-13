package com.cwy.eventticketdemo;

import java.util.EventObject;

/**
 * 火车购票事件基类
 * @author chenwy
 *
 */
public class TrainTicketEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	
	
	public TrainTicketEvent(Object source) {
		super(source);
	}



}
