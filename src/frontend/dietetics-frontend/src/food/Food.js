import './Food.css'

const Food = ({ foods }) => {
    return (
        <div className="container">
            <div className="row g-4">
                {foods.map((food) => (
                    <div className="col-12 col-lg-4 col-sm-6" key={food.id}>
                        <div className="card mt-4 mb-2">
                            <div className="card-body rounded">
                                <div className="card-body">
                                    <h5 className="card-title">{ food.name }</h5>
                                    <span className="badge rounded-pill bg-secondary">{ food.glycemicIndex }</span>
                                    <span className="badge rounded-pill bg-secondary">{ food.histamineLevel }</span>
                                    <span className="badge rounded-pill bg-secondary">{ food.histamineSymptomSeverity }</span>
                                </div>
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );
}

export default Food;