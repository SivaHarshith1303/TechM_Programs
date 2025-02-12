let num1 = document.getElementById('num1');
let num2 = document.getElementById('num2');
let ans = document.getElementById('ans');

function largest()
{
    num1 = num1.value;
    num2 = num2.value;
    num1 = parseInt(num1);
    num2 = parseInt(num2);
    if(num1 > num2)
        ans.innerText = `The largest is ${num1}`;
    else
        ans.innerText = `The largest is ${num2}`;
}