class Student {
    name: string;
    class: string;

    constructor(name: string, studentClass: string) {
        this.name = name;
        this.class = studentClass;
    }
}

let student = new Student("Alice", "10th");
console.log(student);
