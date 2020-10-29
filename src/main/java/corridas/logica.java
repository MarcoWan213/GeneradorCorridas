package corridas;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class logica {

    double[] arraylistToArray(ArrayList<Double> cambiar) {
        double[] numeros = new double[cambiar.size()];
        for (int i = 0; i < cambiar.size(); i++) {
            numeros[i] = cambiar.get(i);
        }
        return numeros;
    }

    double media(double[] pseudos) {
        double sumatoria = 0;
        for (int i = 0; i < pseudos.length; i++) {
            sumatoria += pseudos[i];
            System.out.println(pseudos[i]);
        }
        double resultado = (sumatoria / pseudos.length);
        return resultado;
    }

    double mediaArraylista(ArrayList<Double> pseudos) {
        double sumatoria = 0;
        for (int i = 0; i < pseudos.size(); i++) {
            sumatoria += pseudos.get(i);
            System.out.println(pseudos.get(i));
        }
        double resultado = (sumatoria / pseudos.size());
        return resultado;
    }

}
