class Student {
    name: string;
    rollNumber?: number;

    constructor(name: string, rollNumber?: number) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

let student1 = new Student("Bob", 101);
let student2 = new Student("Charlie");
console.log(student1, student2);
