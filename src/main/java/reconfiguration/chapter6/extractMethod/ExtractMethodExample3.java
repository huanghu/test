package reconfiguration.chapter6.extractMethod;

import java.util.Enumeration;
import java.util.Vector;

import reconfiguration.chapter6.Order;

/**
 * @author huanghu
 *
 */
public class ExtractMethodExample3 {
	Vector<Order> _orders;
	String _name;
	
	public ExtractMethodExample3(Vector<Order> _orders ,String _name){
		this._orders = _orders;
		this._name = _name;
	}
	
	public void printOwing(double previousAmount){
		//
		Enumeration<Order> e = _orders.elements();
		double outstanding = previousAmount * 2.2;
		
		this.printBanner();
		
		//
		while(e.hasMoreElements()){
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}
		
		this.printDetails(outstanding);
	}
	
	//�ع�
	public void printOwing1(double previousAmount){
		double outstanding = previousAmount;
		this.printBanner();
		outstanding = getOutstanding(previousAmount);
		this.printDetails(outstanding);
	}
	
	private double getOutstanding(double initalValue){
		double result = initalValue;
		Enumeration<Order> e = _orders.elements();
		while(e.hasMoreElements()){
			Order each = (Order)e.nextElement();
			result += each.getAmount();
		}	
		return result;
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
