import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

import com.examen.entidades.Colega;
import com.examen.persistencia.MySqlColegaDao;

public class TestMySqlColegaDao {

	@Test
	public void test() {

		Colega colega = new Colega(1, "Juan", "Madrid", new Date());

		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/colegajdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.jdbc.Driver");

		MySqlColegaDao sut = new MySqlColegaDao(ds);

		try {
			sut.insercion(colega);
			Colega colegaObtenido = sut.visualizarPorId(colega.getId());

			assertEquals(colega, colegaObtenido);

		} catch (SQLException e) {
			e.printStackTrace();
			fail("Se produce un SqlExceptions, y no debería: " + e.getMessage());
		}
	}
}
