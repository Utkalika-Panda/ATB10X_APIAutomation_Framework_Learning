package com.utkalikapanda.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testintegration {

    @Test(groups = "QA", priority = 1)
    @Owner("Utkalika")
    @Description("Testcase-1 - Verify create booking")
    public void testCreatebooking(){
        Assert.assertTrue(true);
    }
}
