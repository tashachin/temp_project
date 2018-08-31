package main.com.shin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static String greetUser() {
        String greeting = "Hello! What language are you studying today?";

        return greeting;

    }

    public static String chooseLanguage(String userInput) {

        String response = "";

        return response;
    }

    public static String chooseMedia(String userInput) {

        String response;

//        if (userInput != "book" && userInput != "photo" && userInput != "song") {
//            return "Sorry, that's not a media type we support. Please choose Book, Song or Photo.";
//        }
        
        switch (userInput) {
            case "book": response = "What would you like to read today?";
            break;

            case "music": response = "What would you like to listen to today?";
            break;

            case "photo": response = "Please choose a place you'd like to visit!";
            break;

            default: response = "Sorry, that's not a media type we support. Please choose Book, Song or Photo.";
            break;
        }

        return response;
    }



    // in the far distant future, we actually talk to users
//    function TellMeStuff() {
//        media = getStdin(stdout.puts(chooseMedia()));
//    }
}
