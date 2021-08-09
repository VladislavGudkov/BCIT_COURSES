

        // JSON - javascript object notation - note that the keys must be strings, but the values can be any data type
        let post = {
            "id": 0,
            "title": "Mums Date Squares"
        }

        // API - application programming interface
        // set of URLs (endpoints) that return some (JSON (text)) data

        // http://teaandmangoes.com
        // http://teaandmangoes.com/wp-json/wp/v2/posts
        // http://teaandmangoes.com/wp-json/wp/v2/pages


        // synchronous function call - each function call will not run until the previous function has finished
        // example url: 'https://i.ibb.co/Zg21k0x/slide0.jpg'
        let images = [];
        
        fetch('http://comp2015.herokuapp.com/images') // fetch the data
            .then(res => res.json()) // when the response comes back, THEN extract JSON from it
            .then(res => useData(res)); // when the response has been read and converted to JSON, THEN pass it to the useData function


        // NOTE: we need to ensure that the data has come back before we try to use it

        // useData is the only place we can be sure that data has been returned, because it is only called after succesfull fetching an conversion
        function useData(data) {
           
            // loop through, push the urls
            for (i in data)
                {
                     console.log(data[i].url);
            images.push(data[i].url);
                }
            //console.log(images[0]); // verify
        }

        