package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages = {"dao","factory","service"})
public class SpringConfig {

	@Bean
	public DataSource dataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/hr");
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(10);
		dataSource.setMaxIdleTime(5000);
		return dataSource;
	}

}
