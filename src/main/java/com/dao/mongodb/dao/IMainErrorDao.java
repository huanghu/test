package com.dao.mongodb.dao;

import java.util.List;

import com.dao.mongodb.domain.EbsLog;
import com.dao.mongodb.domain.ReRunFixDto;


/**
 * dao接口
 * @author huanghu
 * @date 2013-11-7
 */
public interface IMainErrorDao {
	/**
	 * 在ebslog中查找wfName的错误数据，类似于分页的效果
	 * @param wfName 工作流名称
	 * @param limit 查找前多少个数据
	 * @param skip 跳过多少个数据
	 */
	public List<EbsLog> findErrorLogByEbsLog(String wfName ,int limit ,int skip);
	
	/**
	 * 在ebslog中查找wfName的错误数据的总数
	 * @param wfName 工作流名称
	 * @return
	 */
	public long findErrorLogTotalByEbsLog(String wfName);
	
	public void updateReRunFixWf(ReRunFixDto reRunFixDto ,String hdfsPath);
	
	public void updateReRunFixWfMuliField(ReRunFixDto reRunFixDto ,String hdfsPath);
}
