<br>Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

<br>To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

<br>Input Format

<br>Every line of input will contain a String followed by an integer.
<br>Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

<br>Output Format

<br>In each line of output there should be two columns:
<br>The first column contains the String and is left justified using exactly 15 characters.
<br>The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

<br>Sample Input

<br>java 100
<br>cpp 65
<br>python 50

<br>Sample Output

<br>================================
<br><pre>java           100
<br>cpp            065 
<br>python         050 </pre>
<br>================================

<br>Explanation

<br>Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
