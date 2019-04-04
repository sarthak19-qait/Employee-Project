# Employee-Project

import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import * as serviceWorker from './serviceWorker';
import "bootstrap/dist/css/bootstrap.css";
import "font-awesome/css/font-awesome.css";
import Counters from "./components/counters"

ReactDOM.render(<Counters />, document.getElementById("root"));
serviceWorker.unregister();





import React, { Component } from 'react';
import Counter from "./counter"

class Counters extends Component {
    state = {  
        counters : [
           { id : 1 , value : 4 },
           { id : 2 , value : 0 },
           { id : 3 , value : 0 },
           { id : 4 , value : 0 }
        ]
    }

    handleDelete = (counterId)=>{
        const counters = this.state.counters.filter(c=>c.id!==counterId)
        this.setState({counters:counters})
    }

    // handleReset = ()=>{
    //     const counters = this.state.counters.map(c=>{
    //         c.value = 0;
    //         return c;
    //     })
    //     this.setState({counters:counters})
    // }

    render() { 
        return ( 
            <div>
                <button onClick = {this.handleReset} className="btn btn-primary btn-sm m-2">Reset</button>
                {this.state.counters.map(counter => (
                <Counter onDelete = {this.handleDelete} key = {counter.id} value = {counter.value} selected = {true} id = {counter.id}>
                </Counter>
                ))}
            </div>
         );
    }
}
 
export default Counters;





import React, { Component } from 'react';

class Counter extends Component {

    styles = {
        fontSize : 50,
        fontWeight : "bold"
    }
    
    getBadgeColor() {
        let classes = "badge m-2 badge-";
        classes += this.props.value === 0 ? "warning" : "primary";
        return classes;
    }

    // formatCount(){
    //     const { count } = this.state
    //     return count === 0 ? "Zero" : count
    // }

    render() { 
        console.log(this.props)
        return ( 
            <React.Fragment>
                <h4>Counter {this.props.id}</h4>
                <span style = {this.styles} className = {this.getBadgeColor()}>{this.props.value}</span>
                <button onClick = {this.handleIncrement} style = {{ fontSize : 50 }} className = "btn btn-secondary btn-sm">Increment</button>
                <button onClick = {()=>this.props.onDelete(this.props.id)} className="btn btn-danger btn-lg m-2">Delete</button>
                <br />
            </React.Fragment>
         );
    }
}
 
export default Counter;
