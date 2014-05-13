package com.pluralsight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.NormalReport;
import com.pluralsight.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(value="reports", method=RequestMethod.GET)
	public String getUserReports(Model model) {
		
		List<NormalReport> normReports = reportService.findAllUserReports();
		
		model.addAttribute("reports", normReports);
	
		
		
		
		return "reports";
	}
}
