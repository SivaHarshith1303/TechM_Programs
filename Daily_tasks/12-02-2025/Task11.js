let farenheit = document.getElementById('farenheit');

function convert()
{
    farenheit = farenheit.value;
    farenheit = parseFloat(farenheit);
    let celsius = (farenheit - 32) * 5/9;
    document.getElementById('ans').innerText = `${farenheit} F is ${celsius} C`;
}