let obj1 = document.getElementById("year");
let ans = document.getElementById("ans");
function checkLeapYear()
{
    obj1 = parseInt(obj1.value);

    if(obj1%4 != 0)
    {
        ans.innerText = "Not a leap year";
    }
    else 
    {
        if(obj1%100 == 0 && obj1%400 == 0)
            ans.innerText = "Leap year";
        else 
            ans.innerText = "Not a leap year";
    }

}