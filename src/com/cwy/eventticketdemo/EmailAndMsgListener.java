package com.cwy.eventticketdemo;

/**
 * 同时处理发送邮件事件和短信事件
 * @author chenwy
 *
 */
public class EmailAndMsgListener implements TrainTicketListener {

	@Override
	public void handEvent(TrainTicketEvent event) {
		if(event instanceof SendEmailEvent) {
			SendEmailEvent sendMailEvent = (SendEmailEvent)event;
			System.out.println( sendMailEvent.getEmailData());
		} else if (event instanceof SendMsgEvent) {
			SendMsgEvent sendMsgEvent = (SendMsgEvent)event;
			System.out.println(sendMsgEvent.getSMSData());
		} else {
			System.out.println("发送未知事件，无法处理");
		}

	}

}
