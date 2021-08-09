/*global window, document, prompt, console*/  //This line of code i used i found online to mitigate the "console,prompt is not defined warning
/*
LAB 1
Name: Vladislav Gudkov
ID: A00921638
Date: January 5, 2020
*/

//PART 1 : script wrapped in one function, executed by window.onload event
function lab1() {
    "use strict";  //using this code to prevent JSLint "use strict statement" warning

//PART 2
    
    var firstname = prompt("plase enter your first name"),
        lastname = prompt("plase enter your last name");
    console.log(firstname + ' ' + lastname); //string concatenation of variables firstname,lastname outputed to console
        
//PART 3
/*
The Difference Between clientWidth and offsetWidth properties

The clientWidth property gets the width of the window without the border     
The offsetWidth property gets the width of the window with the border

The Difference Between data types taken clientWidth and offsetWidth properties

the clientwidth property returns the data type of number; the innier width of an elment in pixels, 
includes padding but not the borders, margins or scroll bars

the offsetwidth property returns the data type of number; the layout width of an element
*/

//PART 4
    var img1 = document.getElementById("img1").width; //initilaize a variable called "img1" with the width of the image that has an id of "img1"
    document.getElementById("img2").width = img1; //assign the width of the image with id "img2" with the width value that is inside variable img1   
    document.getElementById("img3").width = img1; //assign the width of the image with id "img3" with the width value that is inside variable img1
}
window.onload = lab1();