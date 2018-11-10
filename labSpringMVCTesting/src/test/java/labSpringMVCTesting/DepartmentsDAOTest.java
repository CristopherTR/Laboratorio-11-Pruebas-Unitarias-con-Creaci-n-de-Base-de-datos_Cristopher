package labSpringMVCTesting;

import static org.junit.Assert.fail;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class DepartmentsDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentsDAOTest.class);

	@Autowired
	private DepartmentsDAO departmentDAO;


	@BeforeClass
	public static void beforeClass() {
		logger.info("Antes de todos los metodos");
	}
	
	@Before
	public  void before() {
		logger.info("Antes de cada metodo");
	}

	@Test
	public void testFindEmployeeByLogin() {

		try {
			//
			Departments depa = DepartmentsDAO.findEmployeeByLogin("cristopher");

			Assert.assertEquals("4", depa.getDepartmentId());
			Assert.assertEquals("Cristopher", depa.getName());
			Assert.assertEquals("DEPA", depa.getDescription());
			Assert.assertEquals("Lima", depa.getCity());

			logger.info(depa.toString());
		} catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	}


	}
