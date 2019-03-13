package com.cwy.eventticketdemo;

/**
 * 
 * @author chenwy
 *
 */
public class SendEmailEvent extends TrainTicketEvent {
 
	private static final long serialVersionUID = 1L;

	private TrainTicketSource trainTicket;

	public SendEmailEvent(TrainTicketSource source) {
		super(source);
		this.trainTicket = source;
	}
	
	public TrainTicketSource getTrainTicket() {
		return this.trainTicket;
	}
	
	public String getEmailData(){
		if(trainTicket != null) {
			String data = "发送邮件：" + trainTicket.getUserName() + "您好，您已经成功购买火车票" + trainTicket.getTicketName();
			return data;
		}
		return "";
	}
	
}
