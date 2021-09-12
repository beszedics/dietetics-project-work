import { useState, useEffect } from 'react';
import Food from "../food/Food";

const Home = () => {

    const [foods, setFoods] = useState(null);

    useEffect(() => {
        fetch('http://localhost:8080/food')
            .then(res => {
                return res.json();
            })
            .then((data) => {
                console.log(data)
                setFoods(data);
            })
    }, []);

    return (
        <div className="home">
            {foods && <Food foods={foods} />}
        </div>
    );
}

export default Home;