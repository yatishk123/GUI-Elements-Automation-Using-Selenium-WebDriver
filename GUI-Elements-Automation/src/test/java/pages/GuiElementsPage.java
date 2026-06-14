package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GuiElementsPage {

    WebDriver driver;

    public GuiElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    
    // Text Fields
    
    
    public void enterName() throws Exception {

        driver.findElement(By.id("name"))
              .sendKeys("Yatish Kumar");
        Thread.sleep(1000);

    }
    public void enterEmail() throws Exception
    {
    	driver.findElement(By.id("email"))
        .sendKeys("yatish832@gmail.com");
          Thread.sleep(1000);
    }
     
    public void enterPhone() throws Exception
   
    {
    	 driver.findElement(By.id("phone"))
         .sendKeys("9876543210");
           Thread.sleep(1000);	
    }
    public void enterAddress() throws Exception
    {
    	driver.findElement(By.id("textarea"))
        .sendKeys("Jahangirabad Uttar Pradesh");
           Thread.sleep(1000);
    }
    
    
    
    
    // Radio Button
    public void selectGender() throws Exception {

        driver.findElement(By.id("male")).click();
        Thread.sleep(2000);
    }

    // Checkboxes
    public void selectDays() throws Exception {

        driver.findElement(By.id("monday")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("wednesday")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("friday")).click();
        Thread.sleep(2000);
    }

    // Country Dropdown
    public void selectCountry() throws Exception {

        Select country =
                new Select(driver.findElement(By.id("country")));

        country.selectByVisibleText("India");
        Thread.sleep(2000);
    }

    // Colors Dropdown
    public void selectColors() throws Exception {

        Select colors =
                new Select(driver.findElement(By.id("colors")));

        colors.selectByVisibleText("Red");
        Thread.sleep(2000);
        colors.selectByVisibleText("Blue");
        Thread.sleep(2000);
    }

    // Sorted List
    public void selectAnimal() throws Exception {

        Select animal =
                new Select(driver.findElement(By.id("animals")));

        animal.selectByVisibleText("Lion");
        Thread.sleep(2000);
    }

    // Date Pickers
    public void selectDates() throws Exception {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        WebElement date1 =
                driver.findElement(By.id("datepicker"));

        js.executeScript(
                "arguments[0].value='01/06/2026';",
                date1);
        Thread.sleep(2000);

        WebElement date2 =
                driver.findElement(By.id("txtDate"));

        js.executeScript(
                "arguments[0].value='05/06/2026';",
                date2);
        Thread.sleep(2000);

        driver.findElement(By.id("start-date"))
              .sendKeys("12-05-2004");
        Thread.sleep(2000);

        driver.findElement(By.id("end-date"))
              .sendKeys("15-05-2004");
        Thread.sleep(2000);
        driver.findElement(
                By.xpath("//button[@class='submit-btn']"))
                .click();
        Thread.sleep(2000);
    }

    // File Upload
    public void uploadFile(String filePath,String filePath1) throws Exception {

        driver.findElement(By.id("singleFileInput"))
              .sendKeys(filePath);

        driver.findElement(
                By.xpath("//button[text()='Upload Single File']"))
                .click();
        
        Thread.sleep(3000);
        driver.findElement(By.id("multipleFilesInput"))
        .sendKeys(filePath1);

  driver.findElement(
          By.xpath("//button[text()='Upload Multiple Files']"))
          .click();

        Thread.sleep(3000);
    }

    // Alerts
    public void handleAlerts() throws Exception {

        driver.findElement(By.id("alertBtn")).click();
        Alert alert =
                driver.switchTo().alert();

        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.id("confirmBtn")).click();

        Alert confirm =
                driver.switchTo().alert();

        confirm.accept();
        Thread.sleep(2000);

        driver.findElement(By.id("promptBtn")).click();

        Alert prompt =
                driver.switchTo().alert();

        prompt.sendKeys("Yatish");

        prompt.accept();
        Thread.sleep(2000);
    }

    // Mouse Hover
    public void mouseHover() throws Exception {

        Actions act =
                new Actions(driver);

        WebElement hover =
                driver.findElement(
                By.xpath("//button[text()='Point Me']"));

        act.moveToElement(hover).perform();

        Thread.sleep(3000);
    }

    // Double Click
    public void doubleClick() throws Exception {

        Actions act =
                new Actions(driver);

        WebElement copyBtn =
                driver.findElement(
                By.xpath("//button[text()='Copy Text']"));

        act.doubleClick(copyBtn).perform();
        Thread.sleep(3000);
    }

    // Drag and Drop
    public void dragAndDrop() throws Exception {

        Actions act =
                new Actions(driver);

        WebElement source =
                driver.findElement(By.id("draggable"));

        WebElement target =
                driver.findElement(By.id("droppable"));

        act.dragAndDrop(source, target)
                .perform();
        Thread.sleep(3000);
    }

    // Slider
    public void moveSlider() throws Exception {

        Actions act =
                new Actions(driver);

        WebElement slider =
                driver.findElement(
                By.xpath("//span[contains(@class,'ui-slider-handle')]"));

        act.dragAndDropBy(slider, 80, 0)
                .perform();

        Thread.sleep(3000);
    }
}
