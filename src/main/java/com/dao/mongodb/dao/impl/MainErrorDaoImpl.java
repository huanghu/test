package com.dao.mongodb.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dao.mongodb.dao.IMainErrorDao;
import com.dao.mongodb.domain.EbsLog;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
public class MainErrorDaoImpl implements IMainErrorDao {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	private String key1 = "businessCode";

	@Override
	public List<EbsLog> findErrorLogByEbsLog(String wfName ,int limit , int skip) {
		List<EbsLog> ebsLogs = mongoTemplate.find(query(where(key1).is(wfName)).limit(limit).skip(skip), EbsLog.class);
		System.out.println("ss " + ebsLogs.size());
		return ebsLogs;
	}

	@Override
	public long findErrorLogTotalByEbsLog(String wfName) {
		long total = mongoTemplate.count(query(where(key1).in(wfName)), EbsLog.class);
		return total;
	}

}
