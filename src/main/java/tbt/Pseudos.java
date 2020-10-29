package tbt;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Pseudos extends AbstractTableModel {

    ArrayList<Double> list = new ArrayList<>();

    public Pseudos(ArrayList<Double> resultados) {
        this.list = resultados;
    }

    @Override
    public int getRowCount() {
        return this.list.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        double num = this.list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return num;                
        }
        return null;
    }

}
