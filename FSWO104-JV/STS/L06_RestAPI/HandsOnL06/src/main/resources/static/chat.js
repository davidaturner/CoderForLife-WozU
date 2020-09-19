/**
 * 
 */
 $(document).ready(function() {
    // when the button is clicked the values entered are gathered and inserted
    // into the string that will be the url route.
    $('button').click(function() {
        var url = 'api/chat';
 
        // the get method takes the route and then has a function waiting
        // for the response which will take the data and insert it into the
        // HTML.
        $.get(url, function(data) {
        	if (data.length > 0) {
				var root = JSON.stringify(data);
				document.getElementById('chatsfound').innerHTML = data.length;
				document.getElementById('root').innerHTML = root;
			}
        });
    });
});