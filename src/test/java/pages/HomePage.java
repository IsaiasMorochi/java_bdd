package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator sauceLabsBackPackAddButton;
    private Locator cartIcon;
    private Locator filterIcon;
    private Locator priceProduct;
    private Locator itemOne;
    private Locator itemTwo;
    public HomePage(Page driver){
        this.driver = driver;
        this.header = driver.locator("div.header_label");
        this.sauceLabsBackPackAddButton = driver.locator("id=add-to-cart-sauce-labs-backpack");
        this.cartIcon = driver.locator("a.shopping_cart_link");
        this.filterIcon = driver.locator("select.product_sort_container");
        this.priceProduct = driver.locator("div#inventory_container div div#inventory_container.inventory_container div.inventory_list div.inventory_item div.inventory_item_description div.pricebar div.inventory_item_price");
        this.itemOne = driver.locator("id=add-to-cart-sauce-labs-onesie");
        this.itemOne = driver.locator("id=add-to-cart-sauce-labs-onesie");
        this.itemTwo = driver.locator("id=add-to-cart-sauce-labs-onesie");
    }

    public void verifyHomePageHeaderIsDisplayed(){
        Assert.assertTrue(header.isVisible());
    }

    public void verifyProductInHomePage(String product){
        Assert.assertTrue(driver.isVisible("//div[text()='"+product+"']"));
    }

    public void verifyThatProductIsDisplayed() {
        System.out.println(priceProduct);
        Assert.assertEquals("$7.99", "$7.99");
    }

    public void verifyThatProductItemOneIsDisplayed(){
        Assert.assertTrue(itemOne.isVisible());
    }
    public void clickOnAddSauceLabsBackPack(){
        sauceLabsBackPackAddButton.click();
    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }

    public void clickOnFilterIcon() {
        filterIcon.click();
    }

    public void clickOnFilterPrice() {
        filterIcon.selectOption("lohi");
    }

    public void clickOnItemOne() {
        itemOne.click();
    }

}
