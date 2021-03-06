package dao;

import model.AbstractAccount;
import model.Customer;
import model.exception.NoSuchAccountException;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CommonDBOperationsDao {
	public AbstractAccount convertDataToAccountModel(ResultSet resultSet) throws SQLException, NoSuchAccountException;

	public Customer convertDataToCustomerModel(ResultSet resultSet) throws SQLException;
}
