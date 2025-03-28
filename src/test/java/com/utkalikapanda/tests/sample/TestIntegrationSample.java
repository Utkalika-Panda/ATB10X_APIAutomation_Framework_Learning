package com.utkalikapanda.tests.sample;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Owner;

public class TestIntegrationSample {

    //Create a booking , create a Token
    //Verify the get booking
    //Update Booking
    //Delete Booking

@Test(groups = "QA", priority = 1)
@Owner("Utkalika")
@Description ("Testcase-1 - Verify create booking")
    public void testCreatebooking(){
        Assert.assertTrue(true);
    }
    @Test(groups = "QA", priority = 1)
    @Owner("Utkalika")
    @Description ("Testcase-2 - Verify get booking")
    public void testgetbooking(){
        Assert.assertTrue(true);
    }
    @Test(groups = "QA", priority = 1)
    @Owner("Utkalika")
    @Description ("Testcase-3 - Verify update booking")
    public void updatebooking(){
        Assert.assertTrue(true);
    }
    @Test(groups = "QA", priority = 1)
    @Owner("Utkalika")
    @Description ("Testcase-4 - Verify delete booking")
    public void deletebooking(){
        Assert.assertTrue(true);
    }
}
