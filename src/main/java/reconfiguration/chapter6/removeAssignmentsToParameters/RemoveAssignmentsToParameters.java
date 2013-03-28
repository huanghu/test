package reconfiguration.chapter6.removeAssignmentsToParameters;

public class RemoveAssignmentsToParameters {
	public int discount(int inputVal ,int quantity ,int yearToDate){
		if(inputVal > 50){
			inputVal -= 2;
		}
		if(quantity > 100){
			inputVal -= 1;
		}
		if(yearToDate > 10000){
			inputVal -= 4;
		}
		return inputVal;
	}
	
	/**
	 * 以临时变量取代对参数的赋值动作
	 */
	public int discount1(int inputVal ,int quantity ,int yearToDate){
		int result =  inputVal; 
		if(inputVal > 50){
			result -= 2;
		}
		if(quantity > 100){
			result -= 1;
		}
		if(yearToDate > 10000){
			result -= 4;
		}
		return result;
	}
	
	//另一种方法
//	public int discount_(final int inputVal ,final int quantity ,final int yearToDate){
//		if(inputVal > 50){
//			inputVal -= 2;
//		}
//		if(quantity > 100){
//			inputVal -= 1;
//		}
//		if(yearToDate > 10000){
//			inputVal -= 4;
//		}
//		return inputVal;
//	}
}
