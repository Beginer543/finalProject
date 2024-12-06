package utils;


import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.MembershipPage;
import pages.LoginPage;

public class PageIntializer {

    public static LoginPage loginPage;
    public static AddEmployeePage addEmployeePage;
    public static MembershipPage membershipPage;
    public static DashboardPage dashboardPage;

    public static void initializePageObjects(){
        loginPage = new LoginPage();
        addEmployeePage = new AddEmployeePage();
        membershipPage = new MembershipPage();
        dashboardPage = new DashboardPage();
    }

}
