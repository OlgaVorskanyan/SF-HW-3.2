package org.example.locators;
import org.openqa.selenium.By;

public class CartPageLocators {

    public static final By CartCheckoutLocator   = By.id("path22");
    public static final By ConfirmCheckoutLocator = By.xpath("//*[@id=\"cart_content_ajax\"]/div[3]/a");
    public static final By RemoveItemLocator = By.xpath("//*[@id=\"cart1\"]/div/table/tbody/tr[1]/td[3]/div/span[2]/button[2]/i");
    public static final By GetEmptyCartLocator = By.xpath("//*[@id=\"content\"]");

}