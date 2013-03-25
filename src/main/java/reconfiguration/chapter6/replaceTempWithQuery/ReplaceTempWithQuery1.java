package reconfiguration.chapter6.replaceTempWithQuery;

public class ReplaceTempWithQuery1 {
	
	int _quantity;
	int _itemPrice;
	
	public ReplaceTempWithQuery1(int _quantity ,int _itemPrice){
		this._quantity = _quantity;
		this._itemPrice = _itemPrice;
	}
	
	public double getPrice(){
		int basePrice = _quantity * _itemPrice;
		double discountFactor;
		if(basePrice > 1000){
			discountFactor = 0.95;
		}else{
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
		
	}
	
	//�ع���һ�� int basePrice = _quantity * _itemPrice; --> final int basePrice = basePrice();
	public double getPrice1(){
		final int basePrice = basePrice(); //
		final double discountFactor;
		if(basePrice > 1000){
			discountFactor = 0.95;
		}else{
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}
	
	//�ع��ڶ��� (basePrice() > 1000 --> basePrice() 
	public double getPrice2(){
		final int basePrice = basePrice();
		final double discountFactor;
		if(basePrice() > 1000){ //
			discountFactor = 0.95;
		}else{
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}
	
	//�ع������� basePrice * discountFactor --> basePrice() * discountFactor
	public double getPrice3(){
		final double discountFactor;
		if(basePrice() > 1000){
			discountFactor = 0.95;
		}else{
			discountFactor = 0.98;
		}
		return basePrice() * discountFactor; //
	}
	
	//�ع����Ĳ� final double discountFactor; --> final double discountFactor = discountFactor()
	public double getPrice4(){
		final double discountFactor = discountFactor(); //
		return basePrice() * discountFactor;
	}	
	
	//�ع������� return basePrice() * discountFactor; --> return basePrice() * discountFactor();
	public double getPrice6(){
		return basePrice() * discountFactor(); //
	}
	
	private double discountFactor(){
		if(basePrice() > 1000){
			return 0.95;
		}else{
			return 0.98;
		}
	}
	
	private int basePrice(){
		return _quantity * _itemPrice;
	}
}
