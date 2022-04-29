package ar.edu.unlam.cuentas;

import java.util.ArrayList;
import java.util.List;

public class CuentaSueldo {
    private List <Movimiento> misMovimientos;
	private String nombreTitularCuenta;
	private String apellidoTitularCuenta;
	private Integer numeroCuenta;
	protected Double saldo;

	public CuentaSueldo(String nombreTitularCuenta, String apellidoTitularCuenta, Integer numeroDeCuenta,
			Double dineroInicial) {
		// TODO Auto-generated constructor stub
	this.nombreTitularCuenta=nombreTitularCuenta;
	this.apellidoTitularCuenta=apellidoTitularCuenta;
	this.numeroCuenta=numeroDeCuenta;
	this.saldo=dineroInicial;
	this.misMovimientos=new ArrayList<Movimiento>();
	}

	public String getNombreTitularCuenta() {
		return nombreTitularCuenta;
	}

	public String getApellidoTitularCuenta() {
		return apellidoTitularCuenta;
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public Double obtenerSaldo() {
		return this.saldo;
	}

	public Boolean retirarEfectivo(Double montoARetirar) {
        Movimiento nuevoMovimiento;   
		Boolean retirado=false;
		if(this.saldo.compareTo(montoARetirar)>0) {
		nuevoMovimiento=new Movimiento(TipoOperacion.EXTRACCION,montoARetirar);
			this.saldo=this.saldo-montoARetirar;
	    this.misMovimientos.add(nuevoMovimiento);
		retirado=true;
		}
		return retirado; 
	}

	public void DepositarDinero(Double montoADepositar) {
		Movimiento nuevoMovimiento;   
		nuevoMovimiento=new Movimiento(TipoOperacion.EXTRACCION,montoADepositar);
		this.misMovimientos.add(nuevoMovimiento);
		this.saldo+=montoADepositar;
	}

	public List obtenerMovimientos() {
		// TODO Auto-generated method stub
		return this.misMovimientos;
	}

}
