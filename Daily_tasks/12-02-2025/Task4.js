let a = document.getElementById('a');
let b = document.getElementById('b');
let c = document.getElementById('c');
let area = document.getElementById('area');

function calculateArea()
{
    a = parseFloat(a.value);
    b = parseFloat(b.value);
    c = parseFloat(c.value);

    console.log(a);
    console.log(b);
    console.log(c);
    let s = (a + b + c) / 2;
    let ans = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    console.log(ans);   
    area.value = `Area of triangle is ${ans}`;
}