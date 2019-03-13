package com.cwy.eventticketdemo;

public class TrainticketEventTets {

	public static void main(String[] args) {
		TrainticketEventTets test = new TrainticketEventTets();
		test.buySuccessTicket();

	}
	
	private void buySuccessTicket(){
		TrainTicketSource trainticket = new TrainTicketSource();
		trainticket.setUserName("小明");
		trainticket.setTicketName("【北京---济南】");
		System.out.println("购票成功");
		TrainTicketPublisher.instance().publishEvent(new SendEmailEvent(trainticket));
		TrainTicketPublisher.instance().publishEvent(new SendMsgEvent(trainticket));
	}

}
