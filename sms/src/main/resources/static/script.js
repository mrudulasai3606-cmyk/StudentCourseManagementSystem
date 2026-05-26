// App Loaded

console.log("Student Management System Loaded");

// Validation

document.querySelector("form").addEventListener("submit", function(event){

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;

    if(name === "" || email === "" || phone === ""){

        alert("All fields are required");

        event.preventDefault();
    }

});

// Search Functionality

document.getElementById("searchInput")
.addEventListener("keyup", function(){

    let value = this.value.toLowerCase();

    let rows = document.querySelectorAll("#studentTable tr");

    rows.forEach(row => {

        let text = row.innerText.toLowerCase();

        row.style.display =
            text.includes(value) ? "" : "none";

    });

});