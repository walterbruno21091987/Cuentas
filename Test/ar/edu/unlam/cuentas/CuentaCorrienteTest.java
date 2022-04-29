package ar.edu.unlam.cuentas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void QueSePuedaCrearUnaCuentaCorriente() {
		Double valorEsperado=4000.0;
		Double valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Double limiteDescubierto=1500.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CuentaCorriente(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial,limiteDescubierto);
	   valorObtenido=cuenta.obtenerSaldo();
	   assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void QueAlExtraerMasDelSueldoSinSuperarElLimiteDescubiertoElSueldoSeaNegativo() {
			Double valorEsperado=-1050.0;
			Double montoARetirar=5000.0;
			Double valorObtenido;
			String nombreTitularCuenta="walter";
			String apellidoTitularCuenta="bruno";
			Double dineroInicial=4000.0;
			Integer numeroDeCuenta=432111335;
			Double limiteDescubierto=1500.0;
			
			CuentaSueldo cuenta=new CuentaCorriente(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial,limiteDescubierto);
		      cuenta.retirarEfectivo(montoARetirar);
			valorObtenido=cuenta.obtenerSaldo();
		     assertEquals(valorEsperado,valorObtenido);
		    
	}
	}


