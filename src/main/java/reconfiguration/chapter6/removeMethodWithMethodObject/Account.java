package reconfiguration.chapter6.removeMethodWithMethodObject;

public class Account {
	public int gamma(int inputVal ,int quantity ,int yearToDate){
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if((yearToDate - importantValue1) > 100){
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue1;
	}
	
    /**
     * 第四步 修改旧函数，让它将它的工作转发给刚完成的这个函数对象（method object）
     */
	public int gamma4(int inputVal, int quantity, int yearToDate) {
	    return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}
	
	public int delta(){
		return 1;
	}
}
