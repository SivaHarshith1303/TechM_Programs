class Car {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class SUV extends Car {
    isOffRoadCapable: boolean;

    constructor(make: string, model: string, year: number, isOffRoadCapable: boolean) {
        super(make, model, year);
        this.isOffRoadCapable = isOffRoadCapable;
    }

    toggleOffRoad() {
        this.isOffRoadCapable = !this.isOffRoadCapable;
        console.log("Off-road capability:", this.isOffRoadCapable);
    }
}

let suv = new SUV("Toyota", "Land Cruiser", 2024, true);
suv.toggleOffRoad();
