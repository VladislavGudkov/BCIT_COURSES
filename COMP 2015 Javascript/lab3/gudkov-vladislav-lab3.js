/*global document*/  //This line of code i used i found online to mitigate the "console,prompt is not defined warning
/*
LAB 3
Name: Vladislav Gudkov
ID: A00921638
Date: January 19, 2020
*/


document.getElementById("div1").style.cssText = "width: 100px; height: 100px; background-Color: cyan";
var paragraph = document.getElementById("div2").getElementsByTagName("p"),
    //PART 1
    colors = ["red", "blue", "green"],
    i;
    
    //PART 2
function changeColorToFirst() {
    'use strict';
    paragraph[0].style.backgroundColor = colors[0];
}
function changeColorToSecond() {
    'use strict';
    paragraph[1].style.backgroundColor = colors[1];
}
function changeColorToThird() {
    'use strict';
    paragraph[2].style.backgroundColor = colors[2];
}
function revert() {
    this.style.backgroundColor = "white";
}

paragraph[0].onmouseover = changeColorToFirst;
paragraph[1].onmouseover = changeColorToSecond;
paragraph[2].onmouseover = changeColorToThird;



//var x = paragraph[0].style.backgroundColor = colors[0];

for (i = 0; i < paragraph.length; i += 1) {
    paragraph[i].onmouseover = function(){
    paragraph[i].style.backgroundColor = colors[i];
    }
}
          
   // paragraph[0].onmouseover = changeColor;
for (i = 0; i < paragraph.length; i += 1) {
    paragraph[i].addEventListener('mouseout', revert);
    //  paragraph[i].addEventListener('mouseover', changeColor);
}



    //PART 3
function changeHeight() {
    'use strict';
    document.getElementById("div1").style.height = "200px";
}
document.getElementById("toggle").addEventListener('click', changeHeight);


