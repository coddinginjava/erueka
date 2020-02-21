package sai.service.microA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MicroAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroAApplication.class, args);
	}


	@EventListener(ApplicationReadyEvent.class)
	public  void doti(){
		System.out.println("on start");
	}
}


