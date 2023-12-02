
function showTeamAmountStats(){
    fetch('http://localhost:8081/iplstats/api/v1/teamamountstats').then(json=>json.json()).then(res=>{
        console.log(res);
    })
}
showTeamAmountStats();