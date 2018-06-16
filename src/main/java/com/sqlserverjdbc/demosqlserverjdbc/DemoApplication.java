package com.sqlserverjdbc.demosqlserverjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
	@Autowired
	private VegRepository vegRepository;

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		List<Vegetable> vegList = vegRepository.findAll();

		for (Vegetable veg : vegList) 
		{
			System.out.println("Veg Id : " + veg.VegId);
			System.out.println("Veg Name : " + veg.VegName);
			System.out.println("Veg Cost : " + veg.VegCost);
			System.out.println("\n\n");
		}
	}
}
