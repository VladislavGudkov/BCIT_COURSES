import React, {Component} from 'react';
import './App.css';

function shoppinglistitem(props) 
{
  const { value, onClick } = props;
  const handleClick = () => {
    onClick(value);
  }
  
  return (
    <li>
      <i>{value}</i>&nbsp;<button onClick={handleClick}>Delete</button>
    </li>
  );
}

export default shoppinglistitem;