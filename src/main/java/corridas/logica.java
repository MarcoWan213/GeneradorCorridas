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
        }
        double resultado = (sumatoria / pseudos.length);
        return resultado;
    }//Eliminable

    double mediaArraylista(ArrayList<Double> pseudos) {
        double sumatoria = 0;
        for (int i = 0; i < pseudos.size(); i++) {
            sumatoria += pseudos.get(i);
        }
        double resultado = (sumatoria / pseudos.size());
        resultado = ((double) Math.round(resultado * 100000d) / 100000d);
        return resultado;
    }

    double varianzaArraylist(ArrayList<Double> pseudos, double media) {
        double sumatoria = 0;
        for (int i = 0; i < pseudos.size(); i++) {
            sumatoria += Math.pow((pseudos.get(i) - media), 2);
        }
        double denominador = pseudos.size();
        double div = 1 / denominador;
        double resultado = div * sumatoria;
        resultado = ((double) Math.round(resultado * 10000000d) / 10000000d);
        return resultado;
    }

    int[] corridasArraylist(ArrayList<Double> pseudos) {
        int[] resultado = new int[pseudos.size() - 1];

        for (int i = 1; i < pseudos.size(); i++) {
            if (pseudos.get(i) <= pseudos.get(i - 1)) {
                resultado[i - 1] = 0;
            } else {
                resultado[i - 1] = 1;
            }
        }
        return resultado;
    }

    int corridasConteo(int[] corridas) {
        int conteo = 0;
        for (int i = 1; i < corridas.length; i++) {
            if (corridas[i] != corridas[i - 1]) {
                conteo++;
            }
        }
        conteo++;
        return conteo;
    }

    double estadisticoZ(int conteo, ArrayList<Double> sizeA) {
        int tamaño = sizeA.size();
        double mc = ((2*tamaño)-1);
        mc /=3;
        double ac = ((16*tamaño)-29);
        ac/=90;        
        double z = (conteo-mc)/Math.sqrt(ac);
        z = Math.pow(z, 2);
        z = Math.sqrt(z);
        z= ((double) Math.round(z * 100000d) / 100000d);
        return z;
    }

}
