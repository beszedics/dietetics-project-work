const Food = ({ foods }) => {
    return (
        <div className="food">
            {foods.map((food) => (
                <div className="food-preview" key={food.id}>
                    <h2>{ food.name }</h2>
                </div>
            ))}
        </div>
    );
}

export default Food;