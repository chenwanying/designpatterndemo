package com.cwy.eventmechanism;

/**
 * 事件机制测试类
 * @author chenwy
 * 2019.3.12
 */
public class EventTest {

	public static void main(String[] args) {
		EventSourceObject object = new EventSourceObject();
		//注册监听器
		object.addCusListener(new CusEventListener(){
			public void fireCusEvent(CusEvent e) {
				super.fireCusEvent(e);
			}
		});
		
		//触发事件
		object.setName("eric");
	}

}
