package decorador;

import inter.ICuentaBancaria;
import model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}
	
	@Override
	public void abrirCuenta(Cuenta cuenta) {
		cuentaDecoradora.abrirCuenta(cuenta);
		agregarBlindaje(cuenta);
	}

	public void agregarBlindaje(Cuenta cuenta) {		
		System.out.println("Se agregó blindaje a la cuenta del cliente " + cuenta.getCliente());
	}
	
}
