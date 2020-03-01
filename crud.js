fetch("http://dummy.restapiexample.com/api/v1/employees").then(response => {
  return response.json();
}).then(people => {
  
    console.log(people.data);

    for(var i=0;i<people.data.length;i++){
        var row=display.insertRow(-1);
      
            var cell=row.insertCell(-1);
            cell.innerHTML=people.data[i].id;
            var cell=row.insertCell(-1);
            cell.innerHTML=people.data[i].employee_name;
            var cell=row.insertCell(-1);
            cell.innerHTML=people.data[i].employee_salary;
            var cell=row.insertCell(-1);
            cell.innerHTML=people.data[i].employee_age;
            var cell=row.insertCell(-1);
            cell.innerHTML="<button type=\"button\" class=\"btn btn-primary\">Edit</button> &nbsp; <button type=\"button\" class=\"btn btn-danger\">Delete</button>"

    }
});


function submitData(){
   event.preventDefault();
    console.log('hi');
var formData=new FormData(document.getElementById('postData'));

result={};

for(var entry of formData.entries()){
    result[entry[0]]=entry[1];
}

// console.log(formData);
fetch('http://dummy.restapiexample.com/api/v1/create', {
    method: 'POST',
    body: JSON.stringify(result)
  }).then(function(response) {
    return response.json();
  }).then(function(data) {
    console.log(data);
  }).catch((err)=>console.log(err));
}

