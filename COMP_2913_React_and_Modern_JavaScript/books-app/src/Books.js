import React from 'react';

function Books({searchText,books}){
  if (typeof books === 'undefined') 
  {
    return (<p>No results were found for '{searchText}'</p>)
  } 
  else 
		{
    return(
      <div className="Books">
        {books.map((book) => {
          let bookDetails = book.volumeInfo;
          return(
            <div className="book" key={book.id}>
              <div className="thumbnail">
                <img src={(typeof bookDetails.imageLinks !== 'undefined') && bookDetails.imageLinks.smallThumbnail} />
              </div>
              <div className="content">
                <h2 className="title">
                  <a href={bookDetails.previewLink}>{bookDetails.title}</a>
                </h2>
                {(typeof bookDetails.categories !== 'undefined') && bookDetails.categories.join(", ")}
                <p className="description">{bookDetails.description}</p>
              </div>
            </div>
          )
        })}
      </div>
    )
  }
}

export default Books;