package hadoop.sqoop;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cloudera.sqoop.Sqoop;


public class SqoopTestByShell {
	String[] args = new String[0];
	
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
		argsList.add("jdbc:oracle:thin:@10.10.225.20:1521:testdb1");
		
		/*
		 * --username erp --password erp
		 */
		argsList.add("--username");
		argsList.add("popware");
		argsList.add("--password");
		argsList.add("popware");
		
//		argsList.add("--table");
//		argsList.add("rbt_agr_calc_time_point");
		
//		argsList.add("--columns");
//		argsList.add("id,agr_no");
		
		argsList.add("--query");
		argsList.add("\"select 'mtlSystemItemsPop1' as type , a.ware_id ,b.attributes ,b.sku_id ,a.title,c.cubage,a.weight from ware_ware a inner join ware_sku b on a.ware_id = b.ware_id inner join ware_ext c on a.ware_id = c.ware_id where a.modified >= to_date('2012-03-26 00:00:00','yyyy-mm-dd hh24:mi:ss') and a.modified < to_date('2012-03-27 00:00:00','yyyy-mm-dd hh24:mi:ss') and $CONDITIONS\"");
		
		argsList.add("--target-dir");
		argsList.add("/sss/ttt");
//		
//		/*
//		 *--where "1=1" 
//		 */
//		argsList.add("--where");
//		argsList.add("1=1");
		
		argsList.add("--split-by");
		argsList.add("id");
		
		argsList.add("--fields-terminated-by");
		argsList.add("'\t'");
//		
//		argsList.add("--target-dir");
//		argsList.add("example/input_stock");
		
		args = argsList.toArray(args);
		System.out.println("args " + args.length);
	}
	
	@Test
	public void main(){
		try {
			
			this.setArgs();
			Sqoop.main(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
