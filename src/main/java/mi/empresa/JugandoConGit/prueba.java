package mi.empresa.JugandoConGit;

public class prueba {
private String hola;

public String getHola() {
	return hola;
}

public void setHola(String hola) {
	this.hola = hola;
}

public prueba(String hola) {
	super();
	this.hola = hola;
}

@Override
public String toString() {
	return "prueba [hola=" + hola + "]";
}


}
