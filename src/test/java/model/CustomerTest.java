//package model;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CustomerTest {
//    static Customer myCustomer;
//    //static Products myProduct;
//
//    @BeforeEach
//    void setUp() {
//        myCustomer = new Customer("Jojo","cake",42, 3);
//
//    }
//
//    @Test
//    void canBuy() {
//        String expectedValue = "Mr/Mrs/Miss" + " "+ myCustomer.getCustomerName() + " " + "bought"+  " " + "a" + " "+ myCustomer.getProductName();
//        String actualValue = myCustomer.canBuy();
//        assertEquals(expectedValue, actualValue);
//    }
//}