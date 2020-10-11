function welcomeVisitorToTheSite() {
// example welcome code
var username = prompt('Hello, what is your name?');
alert('Welcome to the site, ' + username + '!');
}
//window.onload = welcomeVisitorToTheSite();


function alertName(first, last) { // parameters are first and last
/*
Note: the variables called 'first' and 'last'
are only accessible inside the function.
Trying to access first and last outside the function
will result in an error
*/
alert(first + ' ' + last);
}
//var firstName = prompt('Please enter your first name');
//var lastName = prompt('Please enter your last name');

//window.onload = alertName(firstName,lastName);

function add(arg1, arg2) {
console.log(arg1 + arg2);
}
var printSum = add; // *important* no parentheses! otherwise the code inside
// add() is run immediately
printSum(1, 2);
printSum(3, 4);


var printSums = function(arg1, arg2) {
console.log(arg1 + arg2);
}
printSums(5,5);



function scopeTest() {
var x = 5;
var y = 10;
/*
x and y have 'local' scope, meaning they are only accessible
inside the function
*/
console.log(x + y);
}
scopeTest();



function multiplesOfFive() {
var x = 5;
for (let i = 0; i < 10; i++) {
alert(x * i); // inside the for loop, both x and i are accessible
}
alert(i); // error! i is defined using 'let', so it can only be accessed
// inside the for loop
}
//multiplesOfFive();

//document.images[0].onclick = function() {this.style.border = ('10px solid red');}
//document.images[0].addEventListener('click', function() {this.style.border = ('10px solid red');});

//var firstImage = document.images[0];
//firstImage.addEventListener('click', function() {this.setAttribute('style', 'border: 1px solid red');});
//firstImage.onmouseover = function() {this.style.opacity = '0.5';}

//document.images[0].addEventListener('click', function() {this.setAttribute('style', 'border: 1px solid red');});

//alert(this);

/*
var images = document.getElementsByTagName('img');
for (let i = 0; i < images.length; i++) {
images[i].onclick = rotateImage;  
}
function rotateImage(index) {
this.setAttribute( 'style','transform: rotate(180deg);'); //use "this keyword" instead of images[index].setAttribute(
}
*/

//JQUERY
$('p').click(function() {$(this).css('color', 'red');});


/*document.images[0].onclick = function() {
alert('This link cannot be aaa clicked');
event.preventDefault();
}*/

/*document.images[0].onclick = function() {
return false;
}*/

/*document.images[0].onclick = function() {
return confirm('Are you sure you want to click this link?');
}*/

/*window.onload = function() {
document.forms[0].onsubmit = function() {
var inputs = this.elements;
var labels = document.getElementsByTagName('label');
var error = false;
for (let i = 0; i < inputs.length; i++) {
var theClass = inputs[i].className;
if (theClass.indexOf("required") >= 0 &&
inputs[i].value.length < 1) {
alert(inputs[i].id + ' must not be empty');
labels[i].setAttribute('style', 'color: red');
error = true;
}
}
if (error) { // equivalent to if (error == true)
return false;
}
}
}*/

$(document).ready(function() {
$('#myform').validate({
rules: {
email: { required: true, email: true },
password: 'required'
},
messages: {
email: 'valid email is required',
password: 'password is required'
},
submitHandler: function(form) {
form.submit();
}
});
})


