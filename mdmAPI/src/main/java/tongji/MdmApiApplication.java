package tongji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring4all.swagger.EnableSwagger2Doc;

@MapperScan("tongji.dao")
@EnableEurekaClient
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@EnableFeignClients
@EnableSwagger2Doc
@EnableCircuitBreaker
public class MdmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdmApiApplication.class, args);
	}
	
}
