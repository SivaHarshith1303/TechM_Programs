class Bus {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    start() {
        console.log("The bus is starting...");
    }
}

let bus2 = new Bus("Volvo", "B9R", 2023);
bus2.start();
