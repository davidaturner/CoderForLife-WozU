/*alert('Hello World from JS');*/

document.getElementById("vote").addEventListener('click', loaddog);

function helloworld() {
	console.log("Hello World from Helloworld()");
}

function loaddog() {
	
	var xlr = new XMLHttpRequest();
	xlr.open("GET", "http://localhost:8080/api/chat", true);

	xlr.onload = function() {
		if (this.status === 200) {
			var dogs = JSON.parse(xlr.responseText);
			console.log(dogs);
			
			for(var i in dogs) {
				console.log(dogs[i].name);
			}
		}
	}
	
	xlr.error = function() {
		console.log("Error in loading data...");
	}
	
	xlr.send();
}
