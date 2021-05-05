package dao;

import java.sql.Connection;

import conexaojdbc.SingleConnection;
/*persitencia*/
public class UserPosDAO {

	private Connection connection;

	public UserPosDAO() {

		connection = SingleConnection.getConnection();

	}

}
