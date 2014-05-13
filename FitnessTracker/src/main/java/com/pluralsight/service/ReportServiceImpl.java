package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.NormalReport;
import com.pluralsight.model.User;
import com.pluralsight.repository.ReportRepository;

@Service("reportService")
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepository;

	public List<NormalReport> findAllUserReports() {
		return reportRepository.findAllUserReports();
	}
	
	public void save(User u) {
		reportRepository.saveAndFlush(u);
	}

}
