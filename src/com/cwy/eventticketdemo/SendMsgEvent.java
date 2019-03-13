package com.cwy.eventticketdemo;

/**
 * 
 * @author chenwy
 *
 */
public class SendMsgEvent extends TrainTicketEvent {

	private static final long serialVersionUID = 1L;
	private TrainTicketSource trainTicket;

	public SendMsgEvent(TrainTicketSource source) {
		super(source);
		this.trainTicket = source;
	}

	public TrainTicketSource getTrainTicket() {
		return trainTicket;
	}

	public void setTrainTicket(TrainTicketSource trainTicket) {
		this.trainTicket = trainTicket;
	}
	
	public String getSMSData() {
		if(trainTicket != null){
			String data = "发送短信：" + trainTicket.getUserName() + "您好，您已经成功购买火车票" + trainTicket.getTicketName();
		}
		return "";
	}
	
	


}
