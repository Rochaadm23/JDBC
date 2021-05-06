package posjavajdbc.posjavajdbc;

import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {
	@Test
	public void initBanco() {

		// SingleConnection.getConnection();

		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		userposjava.setId(5L);
		userposjava.setNome("Fernando");
		userposjava.setEmail("ribeiro@rocha.com.br");

		userPosDAO.salvar(userposjava);

	}

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();

		try {

			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {

				System.out.println(userposjava);
				System.out.println("--------------------------------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();

	}

}
}
