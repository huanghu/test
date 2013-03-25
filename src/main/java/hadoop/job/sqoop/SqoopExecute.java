package hadoop.job.sqoop;

import java.util.ArrayList;
import java.util.List;

import com.cloudera.sqoop.Sqoop;

public class SqoopExecute{
	
	String[] args = new String[0];

	public void execute(){
		for(String arg : args){
			System.out.println("arg " + arg);			
		}

		Sqoop.main(args);
		
	}
	
	private void setArgs() throws Exception{
		List<String> argsList = new ArrayList<String>();
		
		/*
		 * --connect 'jdbc:sqlserver://10.10.224.153;username=testwrite;password=test_123_*();database=peking' --query
		 *  "select top 10 'stock' as t,wid,orgid,sid,numck,numrk,numzt,Stock,NumOrderYd,NumTransferYdRk,NumTransferYdCk from Core_StockStatDay(nolock) WHERE \$CONDITIONS" 
		 *  --where "statday=20120215" --split-by Wid --fields-terminated-by '\t' --target-dir example/input_stock
		 * 
		 */
		argsList.add("import");
		argsList.add("--connect");
		argsList.add("jdbc:mysql://192.168.225.101:3306/jdrebate");
		
		argsList.add("--username");
		argsList.add("rbt");
		argsList.add("--password");
		argsList.add("rbt");
		
		argsList.add("--query");
		argsList.add("\"SELECT id,agr_no FROM rbt_agr_calc_time_point where $CONDITIONS\"");
		
		argsList.add("--split-by");
		argsList.add("id");
		
		argsList.add("--fields-terminated-by");
		argsList.add("'\t'");
		
		argsList.add("--target-dir");
		argsList.add("/user/root/example/input_stock");
		
		args = argsList.toArray(args);
	}
	
	public static void main(String[] args){
		try {
			SqoopExecute sqoopExecute = new SqoopExecute();
			
			sqoopExecute.setArgs();	
			sqoopExecute.execute();
			
//			Sqoop.main(args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
