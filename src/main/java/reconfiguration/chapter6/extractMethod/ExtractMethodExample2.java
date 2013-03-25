package reconfiguration.chapter6.extractMethod;

import java.util.Enumeration;
import java.util.Vector;

import reconfiguration.chapter6.Order;

/**
 * 局部变量赋值
 * @author huanghu
 *
 */
public class ExtractMethodExample2 {
	Vector<Order> _orders;
	String _name;
	
	public ExtractMethodExample2(Vector<Order> _orders ,String _name){
		this._orders = _orders;
		this._name = _name;
	}
	
	public void printOwing(){
		//
		Enumeration<Order> e = _orders.elements();
		double outstanding = 0.0;
		
		this.printBanner();
		
		//
		while(e.hasMoreElements()){
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}
		
		this.printDetails(outstanding);
	}
	
	//重构 提取getOutstanding()
	public void printOwing1(){	
		this.printBanner();
		double outstanding = getOutstanding();
		this.printDetails(outstanding);
	}
	
	private double getOutstanding(){
		Enumeration<Order> e = _orders.elements();
		double outstanding = 0.0;
		while(e.hasMoreElements()){
			Order each = (Order)e.nextElement();
			outstanding += each.getAmount();
		}	
		return outstanding;
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
