class Animal {
    name: string;
    species: string;

    constructor(name: string, species: string) {
        this.name = name;
        this.species = species;
    }
}

class Tiger extends Animal {
    roar() {
        console.log(this.name + " is roaring!");
    }
}

let tiger = new Tiger("Sheru", "Tiger");
tiger.roar();
