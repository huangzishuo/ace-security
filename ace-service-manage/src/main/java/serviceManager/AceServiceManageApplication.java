package serviceManager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("serviceManager.dao")
public class AceServiceManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AceServiceManageApplication.class, args);
	}
}
