package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.NormalReport;
import com.pluralsight.model.User;

@Repository("reportRepository")
public interface ReportRepository extends JpaRepository<User, Long> {

	@Query("Select new com.pluralsight.model.NormalReport(u.name, u.surname,u.dob, a.address, c.name) "
			+ "from User u, Address a, Country c WHERE u.id = a.user.id AND a.country.id = c.id ORDER BY u.name")
	List<NormalReport> findAllUserReports();

}
