class Shape {
    color: string;

    constructor(color: string) {
        this.color = color;
    }
}

class Circle extends Shape {
    radius: number;

    constructor(color: string, radius: number) {
        super(color);
        this.radius = radius;
    }
}

let circle = new Circle("Red", 10);
console.log(circle);
