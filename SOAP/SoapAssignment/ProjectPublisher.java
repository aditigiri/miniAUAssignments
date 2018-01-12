package com.Accolite.SoapAssignment;

import javax.xml.ws.Endpoint;

public class ProjectPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8085/WS/SoapAssignment", new ProjectImpl());
		
	}
}