package com.arquitecturajava.test;

import org.junit.Assert;
import org.junit.Test;

import com.arquitecturajava.servicios.ServicioA;
import com.arquitecturajava.servicios.ServicioB;
import com.arquitecturajava.servicios.ServicioAImpl;
import com.arquitecturajava.servicios.ServicioBImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestServicioB {

	@Test
	public void testmultiplicarSumar() {

		ServicioA servicioA = new ServicioAImpl();

		ServicioB servicioB = new ServicioBImpl();

		servicioB.setServicioA(servicioA);
		Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2), 10);
	}

	@Test
	public void testMultiplicacion() {

		ServicioB servicioB = new ServicioBImpl();
		Assert.assertEquals(servicioB.multiplicar(2, 3), 6);

	}

	@Test
	public void testmultiplicarSumar1() {

		ServicioA servicioA = mock(ServicioA.class);
		when(servicioA.sumar(2, 3)).thenReturn(5);

		ServicioB servicioB = new ServicioBImpl();
		servicioB.setServicioA(servicioA);
		Assert.assertEquals(servicioB.multiplicarSumar(2, 3, 2), 10);

	}

}
