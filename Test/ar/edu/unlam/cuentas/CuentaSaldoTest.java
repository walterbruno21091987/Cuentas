package ar.edu.unlam.cuentas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CuentaSaldoTest {

	@Test
	public void QueSePuedaCrearUnaCuentaSaldo() {
		Double valorEsperado=4000.0;
		Double valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CuentaSueldo(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	   valorObtenido=cuenta.obtenerSaldo();
	   assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void QueSePuedaRetirarDinero() {
		Double valorEsperado=1000.0;
		Double montoARetirar=3000.0;
		Double valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CuentaSueldo(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	      cuenta.retirarEfectivo(montoARetirar);
		valorObtenido=cuenta.obtenerSaldo();
	   assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void QueNoSePuedaRetirarDineroSiEllDineroDeLaCuentaNoAlcanzaParaDichaExtraccion() {
		Double valorEsperado=4000.0;
		Double montoARetirar=5000.0;
		Double valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CuentaSueldo(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	      cuenta.retirarEfectivo(montoARetirar);
		valorObtenido=cuenta.obtenerSaldo();
	   assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void QueCuandoNoSePuedaRetirarArrojeQuelaOperacionNoFueExitosa() {
		Boolean valorEsperado=false;
		Double montoARetirar=5000.0;
		Boolean valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CuentaSueldo(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	     valorObtenido=cuenta.retirarEfectivo(montoARetirar);
		assertEquals(valorEsperado,valorObtenido);
		
	}
	@Test
	public void QueSePuedaIngresarDinero() {
		Double valorEsperado=6000.0;
		Double montoADepositar=2000.0;
		Double valorObtenido;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CuentaSueldo(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	    cuenta.DepositarDinero(montoADepositar); 
		valorObtenido=cuenta.obtenerSaldo();
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void QueSePuedaObtenerLasOperaciones() {
		String valorEsperado="EXTRACCION"+" "+2000.0;
		Double montoADepositar=2000.0;
		List <Movimiento> lista;
		String valorObtenido=null;
		String nombreTitularCuenta="walter";
		String apellidoTitularCuenta="bruno";
		Double dineroInicial=4000.0;
		Integer numeroDeCuenta=432111335;
		CuentaSueldo cuenta=new CuentaSueldo(nombreTitularCuenta,apellidoTitularCuenta,numeroDeCuenta,dineroInicial);
	    cuenta.DepositarDinero(montoADepositar); 
	    lista=cuenta.obtenerMovimientos();
	    for (Movimiento object : lista) {
			valorObtenido=object.ObtenerOperacion();
		}
		assertEquals(valorEsperado,valorObtenido);
		
	}
		
	}


