package com.automation.testing;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.GregorianCalendar;

public class AutomationTests {

    private void printDate() {
        GregorianCalendar hoy = new GregorianCalendar();
        System.out.println(hoy.getTime());
    }

    @BeforeMethod
    public void loginUser() {
        System.out.println("Login de usuario X");
    }

    @AfterMethod
    public void logoutUser() {
        System.out.println("Logout de usuario X");
    }

    @BeforeSuite
    public void openBrowser() {
        printDate();
        System.out.println("Abrí el navegador");
    }

    @BeforeTest
    public void nuevoUsuario() {
        printDate();
        System.out.println("Listo el usuario");
    }

    @AfterTest
    public void terminoTest() {
        System.out.println("Terminó test");
    }

    @Parameters({"stringA", "stringB"})
    @Test
    public void testConcat(String a, String b) {
        printDate();
        String res = a + b;
        Assert.assertEquals(res, "I love test automation");
    }

    @Parameters({"stringA", "stringC"})
    @Test
    public void testConcat2(String a, String c) {
        printDate();
        String res = a + c;
        Assert.assertEquals(res, "I love test Java");
    }

    @Test(groups = {"g1"})
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(groups = {"g1", "g2"})
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(groups = {"g1"})
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(groups = {"g1"})
    public void test4() {
        System.out.println("Test 4");
    }

    @Parameters({"browser"})
    @Test(groups = {"g3"})
    public void testSwtich(String testString) {

        switch (testString) {
            case "Chrome":
                System.out.println("Entro chrome");
                break;
            case "Firefox":
                System.out.println("Entro firefox");
                break;
            default:
                System.out.println("Que carajos pidio");
                break;
        }
    }
}
