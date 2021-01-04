package service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(locations = {
        "classpath:spring/spring-app.xml",
})
@Sql(scripts = {
        "classpath:db/populateDb.sql"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractServiceClass {

}
