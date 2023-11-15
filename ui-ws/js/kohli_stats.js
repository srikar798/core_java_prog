
google.charts.load('current',{'packages':['corechart']});
async function loadData() {
    const res = await fetch('./data/kohli_data.json');
    const jsondata = await res.json();
    return jsondata;
}

function drawFormatWith100sChart(list_100_format){
    let data = google.visualization.arrayToDataTable(list_100_format);
    let options = {
        title: 'Kohli 100s in Different Formats',
        height: 300,
        width: 400,
    };
    let chart = new google.visualization.ColumnChart(document.getElementById('idFormatWith100sChart'));
    chart.draw(data,options);
}

window.onload = function(){
    loadData().then(jsondata => {
        arr = jsondata;
        let format_100_map = new Map();
        let country = new Set();
        let format = new Set();
        arr.forEach(ele => {
            country.add(ele["Against"]);
            format.add(ele["Format"]);
            if(format_100_map[ele["Format"]]){
                format_100_map[ele["Format"]] += 1;
            }else{
                format_100_map[ele["Format"]] = 1;
            }
        });
    
        let list_100_format = [["Format", "100 Count"]];
        for(let key in format_100_map){
            list_100_format.push([key,format_100_map[key]]);
        }
    
        drawFormatWith100sChart(list_100_format);
        showCountryDropDown(country);
        document.getElementById("idCountry").addEventListener("change",function(){
            showCountry100Information(this.value, arr, format);
        });
        
    
    });
}

function showCountry100Information(country, arr, format){
    let country_100_map = new Map();
    arr.forEach(ele => {
        if (ele["Against"].trim() == country.trim()) {
            console.log(ele["Against"].trim(), country.trim());
            if (country_100_map[ele["Format"]]) {
               country_100_map[ele["Format"]] += 1;
            } else {
               country_100_map[ele["Format"]] = 1;
            }
       }
    });
    format.forEach(ele => {
        if (!country_100_map[ele]) {
            country_100_map[ele] = 0;
        }
    });
    let table100Counts = `<table class="table table-bordered table-stripped">
        <thead>
            <tr>
                <th>Format</th>
                <th>100s Count</th>
            </tr>
        </thead>
        </tbody>`;
    for(let key in country_100_map){
        table100Counts += `<tr>
            <td>${key}</td>
            <td>${country_100_map[key]}</td>
        </tr>`;
    }
    table100Counts += `</tbody></table>`;
    document.getElementById("id100CountInfo").innerHTML = table100Counts;
}
function showCountryDropDown(country){
    let str = `<select id="idCountry" class="form-select">`;
    str +=`<option value="">Select Country</option>`
    country.forEach(ele=>{
        str += `<option value='${ele}'>${ele}</option>`;
    });
    str += `</select>`;
    document.getElementById("idCountryDropDown").innerHTML = str;
}

