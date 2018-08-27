package com.arquitecturajava.test;

import org.junit.Assert;
import org.junit.Test;

import com.arquitecturajava.servicios.ServicioB;
import com.arquitecturajava.servicios.ServicioBImpl;

public class TestServicioB {

	@Test
	public void testMultiplicacion() {

		ServicioB servicioB = new ServicioBImpl();
		Assert.assertEquals(servicioB.multiplicar(2, 3), 6);		

	}

}
