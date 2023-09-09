package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class OilsElement {
    WebDriver driver;
    private Set<String> windowHandles;

    By Coups =By.xpath("//h5[normalize-space()='Cookups']");
    By search=By.xpath("//input[@placeholder='Search for Dishes or Cooks']");
    /*By itemName=By.xpath("//input[@type=\"search\"]");*/
    By selectItem=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/button[1]");
    By orderNow=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[2]/button[1]");







    public OilsElement(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void Cookups() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Coups).click();
        //driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));

        windowHandles = driver.getWindowHandles();
    }

    public void switchToCockup() throws InterruptedException {
        // Switch to the cockup tab
        String cockupWindowHandle = windowHandles.toArray()[1].toString();
        driver.switchTo().window(cockupWindowHandle);
    }
        // Get the list of all window handles
    /*public void Sam(){
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parent = (String) it.next();
        String child = (String) it.next();
        driver.switchTo().window(child);
        }*/





    public void Search(String name) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(search).sendKeys(name);

    }
    /*public void ItemName(String name) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(itemName).sendKeys(name);

    }

     */

    public void SelectItem() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(selectItem).click();


    }
    public void OrderNow() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement( orderNow).click();

    }
    public void switchBackToChaldal() {
        // Switch back to the chaldal tab
        String chaldalWindowHandle = windowHandles.toArray()[0].toString();
        driver.switchTo().window(chaldalWindowHandle);
    }

}
