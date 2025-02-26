class Vehicle {
    make: string;
    model: string;

    constructor(make: string, model: string) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    year: number;

    constructor(make: string, model: string, year: number) {
        super(make, model);
        this.year = year;
    }
}

class SportsCar extends Car {
    topSpeed: number;

    constructor(make: string, model: string, year: number, topSpeed: number) {
        super(make, model, year);
        this.topSpeed = topSpeed;
    }
}

let sportsCar = new SportsCar("Ferrari", "488", 2023, 330);
console.log(sportsCar);
