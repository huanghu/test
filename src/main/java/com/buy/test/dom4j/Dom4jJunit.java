package com.buy.test.dom4j;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;


public class Dom4jJunit {
	@Test
	public void test(){
		String path = "f:\\workflow.xml";
        SAXReader reader = new SAXReader();  
        try {
			Document   document = reader.read(new File(path));
			Element root = document.getRootElement();

			System.out.println("workflow-app name " + root.attributeValue("name"));
			
			Iterator<?> elemnts = root.elementIterator();
			while(elemnts.hasNext()){
				Element element = (Element)elemnts.next();
				System.out.println("element name " + element.attributeValue("name"));
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
