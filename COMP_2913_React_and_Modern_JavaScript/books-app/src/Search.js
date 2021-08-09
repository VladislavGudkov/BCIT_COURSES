import React, {Component} from 'react';

//component to create search bar 
class Search extends Component
{
  constructor(props) 
	{
  super(props);
  this.handleSearchTextChange = this.handleSearchTextChange.bind(this);
  this.handleSearchFormSubmit = this.handleSearchFormSubmit.bind(this);
  	}

  handleSearchFormSubmit(e)
	{
    this.props.onSearchFormSubmit(e);
	}

  handleSearchTextChange(e)
	{
    this.props.onSearchTextChange(e.target.value);
  	}

  
  render() 
	{
    return (
      <form onSubmit={this.handleSearchFormSubmit}>
        <input type="text"
          placeholder="Harry Potter"
          value={this.props.searchText}
          onChange={this.handleSearchTextChange}
        />
        <button type="Search">Submit</button>
      </form>
			);
  }
}

export default Search;