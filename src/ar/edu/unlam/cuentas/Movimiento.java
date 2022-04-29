package ar.edu.unlam.cuentas;

public class Movimiento {
  private TipoOperacion operacion;
  private Double cantidadDinero;
  
  public Movimiento(TipoOperacion operacion,Double cantidadDinero) {
	  this.cantidadDinero=cantidadDinero;
	  this.operacion=operacion;
  }
  
  public String ObtenerOperacion() {
	  String operacion=this.operacion.getAbreviatura();
	  return operacion+" "+this.cantidadDinero;
	  }
}