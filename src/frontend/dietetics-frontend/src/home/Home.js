import { useState, useEffect } from 'react';
import axios from "axios";
import Food from "../food/Food";

const Home = () => {
    const baseURL = 'http://localhost:8080/food';
    const [foods, setFoods] = useState(null);

    useEffect(() => {
        axios.get(baseURL)
            .then((res) => {
                setFoods(res.data);
            })
    }, []);

    return (
        <div className="home">
            {foods && <Food foods={foods} />}
        </div>
    );
}

export default Home;