package com.cwy.eventticketdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 事件派发器
 * @author chenwy
 *
 */
public class TrainTicketPublisher {

	private List<TrainTicketListener> ttlList = new ArrayList<TrainTicketListener>();
	private static TrainTicketPublisher ttp;
	private TrainTicketPublisher(){
		Properties props = new Properties();  
		try {
			props.load(TrainTicketPublisher.class.getClassLoader().getResourceAsStream("com/cwy/eventticketdemo/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("初始化监听器失败"+e.getMessage());
		}
		String listenerStr = props.getProperty("listener");
		String[] listenerClassNames = listenerStr.split(",");
		if(listenerClassNames != null && listenerClassNames.length > 0){
			for(String listenerClassName : listenerClassNames){
				try {
					Class listenerClass = Class.forName(listenerClassName);
					TrainTicketListener ttl = (TrainTicketListener) listenerClass.newInstance();
					ttlList.add(ttl);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch(Exception e){
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public static TrainTicketPublisher instance(){
		if(ttp ==  null){
			ttp = new TrainTicketPublisher();
		}
		return ttp;
	}
	
	public void publishEvent(TrainTicketEvent tte){
		for(TrainTicketListener ttl:ttlList){
			ttl.handEvent(tte);
		}
	}
}
