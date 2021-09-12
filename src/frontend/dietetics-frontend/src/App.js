import './App.css';
import Navbar from "./navbar/Navbar";
import Home from "./home/Home";

function App() {
    return (
        <div className="App">
            <Navbar />
            <div className="content">
                <Home />
            </div>
        </div>
    );
}

export default App;
