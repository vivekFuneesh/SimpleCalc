# SimpleCalc
A Simple calculator Rest API in Spring along with "evaluating expression" facility

                                         Under GPL v3 License 
   
   Supports add, subtract, multiply, divide, expression functions.
   
   To run in interactive mode(USING BROWSER), go to HOST:PORT/SimpleCalc/index.jsp
      Here, HOST can be like localhost and PORT can be like 8080
   
   To call rest service, use::
   1.) /SimpleCalc/add?a=FIRST_VALUE&b=SECOND_VALUE 
        Here FIRST_VALUE is a and SECOND_VALUE is b in a + b.
    
    
   2.) /SimpleCalc/subtract?a=FIRST_VALUE&b=SECOND_VALUE 
        Here FIRST_VALUE is a and SECOND_VALUE is b in a - b.
        
        
   3.) /SimpleCalc/multiply?a=FIRST_VALUE&b=SECOND_VALUE 
        Here FIRST_VALUE is a and SECOND_VALUE is b in a * b.
        
        
   4.) /SimpleCalc/divide?a=FIRST_VALUE&b=SECOND_VALUE 
        Here FIRST_VALUE is a and SECOND_VALUE is b in a / b.
        
        
   5.) /SimpleCalc/expr?expr=EXPRESSION 
        Here EXPRESSION is like 2*3%2B5 (Note that url passed in non-interactive mode must be <a href="http://www.w3schools.com/tags/ref_urlencode.asp">URL ENCODED.</a> For eg. %2B is for + sign  
    
 For add, subtract, multiply, divide "a" and "b" are parameters.. without quotes.
 For expression "expr" is parameter.. without quotes.
 
 Edit pom.properties file to your machine's path for folder.
 Spring MVC has been used.
 IDE:: Eclipse, on Windows 7.
 Tomcat.
