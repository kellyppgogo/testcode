#ABOUT THIS APPLICATOIN
Given a string containing digits from 2-9inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

![phone pad](https://github.com/kellyppgogo/testcode/blob/master/src/main/resources/number.png "sample")

Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note: Although the above answer is in lexicographical order, your answer could be in any order you want.

---
#HOW TO USE
1. **Application Entrance: /Users/kellypan/git/digitstoletters/src/main/java/com/hsbc/risk/interview/Converter.java**
2. **Run the main method, the application will prompt with "Please input digits string for letter conversion..."**
3. **Key in valid number from *0-99***
##EXCEPTION HANDLING
1. if invalid number is input, the app will throw exception with "Please input valid number:[0-99]"
2. if empty input, the app will also throw exception with "Your input is empty."


---
#MORE INFORMATION ON THE IMPLEMENTATION
This application use back tracking algorithm to find out all the possible combination result.