package reconfiguration.chapter6.extractMethod;

import java.util.Enumeration;
import java.util.Vector;

import reconfiguration.chapter6.Order;

/**

 * @author huanghu
 *
 */
public class ExtractMethodExample1 {
	Vector<Order> _orders;
	String _name;
	
	public ExtractMethodExample1(Vector<Order> _orders ,String _name){
		this._orders = _orders;
		this._name = _name;
	}
	
	public void printOwing(){
		Enumeration<Order> e = _orders.elements();
		double outstanding = 0.0;
		
		//pring banner �޾ֲ�����
		System.out.println("******************");
		System.out.println("*****Customer Owes****");
		System.out.println("******************");
		
		while(e.hasMoreElements()){
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}
		
		//print details �оֲ�����
		System.out.println("name:" + _name);
		System.out.println("amount:" + outstanding);		
	}
	
	/**
	 * ��һ�� ��ȡprintBanner()
	 */
	public void printOwing1(){
		Enumeration<Order> e = _orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		
		while(e.hasMoreElements()){
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}
		
		System.out.println("name:" + _name);
		System.out.println("amount:" + outstanding);		
	}
	
	/**
	 * �ڶ��� ��ȡprintDetails()
	 */
	public void printOwing2(){
		Enumeration<Order> e = _orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		
		while(e.hasMoreElements()){
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}
		
		printDetails(outstanding);		
	}	
	
	private void printBanner(){
		System.out.println("******************");
		System.out.println("*****Customer Owes****");
		System.out.println("******************");		
	}
	
	private void printDetails(double outstanding){
		System.out.println("name:" + _name);
		System.out.println("amount:" + outstanding);
	}
}
