package com.myexample.service;

import com.myexample.model.Employee;
import com.myexample.model.EmployeeHealthInsurance;

public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
