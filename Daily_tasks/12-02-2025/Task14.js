let num1 = document.getElementById('num1');
let num2 = document.getElementById('num2');
let num3 = document.getElementById('num3');

function sort()
{
    num1 = num1.value;
    num2 = num2.value;
    num3 = num3.value;

    let max = (num1 > num2)?((num1>num3)?num1 : num3) : ((num2>num3)? num2 : num3);
    let min = (num1 < num2)?((num1<num3)?num1 : num3) : ((num2<num3)? num2 : num3);

    let mid = (num1 != max && num1 != min)? num1 : ((num2 != max && num2 != min)? num2 : num3);

    alert(`The sorted numbers are ${max}, ${mid}, ${min}`);
}