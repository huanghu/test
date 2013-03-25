package reconfiguration.chapter6.extractMethod;

/**
 * ExtractMethod(提炼函数)简单的实例
 * @author huanghu
 *
 */
public class ExtractMethod_simple {

	String _banner;
	String _name;
	double _amount;
	
	public ExtractMethod_simple(
			String _banner ,
			String _name ,
			double _amount){
		this._banner = _banner;
		this._name = _name;
		this._amount = _amount;
	}
	
	public void printOwing(){
		System.out.println("_banner" + _banner);
		System.out.println("name:" + _name);
		System.out.println("amount:" + _amount);
	}

	/**
	 * 第一步 printBanner()
	 */
	public void printOwing1(){
		this.printBanner();
		System.out.println("name:" + _name);
		System.out.println("amount:" + _amount);
	}
	
	/**
	 * 第二步 printDetails()
	 */
	public void printOwing2(){
		this.printBanner();
		this.printDetails();
	}
	
	private void printBanner(){
		System.out.println("_banner" + _banner);
	}
	
	private void printDetails(){
		System.out.println("name:" + _name);
		System.out.println("amount:" + _amount);
	}
}
