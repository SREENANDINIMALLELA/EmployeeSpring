package com.codeclan.example.employeeTracker;

import com.codeclan.example.employeeTracker.models.Employee;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.example.employeeTracker.repositories.EmployeeRepository;
@RunWith(SpringRunner.class)

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate() {
		Employee sree = new Employee("Sreenandini",54,2543,"Sreenandi@gmail.com");
        employeeRepository.save(sree);
	}
}
