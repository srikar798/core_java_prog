google.charts.load('current', {'packages':['corechart']});
function drawChart(arr) {

    let dataArr = [[`Principal Amount`,`Interest Amount`]]
    for(let i = 0; i <arr.length;i++){
        dataArr.push(arr[i]);
    }
    let data = google.visualization.arrayToDataTable(dataArr);
    let options = {
        title: 'Emi Calculator'
    };

    let chart = new google.visualization.PieChart(document.getElementById('idPiechart'));

    chart.draw(data, options);
}
function calculateEmi(){
    var p = document.getElementById("idAmount").value;
    var t =document.getElementById("idDuration").value;
    var r = document.getElementById("idInterest").value;
    ri = r / 12 / 100;
    emi = Math.round(p * ri * Math.pow((1+ri),t) / (Math.pow((1+ri),t) - 1));
    totalAmount = emi * t;
    totalInterest = totalAmount - p;
    console.log(totalInterest);
    let str =  `<table class="table table-bordered table-striped">
                <tr>
                    <td>EMI</td>
                    <td>${emi}</td>
                </tr>
                <tr>
                    <td>Total Amount</td>
                    <td>${totalAmount}</td>
                </tr>
                <tr>
                    <td>Total Interest</td>
                    <td>${totalInterest}</td>
                </tr>
                </table>`;
    document.getElementById("idEmiDetails").innerHTML=str;
    google.charts.setOnLoadCallback(drawChart([[`Principle Amount`, Number.parseFloat(p)],[`Interest Amount`,totalInterest]]));
}
document.getElementById("idAmount").addEventListener("keyup", calculateEmi);
document.getElementById("idInterest").addEventListener("keyup", calculateEmi);
document.getElementById("idDuration").addEventListener("keyup", calculateEmi);

window.onload = function(){
    calculateEmi();
}



