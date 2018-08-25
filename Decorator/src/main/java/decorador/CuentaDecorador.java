package decorador;

import inter.ICuentaBancaria;
import model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {
	
	protected ICuentaBancaria cuentaDecoradora;
	
	public CuentaDecorador(ICuentaBancaria cuentaDecoradora) {
		this.cuentaDecoradora = cuentaDecoradora;
	}
	
	@Override
	public void abrirCuenta(Cuenta cuenta) {
		this.cuentaDecoradora.abrirCuenta(cuenta);
	}
	
}
