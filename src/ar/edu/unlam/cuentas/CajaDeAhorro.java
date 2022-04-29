package ar.edu.unlam.cuentas;

public class CajaDeAhorro extends CuentaSueldo {
     private Integer cantidadDeExtracciones;
	public CajaDeAhorro(String nombreTitularCuenta, String apellidoTitularCuenta, Integer numeroDeCuenta,
			Double dineroInicial) {
		super(nombreTitularCuenta, apellidoTitularCuenta, numeroDeCuenta, dineroInicial);
		this.cantidadDeExtracciones=0;
	}
	
public Double montoARetirar(Double montoARetirar) {
	if(this.cantidadDeExtracciones>4) {
		return montoARetirar+=6;
	}
	else {
		return montoARetirar;
	}
}
@Override
public Boolean retirarEfectivo(Double monto) {
    Boolean retirado=false;
   Double SaldoARetirar=montoARetirar(monto);
    
   if(this.saldo.compareTo(SaldoARetirar)>0) {
	   this.cantidadDeExtracciones++;
	   super.saldo=super.saldo-SaldoARetirar;
 retirado=true;
	
	}
	return retirado; 
}

public Integer getCantidadDeExtracciones() {
	return cantidadDeExtracciones;
}

}
