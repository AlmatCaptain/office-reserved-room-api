package kz.iitu.office.reserved.room.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OfficeReservedRoomApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficeReservedRoomApiApplication.class, args);
	}
}
