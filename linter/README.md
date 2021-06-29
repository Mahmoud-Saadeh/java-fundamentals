# Linter readme

1. In the [linter](app/src/main/java/linter) folder in [App](app/src/main/java/linter/App.java) file I have 1 method:
    - missingSemicolon: this method accept a path to a file and check every line for missing semicolons and ignore the line if:
        - line ends With }
        - line ends With {
        - line contains if
        - line contains else
        - line starts With //
        - empty lines
    - In the [test](app/src/test/java/linter/AppTest.java) file I have a test for the method to check if the number of lines that have missing semicolons is right.
