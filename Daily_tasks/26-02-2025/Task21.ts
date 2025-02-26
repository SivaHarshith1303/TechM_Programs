class Shape {
    color: string;

    constructor(color: string) {
        this.color = color;
    }

    draw() {
        console.log("Drawing a shape.");
    }
}

class Circle extends Shape {
    draw() {
        console.log("Drawing a circle.");
    }
}

let shape = new Shape("Blue");
shape.draw();

let circle2 = new Circle("Red");
circle2.draw();
