package com.prlbank.pages;

import com.prlbank.utilities.Driver;
import sun.jvm.hotspot.debugger.cdbg.BaseClass;
import sun.jvm.hotspot.debugger.cdbg.Type;

public class PageInitializer extends Driver {
    /**
     * initializes all pages class and stores references in static variables
     * that will called/used in test classes
     */
    public static PRLAccountsPage prlAccountsPage;
    public static PRLAdminHomePage prlAdminHomePage;
    public static PRLCreateOrEditACustomerPage prlCreateOrEditACustomerPage;
    public static PRLCreateOrEditAnAccountPage prlCreateOrEditAnAccountPage;
    public static PRLCustomersPage prlCustomersPage;
    public static PRLEmployeePage prlEmployeePage;
    public static PRLHomePage prlHomePage;
    public static PRLManagerHomePage prlManagerHomePage;
    public static PRLRegistrationPage prlRegistrationPage;
    public static PRLResetPasswordPage prlResetPasswordPage;
    public static PRLSignInPage prlSignInPage;
    public static PRLUserPage prlUserPage;
    public static PRLUserSettingsPage prlUserSettingsPage;

    public static void initialize() {
        prlAccountsPage = new PRLAccountsPage();
        prlAdminHomePage = new PRLAdminHomePage();
        prlCreateOrEditACustomerPage = new PRLCreateOrEditACustomerPage();
        prlCreateOrEditAnAccountPage = new PRLCreateOrEditAnAccountPage();
        prlCustomersPage = new PRLCustomersPage();
        prlEmployeePage = new PRLEmployeePage();
        prlHomePage = new PRLHomePage();
        prlManagerHomePage = new PRLManagerHomePage();
        prlRegistrationPage = new PRLRegistrationPage();
        prlResetPasswordPage = new PRLResetPasswordPage();
        prlSignInPage = new PRLSignInPage();
        prlUserPage = new PRLUserPage();
        prlUserSettingsPage = new PRLUserSettingsPage();

    }
}

