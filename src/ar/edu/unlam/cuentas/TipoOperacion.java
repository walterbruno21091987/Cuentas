package ar.edu.unlam.cuentas;

public enum TipoOperacion {
EXTRACCION("EXTRACCION"),DEPOSITO("DEPOSITO");
private String abreviatura;
private TipoOperacion(String abreviatura){
	this.abreviatura=abreviatura;
}
public String getAbreviatura() {
	return abreviatura;
}

}
