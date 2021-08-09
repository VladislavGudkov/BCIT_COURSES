/*global window, document, alert*/  //This line of code i used i found online to mitigate the "console,prompt is not defined warning
/*
LAB 2
Name: Vladislav Gudkov
ID: A00921638
Date: January 17, 2020
*/

//PART 1 
function lab2() {
    "use strict";  //using this code to prevent JSLint "use strict statement" warning

//variable declaration
    var i,
        date = new Date(),
        h = date.getHours(),
        m = date.getMinutes(),
        hyperlink = document.links,
        div = document.getElementsByTagName("div"),
        //r = Math.floor(Math.random() * 255),
        //g = Math.floor(Math.random() * 255),
        //b = Math.floor(Math.random() * 255),
        usernames = [
        
            "Sophia",
            "Gabriel",
            "Jason",
            "Vlad",
            "Chris",
            "Robert"
        ];


    
    //PART 1 : Alerts the time in the format hh:mm 
    alert("The current time is " + h + ":" + m);
  
    
    //PART 2 : For loop for listing all elements in the array "usernames" with the letter "i"
    for (i = 0; i < usernames.length; i += 1) {
        if (usernames[i].includes("i")) {
            alert(usernames[i]); //change to alert
        }
    }
    
    
    //PART 3 : For loop to change CSS style of links on page so that every link has its underline removed
    for (i = 0; i < hyperlink.length; i += 1) {
        hyperlink[i].style.textDecoration = "none";
    }
    
    //PART 4 : for loop to change CSS style for className, height, width for every div element on the page
    for (i = 0; i < div.length; i += 1) {
        div[i].className = "message";
        div[i].style.height = "100px";
        div[i].style.width = "100px";
        
        //optional part:  could not figure out how to have seperate RGB value for every div 
        //div[i].style.backgroundColor = `rgb(${r}, ${g}, ${b})`;
    }
    
}
window.onload = lab2();