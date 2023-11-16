const baseUrl='http://localhost:8080/api/contact'; 

//const baseUrl="https://cbook-qzf5.onrender.com/api/contact";

const idSearch = document.getElementById('idSearch');

const idAdd = document.getElementById('idAdd');

const idUpdate = document.getElementById('idUpdate');

idUpdate.addEventListener('click',function(event){
    let id = document.getElementById('idId').value;
    let name = document.getElementById('idName').value;
    let email = document.getElementById('idEmail').value;
    let mobile = document.getElementById('idMobile').value;
    let dob = document.getElementById('idDob').value;
    let contact = {
        id,name,email,mobile,dob
    };
    fetch(baseUrl,{
        method : 'PUT',
        headers: {
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify(contact)
    })
    .then(res=> res.json())
    .then(data=>{
        resetForm();
        document.getElementById('idAdd').style.display = 'block';
        document.getElementById('idUpdate').style.display = 'none';
        showContacts();
    } );
});

idAdd.addEventListener('click',function(event){

    
    let name = document.getElementById('idName').value;
    let email = document.getElementById('idEmail').value;
    let mobile = document.getElementById('idMobile').value;
    let dob = document.getElementById('idDob').value;
    let contact = {
        name,email,mobile,dob
    };
    fetch(baseUrl,{
        method : 'POST',
        headers: {
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify(contact)
    })
    .then(res=> res.json())
    .then(data=>{
        resetForm();
        showContacts();
    } );
});

function resetForm(){
    document.getElementById('idName').value='';
    document.getElementById('idMobile').value='';
    document.getElementById('idEmail').value='';
    document.getElementById('idDob').value='';
}

idSearch.addEventListener('keyup',function(event){
    let str = event.target.value.trim();
    if(str.length >= 1){
        fetch(`${baseUrl}/search?str=${str}`)
            .then(res => res.json())
            .then(data => viewContacts(data));
    }else{
        showContacts();
    }

});

function showContacts(){
    fetch(`${baseUrl}/list`)
            .then(ele => ele.json())
            .then(data => {
                
                viewContacts(data);

            });
}

function viewContacts(contacts){
    let tableBody = document.getElementById("idSearchResultBody");
    tableBody.innerHTML='';
    if(contacts.length == 0){
        tableBody.innerHTML = 'No Contacts Found';
    }else{
    contacts.forEach(contact => {
        let row = tableBody.insertRow();
        let name = row.insertCell();  
        let phone = row.insertCell();
        let email = row.insertCell();
        let dob = row.insertCell();
        let edit = row.insertCell();
        let del = row.insertCell();
        name.innerText = contact.name;
        email.innerText = contact.email;
        phone.innerText = contact.mobile;
        dob.innerText = contact.dob;
        edit.innerHTML = `<i class='fa fa-edit' onclick= "editContact('${contact.mobile}')"></i>`;
        del.innerHTML  = `<i class='fa fa-trash' onclick= "deleteContact('${contact.id}','${contact.name}')"></i>`;
        tableBody.appendChild(row);   
    });}
}

function editContact(mobile){
    fetch(`${baseUrl}/get-by/${mobile}`)
            .then(res=>res.json())
            .then(data=>{

                document.getElementById('idId').value=data.id;
                document.getElementById('idName').value=data.name;
                document.getElementById('idEmail').value=data.email;
                document.getElementById('idMobile').value=data.mobile;
                document.getElementById('idDob').valueAsDate=new Date(data.dob);

                document.getElementById('idAdd').style.display = 'none';
                document.getElementById('idUpdate').style.display = 'block';

            });
}

function deleteContact(id,name){
    let res = confirm(`Are you sure do you want to delete contact with name ${name} ?`);
    if(res){
        fetch(`${baseUrl}/${id}`,{
            method: 'DELETE'
        })
        .then(res=> res.json())
        .them(data=> {
            showContacts();
        });
    }
}

showContacts();
