import logo from './logo.svg';
import './App.css';
import React, {Component} from 'react';
import axios from 'axios';
import Users from './Users';

class App extends Component {
  constructor(props) 
	{
	  
    super(props);
    this.state = 
	{
      users: []
    }

    this.handleDelete = this.handleDelete.bind(this);
	}

  componentDidMount() {
    const promise = axios.get('https://randomuser.me/api/?results=25');
    promise
      .then((response) => {
		console.log(response);
          this.setState({ users: response.data.results});
		});
  }

	//delete user by their unique md5 login hash
  handleDelete(md5) {
    this.setState({users: this.state.users.filter(user => user.login.md5 !== md5)});
  }
	//render after deleting of user
  render() {  
    return(
      <div className="App">
        <h2> List Of Users </h2>
      
        {this.state.users.map((user) => 
          { 
            return(
              <Users 
              key={user.login.md5}
                user={user}
                Delete = {()=> this.handleDelete(user.login.md5)}                
              />
            );
          })
        }    
      </div>
    );
  }  
}

export default App;