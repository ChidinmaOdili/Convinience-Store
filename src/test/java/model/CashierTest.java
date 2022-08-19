//package model;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CashierTest {
//    static Customer myCustomer;
//
//    static Cashier myCashier;
//
//    @BeforeEach
//    void setUp() {
//        myCustomer = new Customer("Jojo","cake");
//
//        myCashier = new Cashier();
//        myCashier.setCashierName("Nancy");
//    }
//
//    @Test
//    void sellProduct() {
//        String expectedValue = myCustomer.getProductName() + " " + "has been sold to" + " " + myCustomer.getCustomerName() + " "+ "by" + " "+ myCashier.getCashierName();
//        String actualValue = myCashier.sellProduct(myCustomer);
//        assertEquals(expectedValue,actualValue);
//    }
//
//    @Test
//    void issueReceipt() {
//        String expectedValue = "A receipt issued for the purchase of" + " " + myCustomer.getProductName() + " " + "with product number"+ " " + myCustomer.getProductNumber() + " " + "from" + " " + myCustomer.getCustomerName() + " " + "to" + " " + myCustomer.getCustomerName();
//        String actualValue = myCashier.issueReceipt(myCustomer);
//        assertEquals(expectedValue, actualValue);
//    }
//}