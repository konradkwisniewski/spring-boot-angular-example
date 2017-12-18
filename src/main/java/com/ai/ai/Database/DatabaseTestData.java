package com.ai.ai.Database;

import com.ai.ai.model.MainEntity;
import com.ai.ai.repository.MainRepository;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DatabaseTestData {

    public static void loadTestData(
            MainRepository mainRepository
    ) {
        mainRepository.deleteAll();
        mainRepository.save(new MainEntity("Jan", new BigDecimal(0)));
        mainRepository.save(new MainEntity("Mateo", new BigDecimal(100)));
    }


    public static void showTestData(
            MainRepository mainRepository
    ) {

        System.out.println("MainEntity");
        System.out.println("---------------------------------------------");
        for (MainEntity c : mainRepository.findAll()) {
            System.out.println(c.toString());
        }
    }

}
