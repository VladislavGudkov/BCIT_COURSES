import logo from './logo.svg';
import './App.css';
import React, {Component} from 'react';
import Books from './Books';
import Search from './Search';
import axios from 'axios';

class App extends Component {
	constructor(props) 
  	{
    super(props);
	this.handleSearchTextChange = this.handleSearchTextChange.bind(this);	
	this.handleSearchFormSubmit = this.handleSearchFormSubmit.bind(this);
    this.getBooks = this.getBooks.bind(this);
    this.state =
	 {
		loaded: false,
		books: [],
      	searchText: ''
     };
  	}

	handleSearchTextChange(searchText) 
	{
    this.setState({searchText: searchText});
  	}

  handleSearchFormSubmit(e) 
	{
    e.preventDefault();
    this.setState({loaded: false});
    this.getBooks(this.state.searchText);
  	}

  componentDidMount()
	{
    this.getBooks('Harry Potter');
  	}

  getBooks(searchText)
	{
    axios.get('https://www.googleapis.com/books/v1/volumes?q='+searchText).then((response) => {
      this.setState({bookList: response.data.items, loaded: true});
    });
	}

  render()
  {
    const loading = <img src="https://upload.wikimedia.org/wikipedia/commons/b/b1/Loading_icon.gif"/>;
    return (
      <div className="App">
        <Search
          searchText={this.state.searchText}
          onSearchTextChange={this.handleSearchTextChange}
          onSearchFormSubmit={this.handleSearchFormSubmit}
        />
        {this.state.loaded ? <Books searchText={this.state.searchText} books={this.state.bookList}/> : loading }
      </div>
    );
   }
  }

export default App;
