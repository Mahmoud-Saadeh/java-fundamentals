# java-fundamentals

This repo is for practicing Java starting from the very basics

## basics

1. In the [basics](basics) folder in [Main](basics/Main.java) file I have a class with 3 methods:
   - pluralize: is for making the input word plural or keep it singular based on the number
   - flipNHeads: is for counting how many time we need to at least get the specified number of heads in a row
   - clock: To print the time every second and show how many Hertz the program is operating at
    
## basic Library

1. In the [basiclibrary](basiclibrary) folder in [Library](basiclibrary/lib/src/main/java/basiclibrary/Library.java) file I have 4 methods:
   - roll: accept integer as input and return and array with a length of the input and random values from 1 to 6
   - containsDuplicates: accept an array of integer as input and return true if there was duplicates and false if there wasn't
   - average: accept an array of integer and return the average of that array
   - lowestAvg: accept an array of integer arrays and return the array with the lowest average
   - In the [test](basiclibrary/lib/src/test/java/basiclibrary/LibraryTest.java) file I have a test for every method
    
## Linter
1. In the [linter](linter/app/src/main/java/linter) folder in [App](linter/app/src/main/java/linter/App.java) file I have 1 method:
   - missingSemicolon: this method accept a path to a file and check every line for missing semicolons and ignore the line if:
     - line ends With }
     - line ends With {
     - line contains if
     - line contains else
     - line starts With //
     - empty lines
   - In the [test](linter/app/src/test/java/linter/AppTest.java) file I have a test for the method to check if the number of lines that have missing semicolons is right.

## Inheritance

1. In the [inheritance](inheritance/lib/src/main/java/inheritance) folder I have 2 classes:
    - [Restaurant](inheritance/lib/src/main/java/inheritance/Restaurant.java): In this class there is a constructor to define the variables and there are getters and setters 
        - there is an array list to store all the reviews for a restaurant
        - when a review is added the stars for that restaurant is going to change according to the average of the stars
        - there is toString method to print all the defined fields
    - [Review](inheritance/lib/src/main/java/inheritance/Review.java): In this class there is a constructor to define the variables and there are getters and setters
        - I created a field with type of restaurant to associate the restaurant with multiple reviews
        - a plural method to return if the stars are plural or singular
        - there is toString method to print all the defined fields
    - [Shop](inheritance/lib/src/main/java/inheritance/Shop.java): In this class there is a constructor to define the variables and there are getters and setters
        - I created fields for name, description, numberOfDollarSigns and reviews
        - a method to add reviews to the shop
        - there is toString method to print all the defined fields
   - [Theater](inheritance/lib/src/main/java/inheritance/Theater.java): In this class there is a constructor to define the variables and there are getters and setters
       - I created fields for name, Movies, and reviews
       - a method to add reviews to the shop
       - there is toString method to print all the movies in the list field
       - Two methods to delete and add a movie
   - [AddReview](inheritance/lib/src/main/java/inheritance/AddReview.java): In this interface there is a method that accepts a Review object
   - [DollarSigns](inheritance/lib/src/main/java/inheritance/DollarSigns.java): In this interface there is a method for converting the number of dollar signs to dollar signs
    
1. In the [LibraryTest](inheritance/lib/src/test/java/inheritance/LibraryTest.java) file there are test for every method:
    - RestaurantConstTest: is a test to make sure the Restaurant constructor is behaving reasonably
    - ReviewConstTest: is a test to make sure the Review constructor is behaving reasonably
    - AddRestaurantReviewTest: is a test to ensure that there are some connection between the restaurants, and the reviews, and to check the average of the stars and to make sure every review has been added
    - ReviewToSting & RestaurantToSting: to test the toSting methods in both classes
    - ShopConstTest: test the constructor in the shop class
    - AddShopReviewTest: test if add review works for the shops
    - AddRemoveMovieTest: test if we can add and remove movies
    - AddTheaterReviewTest: test if add review works for the theater with and without the movie name