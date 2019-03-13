package com.cwy.eventmechanism;

import java.util.EventListener;
import java.util.EventObject;

/**
 * 时间监听器，定义回调方法，将要做的事情放到这个方法下，这样事件源发生响应的事情时会调用这个方法
 * @author chenwy
 *
 */
public class CusEventListener implements EventListener {
	
	public void fireCusEvent(CusEvent e) {
		EventSourceObject eObject = (EventSourceObject)e.getSource();
		System.out.println("My name has been changed!");
		System.out.println("I got a new name, named \""+eObject.getName()+"\"");
	}
	
}
