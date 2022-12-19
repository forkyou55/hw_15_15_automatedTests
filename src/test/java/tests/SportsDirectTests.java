package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SportsDirectPage;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;


public class SportsDirectTests extends TestBase {
    SportsDirectPage sportsDirectPage = new SportsDirectPage();


    @Test
    @DisplayName("Click on Accept cookies button")
    void cookies() {
        sportsDirectPage
                .openPage()
                .cookies();
    }


    @Test
    @DisplayName("Check menu item name")
    void checkMenuItems() {
        sportsDirectPage
                .openPage()
                .cookies()
                .checkMenuItems();
    }


    @Test
    @DisplayName("Checking shoes in stock")
    void shoesSearchTest() {
        sportsDirectPage
                .openPage()
                .search("new balance 1880").search("new balance 1880")
                .cookies()
                .checkInSearchResults("1880");
    }

    @Test
    @DisplayName("Checking country selection")
    void countrySearchTest() {
        sportsDirectPage.
                openPage()
                .cookies()
                .checkCountySelection()
                .checkCountySelectionLanguage();
    }

    @Test
    @DisplayName("Add and remove item in bag")
    void bagTest() {
        sportsDirectPage
                .openPage()
                .cookies()
                .search("Germany CB Bag 24")
                .addAndRemoveItem();
    }

}
