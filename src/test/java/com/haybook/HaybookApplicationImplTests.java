package com.haybook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	@Test(expected = IllegalArgumentException.class)
	public void testfindDublicatesAIsNull(){
        List<Integer>a = null;
        List<Integer>b = new ArrayList<>();
         haybookApplication.findDuplicates(a,b);
	}
    @Test(expected = IllegalArgumentException.class)
    public void testfindDublicatesBIsNull(){
        List<Integer>b = null;
        List<Integer>a = new ArrayList<>();
        haybookApplication.findDuplicates(a,b);
    }
    @Test
    public void testfindDuplicatesNormal(){
	    List<Integer>a = new ArrayList<>();
	    a.add(4);
	    a.add(5);
        List<Integer>b = new ArrayList<>();
        b.add(5);
        b.add(6);
        List<Integer>result = haybookApplication.findDuplicates(a,b);
        assertEquals(Arrays.asList(5),result);
    }
}
