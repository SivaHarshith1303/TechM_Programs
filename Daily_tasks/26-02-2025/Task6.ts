let strNum: string = "100";
let numVal: number = parseInt(strNum);
let anotherNum: number = strNum as unknown as number;
console.log(numVal, anotherNum);
