package com.project.OrganizationManagementWorkflow.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.OrganizationManagementWorkflow.entity.Country;
import com.project.OrganizationManagementWorkflow.entity.Employee;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Repository
public class MainDao {

	@Autowired
	SessionFactory factory;
	
	public String addCountry(Country country) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		String msg = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.persist(country);
			transaction.commit();
			msg = "Country Added Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public String updateCountry(Country country, int cid) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction transaction = null;
		String msg = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			Country country2 = session.get(Country.class, cid);
			country2.setCname(country.getCname());
			session.merge(country2);
			transaction.commit();
			msg = "Country Updated Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
		
	}

	public String deleteCountry(int cid) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction transaction = null;
		String msg = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			Country country2 = session.get(Country.class, cid);
			session.remove(country2);
			transaction.commit();
			msg = "Country Deleted Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		List<Country> list = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			String hqlQuery = "from Country";
			Query<Country> query = session.createQuery(hqlQuery, Country.class);
			list = query.list();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public Country getParticularContry(int cid) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		Country country = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			country = session.get(Country.class, cid);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return country;
	}

	public String addEmp(Employee employee) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction transaction = null;
		String msg = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.persist(employee);
			transaction.commit();
			msg = "Employee Added Successfully......";
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public String updateEmp(Employee employee, int id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		String msg = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			Employee employee2 = session.get(Employee.class, id);
			employee2.setName(employee.getName());
			employee2.setMob_no(employee.getMob_no());
			employee2.setEmail_id(employee.getEmail_id());
			employee2.setDept(employee.getDept());
			employee2.setSalary(employee2.getSalary());
			employee2.setStatus(employee.getStatus());
			employee.setCreatedBy(employee.getCreatedBy());
			employee2.setCreateDate(employee.getCreateDate());
			employee2.setUpdatedBy(employee.getUpdatedBy());
			employee2.setUpdatedDate(employee.getUpdatedDate());
			session.merge(employee2);
			transaction.commit();
			msg = "Employee Updated Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public String deleteEmp(int id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		String msg = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			session.remove(employee);
			transaction.commit();
			msg = "Employee Deleted Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		List<Employee> list = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			String hqlQuery = "from Employee";
			Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
			list = query.list();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public Employee getParticularEmp(int id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		Employee employee = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			employee = session.get(Employee.class, id);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return employee;
	}

	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction transaction = null;
		Employee employee2 = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			String hqlQuery = "from Employee where email_id=:myemail and mob_no=:mymob";
			Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
			query.setParameter("myemail", employee.getEmail_id());
			query.setParameter("mymob", employee.getMob_no());
			employee2 = query.uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		
		return employee2;
	}

	public List<Employee> getSalary(Double startSal, Double endSal) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		List<Employee> list = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			String hqlQuery = "from Employee where salary between :mystartSal and :myendSal";
			Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
			query.setParameter("mystartSal", startSal);
			query.setParameter("myendSal", endSal);
			list = query.list();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public List<Employee> getStatus(String status) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		List<Employee> list = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			String hqlQuery = "from Employee where status=:mystatus";
			Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
			query.setParameter("mystatus", status);
			list = query.list();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public String updateEmpStatus(int id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		String msg = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			Employee employee2 = session.get(Employee.class, id);
			
			if (Objects.isNull(employee2)) {
				msg = "Record is not found";
			}else if ("Suspended".equals(employee2.getStatus())) {
				msg = "Suspended emp does not change";
			}else {
				String status = "active".equalsIgnoreCase(employee2.getStatus())?"inactive":"active";
				employee2.setStatus(status);
				session.merge(employee2);
				msg = "Status is updated successfully..........";
			}
			
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}
}
