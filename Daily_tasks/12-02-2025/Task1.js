let obj1 = document.getElementById('time');

function getDetails()
{
    let date = new Date();
    let day = date.getDay();
    switch(day){
        case 0 : day = "Sunday"; break;
        case 1 : day = "Monday"; break;
        case 2 : day = "Tuesday"; break;
        case 3 : day = "Wednesday"; break;
        case 4 : day = "Thursday"; break;
        case 5 : day = "Friday" ; break;
        case 6 : day = "Saturday"; break;
    }
    obj1.innerHTML = `Today is : ${day}  <br>
                Current Time is : ${date.getHours()} : ${date.getMinutes()} : ${date.getSeconds()}`;
}