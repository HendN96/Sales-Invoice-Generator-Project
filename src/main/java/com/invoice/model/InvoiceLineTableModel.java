
package com.invoice.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceLineTableModel extends AbstractTableModel{
    
    private ArrayList<InvoiceLine> lines;
    private String[] headers= {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public InvoiceLineTableModel(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    
            
   public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    @Override
    public int getRowCount() {
       return lines.size();
    }

    @Override
    public int getColumnCount() {
       return headers.length; 
       
    }
   @Override
    public String getColumnName(int x) {
        return headers[x];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       InvoiceLine line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getNumber();
            case 1: return line.getItemName();
            case 2: return line.getItemPrice();
            case 3: return line.getItemCount();
            case 4: return line.getInvoiceLineTotal();
            default : return "";
        }
    }
}
    