package com.cwy.eventticketdemo;

import java.util.EventListener;

/**
 * 
 * @author chenwy
 *
 */
public interface TrainTicketListener extends EventListener{
	
	void handEvent(TrainTicketEvent event);

}
