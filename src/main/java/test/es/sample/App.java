package test.es.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan("test.es.sample")
@SpringBootApplication
public class App
{
	public static void main(final String[] args) throws Exception
	{
		final ApplicationContext ctx = SpringApplication.run(App.class, args);
		System.out.println("Main !");
	}
}
