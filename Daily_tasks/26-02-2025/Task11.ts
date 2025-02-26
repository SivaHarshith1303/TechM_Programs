class Bus {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

let bus1 = new Bus("Mercedes", "Sprinter", 2022);
console.log(bus1);
