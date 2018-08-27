package com.arquitecturajava.test;

import org.junit.Assert;
import org.junit.Test;

import com.arquitecturajava.servicios.ServicioA;
import com.arquitecturajava.servicios.ServicioAImpl;

public class TestServicioA {

	@Test
	public void testSuma() {

		int a = 2;
		int b = 2;
		ServicioA servicio = new ServicioAImpl();
		Assert.assertEquals(servicio.sumar(a, b), 4);

	}
}
