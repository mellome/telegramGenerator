package application.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XmlHeaderController {
	
	private long MessageID;

	private String MessageType;
	
	private long MessageSentOn;
	
	public XmlHeaderController() {
		MessageID = 300000000000003L;
		MessageType = "ITEM_DATA";
		MessageSentOn = 201809031100L;
	}
	
	public long getMessageID() {
		return MessageID;
	}

	public void setMessageID(long messageID) {
		MessageID = messageID;
	}

	public String getMessageType() {
		return MessageType;
	}

	public void setMessageType(String messageType) {
		MessageType = messageType;
	}

	public long getMessageSentOn() {
		return MessageSentOn;
	}

	public void setMessageSentOn(long messageSentOn) {
		MessageSentOn = messageSentOn;
	}
}
