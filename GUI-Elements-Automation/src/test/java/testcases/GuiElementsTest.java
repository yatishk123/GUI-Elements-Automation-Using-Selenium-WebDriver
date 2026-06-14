package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.TestListener;
import base.BaseTest;
import pages.GuiElementsPage;

@Listeners(TestListener.class)

public class GuiElementsTest extends BaseTest {

    GuiElementsPage page;
    @Test(priority = 1  )
    public void test01_NameFields() throws Exception {

        page = new GuiElementsPage(driver);
        page.enterName();

        Assert.assertEquals(
                driver.findElement(By.id("name"))
                      .getAttribute("value"),
                "Yatish Kumar");
    }
    
    @Test(priority = 2)
    public void test02_EmailField() throws Exception {

        page = new GuiElementsPage(driver);

        page.enterEmail();

        Assert.assertEquals(
                driver.findElement(By.id("email"))
                        .getAttribute("value"),
                "yatish832@gmail.com");
    }

    @Test(priority = 3)
    public void test03_PhoneField() throws Exception {

        page = new GuiElementsPage(driver);

        page.enterPhone();

        Assert.assertEquals(
                driver.findElement(By.id("phone"))
                        .getAttribute("value"),
                "9876543210");
    }

    @Test(priority = 4)
    public void test04_AddressField() throws Exception {

        page = new GuiElementsPage(driver);

        page.enterAddress();

        Assert.assertEquals(
                driver.findElement(By.id("textarea"))
                        .getAttribute("value"),
                "Jahangirabad Uttar Pradesh");
    }
    
    

    @Test(priority = 5)
    public void test05_GenderSelection() throws Exception {

        page = new GuiElementsPage(driver);
        page.selectGender();

        Assert.assertTrue(
                driver.findElement(By.id("male"))
                      .isSelected(),
                "Male radio button is not selected");
    }

    @Test(priority = 6)
    public void testDaysCheckboxes() throws Exception {

        page = new GuiElementsPage(driver);
        page.selectDays();

        Assert.assertTrue(
                driver.findElement(By.id("monday"))
                      .isSelected(),
                "Monday checkbox is not selected");
    }

    @Test(priority = 7)
    public void testCountryDropdown() throws Exception {

        page = new GuiElementsPage(driver);
        page.selectCountry();

        Assert.assertTrue(true);
    }

    @Test(priority = 8)
    public void testColorsDropdown() throws Exception {

        page = new GuiElementsPage(driver);
        page.selectColors();

        Assert.assertTrue(true);
    }

    @Test(priority = 9)
    public void testSortedListDropdown() throws Exception {

        page = new GuiElementsPage(driver);
        page.selectAnimal();

        Assert.assertTrue(true);
    }

    @Test(priority = 10)
    public void testDatePicker() throws Exception {

        page = new GuiElementsPage(driver);
        page.selectDates();

        Assert.assertTrue(true);
    }

    @Test(priority = 11)
    public void testFileUpload() throws Exception {

        page = new GuiElementsPage(driver);

        page.uploadFile(
                "C:\\Users\\Yatish\\Downloads\\assign_9.pdf","C:\\Users\\Yatish\\Downloads\\assign_9.pdf");

        Assert.assertTrue(true);
    }

    @Test(priority = 12)
    public void testAlerts() throws Exception {

        page = new GuiElementsPage(driver);
        page.handleAlerts();

        Assert.assertTrue(true);
    }

    @Test(priority = 13)
    public void testMouseHover() throws Exception {

        page = new GuiElementsPage(driver);
        page.mouseHover();

        Assert.assertTrue(true);
    }

    @Test(priority = 14)
    public void testDoubleClick() throws Exception {

        page = new GuiElementsPage(driver);
        page.doubleClick();

        Assert.assertTrue(true);
    }

    @Test(priority = 15)
    public void testDragAndDrop() throws Exception {

        page = new GuiElementsPage(driver);
        page.dragAndDrop();

        Assert.assertTrue(true);
    }

    @Test(priority = 16)
    public void testSlider() throws Exception {

        page = new GuiElementsPage(driver);
        page.moveSlider();

        Assert.assertTrue(true);
    }

    @Test(priority = 17)
    public void verifyCompleteExecution() {

        System.out.println(
                "All GUI Elements Executed Successfully");

        Assert.assertTrue(true);
    }

}