package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public AccountDao accountDao()
	{
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
		return bean;
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public AccountService accountService()
	{
		AccountServiceImpl bean = new AccountServiceImpl();
		//bean.setAccountDao(accountDao());
		return bean;
	}
	
	@Bean
	public AccountDao accountDaoJdbc()
	{
		AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
		return bean;
	}
}
