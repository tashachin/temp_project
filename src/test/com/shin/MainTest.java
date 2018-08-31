package test.com.shin;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.PrintStream;

import static main.com.shin.Main.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

//    As a user
//    I want to supplement my language learning
//    I should be asked what language I'm studying

    // step 1: greet user, ask for language
    @Test
    public void greetUser_testUserPrompt_displayPrompt() {
        String languagePrompt = "Hello! What language are you studying today?";
        assertEquals(languagePrompt, greetUser());
    }

    // step 2: take in language, ask for media !!!! FIX ME !!!!
    @Test
    public void chooseLanguage_testUserPrompt_displayPrompt() {
        String usersLanguage = "French";
        String mediaPrompt = "Great! Would you like books or songs in " + usersLanguage + "? Or do you want to see photos?";
        assertEquals(usersLanguage, mediaPrompt);
    }

    // step 3: take in media, ask for next
    @Test
    public void chooseMedia_testMusic_displayLocationFilter() {
        String musicInput = "music";
        String musicResponse = "What would you like to listen to today?";
        assertEquals(musicResponse, chooseMedia(musicInput));
    }

//    Then the filters should contain "Artist"
    // Displays a list of options to user
    // Based on what user chooses, output will change

//    When I select "Advanced" from "Difficulty"
//    And I select "Romance" from "Topic"
//    Then I should see a list containing "The Very Fancy Language of Love"
//
//    When I select "Book" from "Media"

    @Test
    public void chooseMedia_testBook_displayLocationFilter() {
        String bookInput = "book";
        String bookResponse = "What would you like to read today?";
        assertEquals(bookResponse, chooseMedia(bookInput));
    }

//    Then the filters should contain "Author"
//    When I select "Advanced" from "Difficulty"
//    And I select "Romance" from "Topic"
//    Then I should see a list containing "Farewell My Concubine"
//
//    When I select "Photography" from "Media"

    @Test
    public void chooseMedia_testPhotography_displayLocationFilter() {
        String photoInput = "photo";
        String photoResponse = "Please choose a place you'd like to visit!";
        assertEquals(photoResponse, chooseMedia(photoInput));
    }
//    Then the filters should contain "Location"
//    When I select "New Zealand"
//    Then I should see a list containing "My Great Sheepventure"


//    When I enter "SomethingBogus"
//    Then I should see "Sorry, that's not a media type we support. Please choose Book, Song or Photo."

    @Test
    public void chooseMedia_testBogusInput_throwError() {
        String bogusInput = "not a real thing";
        String errorMessage = "Sorry, that's not a media type we support. Please choose Book, Song or Photo.";
        assertEquals(errorMessage, chooseMedia(bogusInput));
    }

}