package miu.edu.waa_lab1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WaaLab1Application {

	public static void main(String[] args) {
		SpringApplication.run(WaaLab1Application.class, args);
	}

	@Bean
	public int longBean() {
		return 1;
	}

	@Bean
	public String stringBean() {
		return "bean";
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
