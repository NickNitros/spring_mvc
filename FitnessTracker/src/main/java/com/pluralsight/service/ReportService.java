package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.NormalReport;
import com.pluralsight.model.User;

public interface ReportService {
	
	List<NormalReport> findAllUserReports();
	
	void save(User u);
}
