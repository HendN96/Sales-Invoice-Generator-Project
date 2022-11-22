
package com.invoice.model;


public class InvoiceLine {
    
 
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private InvoicesTable invoice;
     

    public InvoiceLine() {
    }

    public InvoiceLine( String itemName, double itemPrice, int itemCount, InvoicesTable invoice) {
       
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.invoice = invoice;
    }

     public double getInvoiceLineTotal() {
        return itemPrice * itemCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

   

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "number=" + invoice.getNumber() + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }

   

    public InvoicesTable getInvoice() {
        return invoice;
    }

    public String getAsCSV() {
        return invoice.getNumber() + "," + itemName + "," + itemPrice + "," + itemCount;
    }
}
