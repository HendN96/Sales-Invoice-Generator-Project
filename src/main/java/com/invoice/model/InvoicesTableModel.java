
package com.invoice.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoicesTableModel extends AbstractTableModel {
   private ArrayList<InvoicesTable> invoices;
   private String[] headers={"No.", "Date", "Customer", "Total"};
   
    public InvoicesTableModel(ArrayList<InvoicesTable> invoices) {
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
       return invoices.size();
       
    }

    @Override
    public int getColumnCount() {
       return headers.length;
       
    }
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         InvoicesTable invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNumber();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
   
    
}
