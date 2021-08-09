/*
COMP 2015 FINAL - 
Winter 2020 Term
February 9, 2020
By Vladislav Gudkov A00921638
*/

//Question 1
//Variable referencing the first image on the page
var firstimage = document.getElementsByTagName("img")[0];
//Set the wisth of the variable referencing the first image on the page to 100 pixels
firstimage.width = 100; //value in pixels

//Create an array of 3 strings shown below
var questionOne = ["window", "document", "console"];


//Question 2
var h1 = document.getElementsByTagName("h1"),
    i;
//loop through all the h1 elements on the page
for (i = 0; i < h1.length; i += 1) {
    //if the h1 element does not have the classname "special"
    if (h1[i].className !== "special") {
        //then set that h1 elements text color to red
        h1[i].style.color = "red";
    }
}


//Question 3
var hyperlink = document.links;
//var hyperlink =  document.getElementsByTagName("a"); //alternatively still works
//Loop through all the hyperlinks on the page
for (i = 0; i < hyperlink.length; i += 1) {
    //if the hyperlink contains the string "bcit"
    if (hyperlink[i].href.indexOf("bcit") !== -1) {
        //then remove the underline from the hyperlink
        hyperlink[i].style.textDecoration = "none";
    }
}


function questionThree(number) {
    if (number >= 60) {
        return true;
    } else {
        return false;
    }
}


//Question 4

//Store all refences to paragraph tag in the paragraph variable
var paragraph = document.getElementsByTagName("p");

//Loop through every paragraph element
for (i = 0; i < paragraph.length; i += 1)
    {
        //For each paragraph element asign an onclick event referencing an anonymous function
       paragraph[i].onclick = function() { 
        //Assign the class "clicked" to the currently targeted object
        this.className = "clicked";};
    }

for (i = 0; i < paragraph.length; i += 1)
    {
        //For each paragraph element asign an ondbclick event referencing an anonymous function
        paragraph[i].ondblclick = function() { 
        //Asign the fontstyle "italic" to the currently targeted object
            this.style.fontStyle = "italic";
        }
    }


//Question 5 PART 1
function questionFive(){
    //setTimeout for 5000ms calling an anonymous function
setTimeout(function()
           {
    //variable target which references the element with the id "target"
     var target = document.getElementById("target");
    //set the innerHTML of the variable target to the string "complete"
    target.innerHTML = "Complete";
           },5000);
}


//Question 5 PART 2
fetch('https://jsonplaceholder.typicode.com/users')
.then(res => res.json())
.then(res => 
{
window.users = res;
useData();
})

function useData()
{
    //get the username of the 9th user
    var name = users[8].username
    //set a variable as a reference to the element with the id "user"
    var user = document.getElementById("user");
    //store the called username reference to the variable referncing the element with the id "user"
    user.innerHTML = name;
}

//Question 6

//Create an H2 element
var H2 = document.createElement("H2");
//Add the string "DOM Scripting" to the created H2 element
H2.innerHTML = "DOM Scripting";
//Append the H2 element to the page body
QuestionSix.appendChild(H2);

//Create div element
var div = document.createElement("div");
//Set the created div elements width, height and backgroundColor
div.style.width = "200px";
div.style.height = "200px";
div.style.backgroundColor = "red";
//Append the newly created div element to the page
QuestionSix.appendChild(div);

//Create image element
var image = document.createElement("img");
image.src = "a.jpg";
image.id = "img3";
QuestionSix.appendChild(image);



//Question 7
function QuestionSeven(){
    //Creation of book object
let book = {
    title: "The Master and Margarita",
    author: "Mikhail Bulgakov",
    yearPublished: 1950,
    readBook: function(){
        return "Now available!";
    } 
};
     return book;
}



