<!DOCTYPE html>
<html>
<head>

<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
<script>
	var debug = true;

	function submit() {
		var items = new Array();

		$('*[id*=booking]:visible').each(function() {

			var eqName = $(this).find('*[id*=eq]:visible').val();

			var eqQty = $(this).find('*[id*=qty]:visible').val();

			var item = new Object();
			item.name = eqName;
			item.qty = eqQty;

			items.push(item);
		});

		if (debug) {
			console.log('[debug]: to submit');
			$.each(items, function(i, item) {
				console.log(item);
			});
		}

		$.ajax({
			type : 'POST',
			contentType : 'application/json',
			url : 'http://localhost:8080/rest/booking/submit',
			data : JSON.stringify(items),
			success : function() {
				alert('submit successful');
			},
			dataType : 'json'
		});

	}
</script>

<title>Equipment Booking System</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<h1>Welcome to Equipment Booking System</h1>


	<div id="booking_0">
		Select the equipment: <select id="eq0">
			<option>Cisco Router</option>
			<option>Lenovo Laptop</option>
			<option>Keyboard</option>
			<option>Mouse</option>
		</select> <input type="text" id="qty0" /> <br>
	</div>

	<input type="button" onclick="submit()" value="Submit">

	</div>

</body>
</html>
