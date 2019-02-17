package com.hexaware.FTP113.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.FTP113.model.Employee;
/**
 * Mapper class to map from result set to employee object.
 */
public class EmployeeMapper implements ResultSetMapper<Employee> {
  /**
   * @param idx the index
   * @param rs the resultset
   * @param ctx the context
   * @return the mapped employee object
   * @throws SQLException in case there is an error in fetching data from the resultset
   */
  public final Employee map(final int idx, final ResultSet rs, final      StatementContext ctx) throws SQLException {
    /**
     * @return Employee
     */
    return new Employee(rs.getInt("EMP_ID"), rs.getString("EMP_FULL_NAME"),
                        rs.getString("EMP_EMAIL"), rs.getString("EMP_MOBILE_NUMBER"),
                        rs.getString("EMP_DEPARTMENT"),
                        rs.getDate("EMP_DATE_OF_JOINING"), rs.getInt("EMP_MGR_ID"), rs.getInt("EMP_PL"),
                        rs.getInt("EMP_ML"), rs.getInt("EMP_EL"), rs.getInt("EMP_HR_ID"));
  }
}
