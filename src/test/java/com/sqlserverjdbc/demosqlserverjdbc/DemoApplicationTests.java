package com.sqlserverjdbc.demosqlserverjdbc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests 
{
	// @Test
	// public void contextLoads() 
	// {
	// }

	@Autowired
	private VegRepository vegRepository;

	@Test
	public void findAllVegs()
	{
		List<Vegetable> vegList = vegRepository.findAll();
		assertNotNull(vegList);
		assertTrue(!vegList.isEmpty());
	}
}
