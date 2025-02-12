let obj1 = document.getElementById("curr_date");
function getCurrentDate()
{
    let date = new Date();
    let month = date.getMonth() + 1;
    let today = date.getDate();
    let year = date.getFullYear();
    obj1.innerText = `${today}-${month}-${year} ,${today}/${month}/${year} `;
}   