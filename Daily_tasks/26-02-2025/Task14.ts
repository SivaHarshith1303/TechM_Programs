class Engine {
    horsepower: number;
    fuelType: string;

    constructor(horsepower: number, fuelType: string) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
}

class Car {
    make: string;
    model: string;
    year: number;
    engine: Engine;

    constructor(make: string, model: string, year: number, engine: Engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    printCarDetails() {
        console.log(`${this.make} ${this.model} (${this.year}), Engine: ${this.engine.horsepower} HP, ${this.engine.fuelType}`);
    }
}

let engine = new Engine(250, "Petrol");
let car = new Car("BMW", "X5", 2023, engine);
car.printCarDetails();
