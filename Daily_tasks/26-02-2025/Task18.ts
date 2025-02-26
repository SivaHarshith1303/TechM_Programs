class Student {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
}

let student3 = new Student("David", -5);
console.log(student3);
