package ar.edu.unlam.cuentas;

public class CuentaCorriente extends CuentaSueldo {
    private Double limiteDescubierto;
	public CuentaCorriente(String nombreTitularCuenta, String apellidoTitularCuenta, Integer numeroDeCuenta,
			Double dineroInicial,Double limiteDescubierto) {
		super(nombreTitularCuenta, apellidoTitularCuenta, numeroDeCuenta, dineroInicial);
	    this.limiteDescubierto=limiteDescubierto;
		}
@Override

	public Boolean retirarEfectivo(Double montoARetirar) {
    Double disponibleTotal=this.saldo+limiteDescubierto;    
	Double interes;
    Boolean retirado=false;
		
        if(disponibleTotal.compareTo(montoARetirar)>0) {
		disponibleTotal=disponibleTotal-montoARetirar;
	    interes=((montoARetirar-this.saldo)*5)/100;
		super.saldo=(super.saldo-montoARetirar)-interes;
		retirado=true;
		}
		return retirado; 
	}

}
