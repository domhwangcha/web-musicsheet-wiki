import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Header from './components/Header'
import Home from './components/Home';
import Footer from './components/Footer'
import Result from './components/Result'

function App() {
    return (
        <div className="App">
            <BrowserRouter>
                <Header/>
                <Routes>
                    <Route exact path={"/"} element={<Home/>}/>
                    <Route exact path={"/result/:sid"} element={<Result/>}/>
                </Routes>
                <Footer/>
            </BrowserRouter>
        </div>
    )
}

export default App;