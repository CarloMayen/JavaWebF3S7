package bedu.java.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bedu.java.calculator.service.BasicCalculatorService;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

	private final Logger log = LoggerFactory.getLogger(CalculatorApplication.class);
	private BasicCalculatorService basic;

	@Autowired
	public void setBasic(BasicCalculatorService basic) {
		this.basic = basic;
	}

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	public void run(String... arg){
		log.info("0 + 0 =" + basic.sum(0, 0));
		log.info("10 - 10 =" + basic.sub(10, 10));
		log.info("-100 + 20 =" + basic.sum(-100, 20));
		log.info("-15 - 30 =" + basic.sub(15, 30));

	}

}
