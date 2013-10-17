package edu.upc.eetac.dsa.rodrigo.sampedro.clasesesencialesii;

import edu.upc.eetac.dsa.rodrigo.sampedro.clases.CuentaAtras;
import edu.upc.eetac.dsa.rodrigo.sampedro.clases.CuentaRunnable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ejecucionde 8 y 9 con modificaciones de 10
		
    			// Ex 8 Ejmeplos clase thread
    			CuentaAtras contador1 = new CuentaAtras("ID1", 5);
    			CuentaAtras contador2 = new CuentaAtras("ID2", 7);
    			CuentaAtras contador3 = new CuentaAtras("ID3", 11);

    			contador1.start();
    			contador2.start();
    			contador3.start();

    			// Ex 9 Ejemplos interface Runnable
    			CuentaRunnable run1 = new CuentaRunnable("ID4", 7);
    			CuentaRunnable run2 = new CuentaRunnable("ID5", 10);
    			CuentaRunnable run3 = new CuentaRunnable("ID6", 9);
    			
    			try {
    			(new Thread(run1)).start();
    			(new Thread(run2)).start();
    			(new Thread(run3)).start();
    			} catch (Exception e) {
    				// Printamos las excepciones que aparezcan
    				e.printStackTrace();
    		    }

    			// EX 10
    			//implementar modificaciones en ejericios 8-9
    			
    			//ex 11 ponemso unsyncroniced en las funciones
    			
    }
}
