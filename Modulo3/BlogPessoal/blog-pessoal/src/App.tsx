import React from 'react';

import Home from './paginas/home/Home';

import Navbar from './components/estaticos/navbar/Navbar';

import Footer from './components/estaticos/footer/Footer';

import Login from './paginas/Login/Login';

import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

import './App.css';




function App() {
  return (
    <>
      <Router>
        <Navbar></Navbar>
        <Switch>
          <div style={{ minHeight: '100vh' }}>
            <Route exact path="/">
              <Login></Login>
            </Route>
            <Route path="/login">
              <Login></Login>
            </Route>
            <Route path="/home">
              <Home></Home>
            </Route>
          </div>
        </Switch>
        <Footer></Footer>
      </Router>
    </>


  );
}

export default App;
