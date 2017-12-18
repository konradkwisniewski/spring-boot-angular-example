package com.ai.ai;


import com.ai.ai.Database.DatabaseTestData;
import com.ai.ai.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AiApplication implements CommandLineRunner {

    @Autowired
    private MainRepository mainRepository;

	public static void main(String[] args) {
		SpringApplication.run(AiApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        DatabaseTestData.loadTestData(this.mainRepository);
        // DatabaseTestData.showTestData(this.clientRepository, this.itemRepository, this.sellRepository);
    }
}
