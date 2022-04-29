package ar.edu.unlam.cuentas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorrosTest {

	@Test
	public void QueSePuedaCrearUnaCajaDeAhorro() {
		Double valorEsperado=4000.0;
		Double valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CajaDeAhorro(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	   valorObtenido=cuenta.obtenerSaldo();
	   assertEquals(valorEsperado,valorObtenido);
		
	}
	@Test
	public void QueALaQuintaExtraccionMensualSeCobreUnInteresDe6pesos(){
		Double valorEsperado=994.0;
		Double montoARetirar=500.0;
		Double valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CajaDeAhorro cuenta=new CajaDeAhorro(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	      cuenta.retirarEfectivo(montoARetirar);
	      cuenta.retirarEfectivo(montoARetirar);
	      cuenta.retirarEfectivo(montoARetirar);
	      cuenta.retirarEfectivo(montoARetirar);
	      cuenta.retirarEfectivo(montoARetirar);
	      cuenta.retirarEfectivo(montoARetirar);
		 valorObtenido=cuenta.obtenerSaldo();
	   
		 assertEquals(valorEsperado,valorObtenido);
	}

}
