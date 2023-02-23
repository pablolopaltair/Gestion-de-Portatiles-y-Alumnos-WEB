/**
 * 
 */
package ejemploWeb2.aplicacion;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import ejemploWeb2.aplicacion.dal.Alumno;


/**
 * @author Pablo López
 *
 */
@Configuration
@ComponentScan
//@PropertySource("classpath:application.properties")
//@EnableJpaRepositories("ejemploWeb.aplicacion.dal") // JPA REPOSITORIES PERO EN MONGO
public class AplicacionConfiguracionContexto {
/*
	@Autowired
	private Environment enviroment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(enviroment.getProperty("db.driver"));
		dataSource.setUrl(enviroment.getProperty("db.url"));
		dataSource.setUsername(enviroment.getProperty("db.username"));
		dataSource.setPassword(enviroment.getProperty("db.password"));
		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(Alumno.class.getPackage().getName());

		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setDatabase(Database.POSTGRESQL);
		hibernateJpaVendorAdapter.setDatabasePlatform(enviroment.getProperty("hibernate.dialect"));
		hibernateJpaVendorAdapter.setGenerateDdl(enviroment.getProperty("hibernate.generateDdl", Boolean.class));
		hibernateJpaVendorAdapter.setShowSql(enviroment.getProperty("hibernate.show_sql", Boolean.class));       
        em.setJpaVendorAdapter(hibernateJpaVendorAdapter);
        
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto", enviroment.getProperty("hibernate.hbm2ddl.auto"));
	    jpaProperties.put("hibernate.show_sql", enviroment.getProperty("hibernate.show_sql"));
	    jpaProperties.put("hibernate.format_sql", enviroment.getProperty("hibernate.format_sql"));
	    em.setJpaProperties(jpaProperties);
	    
	    return em;

	}
	
	@Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }
    
    
    */
}
