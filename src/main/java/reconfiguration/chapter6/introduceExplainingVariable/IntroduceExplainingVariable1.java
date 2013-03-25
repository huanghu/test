package reconfiguration.chapter6.introduceExplainingVariable;

/**
 * introduce Explaining Variable(引入解释性变量)
 * @author huanghu
 *
 */
public class IntroduceExplainingVariable1 {
	
	int _quantity;
	int _itemPrice;
	
	public IntroduceExplainingVariable1(int _quantity ,int _itemPrice){
		this._quantity = _quantity;
		this._itemPrice = _itemPrice;
	}
	
	public double price(){
		return _quantity * _itemPrice - Math.max(0, _quantity - 500) * _itemPrice * 0.05 + Math.min(_quantity * _itemPrice * 0.1, 100.0);	
	}
	
	/**
	 * 第一步
	 */
	public double price1(){
		//_quantity * _itemPrice --> final double basePrice
		final double basePrice = _quantity * _itemPrice;
		return basePrice - Math.max(0, _quantity - 500) * _itemPrice * 0.05 + Math.min(_quantity * _itemPrice * 0.1, 100.0);	
	}	
	
	/**
	 * 第二步
	 */
	public double price2(){
		//_quantity * _itemPrice --> final double basePrice
		final double basePrice = _quantity * _itemPrice;
		return basePrice - Math.max(0, _quantity - 500) * _itemPrice * 0.05 + Math.min(basePrice  * 0.1, 100.0);	
	}	
	
	/**
	 * 第三步
	 */
	public double price3(){
		final double basePrice = _quantity * _itemPrice;
		final double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		//Math.max(0, _quantity - 500) * _itemPrice * 0.05 --> quantityDiscount
		return basePrice - quantityDiscount + Math.min(basePrice  * 0.1, 100.0);	
	}	
	
	/**
	 * 第四步
	 */
	public double price4(){
		final double basePrice = _quantity * _itemPrice;
		final double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		final double shipping = Math.min(basePrice  * 0.1, 100.0);
		return basePrice - quantityDiscount + shipping;	
	}
}
