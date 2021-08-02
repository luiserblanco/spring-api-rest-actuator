package com.luiserblanco.enrollment.actuator;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="server-info")
public class ServerInfoEndpoint {

	@ReadOperation
	public List<String>  getServerDetails(){
		List<String> serverDetails = new ArrayList<String>();
		try {
			serverDetails.add("Server IP Address : "+InetAddress.getLocalHost().getHostAddress());
			serverDetails.add("Sever Host Name   : "+InetAddress.getLocalHost().getHostName());
			NetworkInterface network = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
			byte [] mac = network.getHardwareAddress(); 
			StringBuilder sb = new StringBuilder();			
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            serverDetails.add("Hardware Address : "+ sb.toString());			

		} catch (UnknownHostException e) {
			serverDetails = null; 
		} catch (SocketException e) {
			serverDetails = null; 
		}
		return serverDetails;
	}







}
