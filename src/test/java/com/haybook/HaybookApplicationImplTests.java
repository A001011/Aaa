package com.haybook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HaybookApplicationImplTests {
@Autowired
private HaybookApplicationImpl haybookApplication;
	@Test
	public void testSum() {
		int a = 7;
		int b =3;

	int result = haybookApplication.sum(a,b);
	assertEquals(10, result);
	}
}
