package com.equifax.services.eport.servicedefs._1_0;

import java.io.FileReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.equifax.services.eport.servicedefs._1_0.V10Stub.InquiryResponse;

public class Main {

	
	public static void main(String[] args) {
		
		try {
			
			XMLInputFactory factory = XMLInputFactory.newInstance();

			try {

				XMLStreamReader streamReader = factory.createXMLStreamReader(
					    new FileReader("C:\\Users\\AshwiniP\\Desktop\\HDFC Merging\\RawData\\1_res.xml"));
				InquiryResponse response  = new InquiryResponse();
				response =  InquiryResponse.Factory.parse(streamReader);
			    System.out.println("Done");
			} catch (XMLStreamException e) {
			    e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
