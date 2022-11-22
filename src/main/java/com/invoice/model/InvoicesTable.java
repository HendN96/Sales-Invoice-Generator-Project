
package com.invoice.model;

import java.util.ArrayList;


public class InvoicesTable {
    private int number;
    private String date;
    private String customer;
    private ArrayList<InvoiceLine> lines;
    

    public InvoicesTable() {
    }

    public InvoicesTable(int number, String date, String customer) {
        this.number = number;
        this.date = date;
        this.customer = customer;
        
    }
    
     public double getInvoiceTotal() {
        double total = 0.0;
        for (InvoiceLine line : getLines()) {
            total += line.getInvoiceLineTotal();
        }
        return total;
    }
    
    public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

    @Override
    public String toString() {
        return "InvoicesTable{" + "number=" + number + ", date=" + date + ", customer=" + customer + '}';
    }

     public String getAsCSV() {
        return number + "," + date + "," + customer;
    }
}

   