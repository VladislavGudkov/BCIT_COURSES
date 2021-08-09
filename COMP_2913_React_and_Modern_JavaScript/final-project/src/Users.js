import React from 'react';
import flag from './flag.png';
import female from './female.png';
import male from './male.png';

class Users extends React.Component {
    render() {
        return(
            <div>
                <table >
                    <tbody> 
                       
            			<tr>  
                            {this.props.user.picture && this.props.user.picture.medium && this.props.user.picture.medium.length > 0 &&                 
                            <td>  <img className="thumb" src= {this.props.user.picture.medium}  alt="User"/> </td> }                
                        </tr>            
			
						<tr>   
                            <th> First Name  </th>
                            <td> {this.props.user.name.first}  </td>
                        </tr>
			
                        <tr>  
                            <th> Last Name </th>
                            <td> {this.props.user.name.last} </td> 
                        </tr>
			
                        
                        
                        <tr>  
                            <th> City </th>
                            <td> {this.props.user.location.city}  </td> 
                        </tr>    
			
                        <tr>  
                            <th> State </th>
                            <td> {this.props.user.location.state}  </td> 
                        </tr>
                      
                        <tr>  
                            <th> Email </th>
                            <td> {this.props.user.email}  </td> 
                        </tr>   
			
						 <tr>  
                            <th> Country </th>
                            <td>    
                                {this.props.user.location.country}  
                                {this.props.user.location.country &&   this.props.user.location.country==='United States' && <img className="flag" src={flag}/> }   
								
                            </td> 
                        </tr>
			
						<div> 
                    <button onClick={this.props.Delete}> Delete </button> 
                		</div>
			</tbody>
                </table> 
                <hr/>
            </div>);
    }
}

export default Users;