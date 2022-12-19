package pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SportsDirectPage {

    private SelenideElement
            allCookies = $("#onetrust-accept-btn-handler"),
            saleButton = $("#lnkTopLevelMenu_2845624"),
            wcButton = $("#lnkTopLevelMenu_2845744"),
            christmasButton = $("#lnkTopLevelMenu_2845746"),
            mensButton = $("#lnkTopLevelMenu_2845849"),
            womensButton = $("#lnkTopLevelMenu_2845968"),
            kidsButton = $("#lnkTopLevelMenu_2846084"),
            sportsButton = $("#lnkTopLevelMenu_2846204"),
            brandsButton = $("#lnkTopLevelMenu_2846647"),
            gameButton = $("#lnkTopLevelMenu_2846899"),
            uscButton = $("#lnkTopLevelMenu_2846915"),
            addItem = $("#ProductStandardAddToBag"),
            bagDirectory = $("#bagQuantityContainer"),
            removeItem = $(".s-basket-remove-button"),
            searchInput = $("#txtSearch"),
            searchResultShoes = $("#FiltersAndProductsWrapper"),
            preLanguageButton = $(".editCountryCurrency"),
            LanguageButton = $(".languageSelector");


    public SportsDirectPage openPage() {
        step("Open 'https://www.sportsdirect.com/", () ->
                open(""));
        return this;
    }

    public SportsDirectPage cookies() {
        step("click on Accept cookies button", () ->
                allCookies.click());
        return this;
    }

    public void checkMenuItems() {
        step("Check menu item name 'Sale'", () ->
                saleButton.shouldHave(text("Sale")));
        step("Check menu item name 'World Cup'", () ->
                wcButton.shouldHave(text("World Cup")));
        step("Check menu item name 'Christmas'", () ->
                christmasButton.shouldHave(text("Christmas")));
        step("Check menu item name 'Mens'", () ->
                mensButton.shouldHave(text("Mens")));
        step("Check menu item name 'Womens'", () ->
                womensButton.shouldHave(text("Womens")));
        step("Check menu item name 'Kids'", () ->
                kidsButton.shouldHave(text("Kids")));
        step("Check menu item name 'Sports'", () ->
                sportsButton.shouldHave(text("Sports")));
        step("Check menu item name 'Brands'", () ->
                brandsButton.shouldHave(text("Brands")));
        step("Check menu item name 'GAME'", () ->
                gameButton.shouldHave(text("GAME")));
        step("Check menu item name 'GAME'", () ->
                uscButton.shouldHave(text("USC")));
    }

    public SportsDirectPage search(String text) {
        step("Enter text for input", () ->
                searchInput.setValue(text)).pressEnter();
        return this;
    }

    public void checkInSearchResults(String headerText) {
        step("Checking shoes 1880 in stock", () ->
                searchResultShoes.shouldHave(text(headerText)));

    }

    public SportsDirectPage checkCountySelection() {
        step("Click on button 'Country'", () ->
                preLanguageButton.click());
        return this;
    }

    public void checkCountySelectionLanguage() {
        step("Click on button 'Serbia'", () ->
                LanguageButton.click());
    }

    public void addAndRemoveItem() {
        step("Add item in bag", () ->
                addItem.click());
        step("Check item bag", () ->
                bagDirectory.click());
        step("Check item bag", () ->
                removeItem.click());
    }
}