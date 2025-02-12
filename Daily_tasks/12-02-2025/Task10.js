let num1 = document.getElementById('num1');
let num2 = document.getElementById('num2');
let ans = document.getElementById('result');

function multiply()
{
    num1 = num1.value;
    num2 = num2.value;
    num1 = parseInt(num1);
    num2 = parseInt(num2);
    ans.innerText = num1 * num2;
}
function divide()
{
    num1 = num1.value;
    num2 = num2.value;
    num1 = parseInt(num1);
    num2 = parseInt(num2);
    ans.innerText = num1 / num2;
}