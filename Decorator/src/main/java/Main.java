import decorador.BlindajeDecorador;
import inter.ICuentaBancaria;
import inter.impl.CuentaAhorro;
import model.Cuenta;

public class Main {

	public static void main(String[] args) {

		Cuenta c = new Cuenta(1, "Edwin"); 
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		
		System.out.println("**************************************");
		System.out.println("************* Decorator **************");
		System.out.println("**************************************");
		cuentaBlindada.abrirCuenta(c);
		cuenta.abrirCuenta(c);
		System.out.println("**************************************");
		
	}

}
