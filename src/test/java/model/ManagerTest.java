package model;

import enums.Roles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager manager = Manager.getInstance();
    Cashier cashier = new Cashier("chidinma", Roles.CASHIER);


    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldTestForHire(){
        Assertions.assertTrue(manager.canHire(cashier));
    }
}