package hadoop.job.zookeeper.demo.distributeLock;

import java.util.List;

public class Utils {
	
	/**
	 * 在序号节点列表中获得当前节点的前一个节点
	 * @return
	 */
	public static String getPreviousNode(List<String> nodes ,String node){
		String preNode = "";
		
		if(node == null || node.equals("")){
			System.out.println("当前node为空节点");
			return preNode;
		}
		
		for(int i = 0 ;i < nodes.size() ;i ++){
			String n = nodes.get(i);
			
			if(n.equals(node)){
				//取出当前节点的前一个节点
				preNode = nodes.get(--i);
				return preNode;
			}
		}
		
		return preNode;
	}
}
