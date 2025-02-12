let num1 = document.getElementById('num1');
let num2 = document.getElementById('num2');
let num3 = document.getElementById('num3');
let ans = document.getElementById('ans');

function sign()
{
    let cnt = 0;
    num1 = num1.value;
    num2 = num2.value;
    num3 = num3.value;

    if(num1 < 0)
        cnt++; 
    if(num2 < 0)
        cnt++;
    if(num3 < 0)
        cnt++;

    if(cnt%2 == 0)
        alert('The sign is Positive : +');
    else 
        alert("The sign is Negative : -");
}