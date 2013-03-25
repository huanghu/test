package reconfiguration.chapter6.removeMethodWithMethodObject;

/***
 * 在此新class中我应该提供一个final值域用以保存原先对象（源对象）：
 * 对于函数的每一个参数和每一个临时变量，也以一个个值域逐一保
 * @author huanghu
 *
 */
public class Gamma {
	private final Account _account;
	private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;
    
    /**
     * 第二步 接下来，加入一个构造函数：
     * @param source
     * @param inputValArg
     * @param quantityArg
     * @param yearToDateArg
     */
    Gamma (Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        _account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }
    
    /***
     * 第三步 现在可以把原来的函数搬到compute（）了。函数中任何调用Account class的地方，
     * 我都必须改而使用_account值域：
     */
    public int compute() {
        int importantValue1 = (inputVal * quantity) + _account.delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if((yearToDate - importantValue1) > 100)
           importantValue2 -= 20;
        int importantValue3 = importantValue2 * 7;
        //   and so on.
        return importantValue3 -2 * importantValue1;
    }
    
    /**
     * 它带来的好处是：现在我可以轻松地对compute（）函数采取Extract Method,
     * 不必担心引数（argument）传递。
     */
    public int compute5(){
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        importantThing();
        importantValue3 = importantValue2 * 7;
        //   and so on.
        return importantValue3 -2 * importantValue1;
    } 
    
    private void importantThing(){
    	if((yearToDate - importantValue1) > 100){
    		importantValue2 -= 20;
    	}
    }


}
