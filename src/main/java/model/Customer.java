package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private Integer id;
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private LocalDate createDate;
	private Boolean isActive;
	private LocalDate lastLogin;
	private List<AbstractAccount> accounts = new ArrayList<>();

	public Customer(Integer id, String firstName, String lastName, String login, String password,
		LocalDate createDate, Boolean isActive, LocalDate lastLogin) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.createDate = createDate;
		this.isActive = isActive;
		this.lastLogin = lastLogin;
	}

	public Customer(String firstName, String lastName, String login, String password, LocalDate createDate,
		Boolean isActive, LocalDate lastLogin) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.createDate = createDate;
		this.isActive = isActive;
		this.lastLogin = lastLogin;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public LocalDate getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDate lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getId() {
		return id;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean active) {
		isActive = active;
	}

	public void setAccounts(List<AbstractAccount> accounts) {
		this.accounts = accounts;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public List<AbstractAccount> getAccounts() {
		return accounts;
	}
}
