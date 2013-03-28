package reconfiguration.chapter6.removeMethodWithMethodObject;

/***
 * �ڴ���class����Ӧ���ṩһ��finalֵ�����Ա���ԭ�ȶ���Դ���󣩣�
 * ���ں�����ÿһ��������ÿһ����ʱ������Ҳ��һ����ֵ����һ��
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
     * �ڶ��� ������������һ�����캯����
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
     * ������ ���ڿ��԰�ԭ���ĺ����ᵽcompute�����ˡ��������κε���Account class�ĵط���
     * �Ҷ�����Ķ�ʹ��_accountֵ��
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
     * �������ĺô��ǣ������ҿ������ɵض�compute����������ȡExtract Method,
     * ���ص���������argument�����ݡ�
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
