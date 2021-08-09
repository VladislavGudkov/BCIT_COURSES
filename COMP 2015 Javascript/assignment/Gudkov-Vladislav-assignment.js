//PART 1 & 2
var images = [],
    i,
    currentSlide = 0,
    timer = null;

fetch('http://comp2015.herokuapp.com/images')
    .then(res => res.json())
    .then(res => useData(res));
            
function useData(data) {
    var startbutton  = document.querySelector("p button#start");
    var stopbutton = document.querySelector("p button#stop");

    for (i = 0; i < data.length; i += 1) {
        images.push(data[i].url);
    }
    advanceSlides();
    startbutton.onclick = start;
    stopbutton.onclick = stop;
   

}


//PART 3 
function advanceSlides() {
    var slides  = document.querySelector("div.slides").getElementsByTagName("img")[0];
    
    if (currentSlide <= images.length - 1) {
        slides.src = images[currentSlide];
        currentSlide += 1;
    } else {
        currentSlide = 0;
        slides.src = images[currentSlide];
    }
}

//PART 4
function start() {
    if (timer == null) {
        timer = setInterval(advanceSlides, 3000);
    }
}

function stop() {
    if (timer != null) {
        
        clearTimeout(advanceSlides);
        clearInterval(timer);
         timer = null;   
    }
}


    
   


