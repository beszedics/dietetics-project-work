import { useState, useEffect } from 'react';
import axios from "axios";
import Food from "../food/Food";

const Home = () => {
    const baseURL = 'http://localhost:8080/food';

    const [foods, setFoods] = useState(null);
    const [isLoading, setIsLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        setTimeout(() => {
            axios.get(baseURL)
                .then((res) => {

                    if (res.status !== 200) {
                        throw new Error('Could not fetch the data for that resource');
                    }
                    
                    setFoods(res.data);
                    setIsLoading(false);
                    setError(null);
                }).catch(error => {
                    setIsLoading(false);
                    setError(error.message);
            })
        }, 1000)
    }, []);

    return (
        <div className="home">
            { error && <div>{ error }</div> }
            { isLoading && <div>Loading...</div> }
            {foods && <Food foods={foods} />}
        </div>
    );
}

export default Home;