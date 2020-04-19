package com.automation.testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerPrueba implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Inicia el Test...");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test finaliza adecuadamente! :)");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("El test falla estrepitosamente :@");
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
