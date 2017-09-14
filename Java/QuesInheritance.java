/*
Write a Class Item with the attributes as itemId, itemName, price
Write a Method void displayItem() which
Create a SubClass of Item as TaxableItem with its own attributes as taxRate and quantity.
TaxableItem class will have a method float calculateBill() which will calculate the bill of the Item.
Also override void displayItem() which will display taxable item details.
*/

class Item
{
    int itemId;
    String itemName;
    int price;

    Item()
    {
        itemId=0;
        itemName="Dummy";
        price=0;
    }
    Item(int itemId,  String itemName, int price)
    {
        this.itemId=itemId;
        this.itemName=itemName;
        this.price=price;
    }

    void displayItem()
    {
        System.out.println("Item Details: ");
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
        System.out.println("");
    }
}

class TaxableItem extends Item
{
    float taxRate;
    int quantity;

    TaxableItem()
    {
        taxRate=10f;
        quantity=1;
    }

    TaxableItem(int itemId,  String itemName, int price, float taxRate, int quantity)
    {
        super(itemId, itemName,price);
        this.taxRate=taxRate;
        this.quantity=quantity;
    }

    float calculateBill()
    {
        return (float)((quantity)*(price*(100+taxRate)/100));
    }

    void displayItem()
    {
        super.displayItem();
        System.out.println("Tax Details: ");
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Quantity: " + quantity);
        System.out.println("");
    }
}

class Main
{
    public static void main(String[] args) {
        TaxableItem taxItem1 = new TaxableItem(1,"Computer", 50000, 20, 2);
        
        taxItem1.displayItem();
        System.out.println("Bill Amount Excluding Tax: " + (float)taxItem1.price*taxItem1.quantity);
        System.out.println("Bill Amount Including Tax: " + taxItem1.calculateBill());
        System.out.println();

        Item item1 = new Item(2, "Laptop", 30000);
        item1.displayItem();

    }
}