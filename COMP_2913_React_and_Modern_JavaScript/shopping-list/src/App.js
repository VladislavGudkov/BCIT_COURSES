//COMP 2913 Project 1
//Vladislav Gudkov (A00921638)
//Febraury 2nd, 2020


import React, {Component} from 'react';
import Shoppinglistitem from './shoppinglistitem';
import './App.css';

class App extends Component 
{
  //class constructor
  constructor(props)
    {
    super(props);
    this.state = {shoppingList: [], shoppingItem: ''};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleDelete = this.handleDelete.bind(this);
    }

    //sets new state for input
  handleChange(e) 
    {
        this.setState({ shoppingItem : e.target.value });
    }

  //sets sumbit input for function, used source below for duplicate emtry elimination
  //  https://sebhastian.com/react-preventdefault/
  handleSubmit(e) 
  {
    e.preventDefault(); //prevents browser auto refresh
        
    const {shoppingItem,shoppingList} = this.state; 
        
    if(shoppingItem === '') return false;  //if shopping item is empty do nothing
    if(!shoppingList.includes(shoppingItem))
    {
      this.setState({shoppingList: [...shoppingList, shoppingItem]});
    }
    this.setState({ shoppingItem: '' });
  }

  //  https://flaviocopes.com/how-to-remove-item-from-array/
  //delete handle function
  handleDelete(deleteItem)
  {
    this.setState({ shoppingList: this.state.shoppingList.filter(shoppingItem => shoppingItem !== deleteItem)});
  }

  //render function
  render()
  { 
    return (
      <div className="Shopping List">
        <form onSubmit={this.handleSubmit}>
          <input type="text"
            name="shoppingItem"
            value={this.state.shoppingItem}
            placeholder="Enter a shopping item"
            onChange={this.handleChange}/>
          <button type="submit">Add to Shopping list</button>
        </form>
        <ol className="List">
        {this.state.shoppingList.map((shoppingItem) => {
          return(<Shoppinglistitem key={shoppingItem} value={shoppingItem} onClick={this.handleDelete}/> 
          );
        })}
        </ol>
      </div>
    );
  }
}
export default App;