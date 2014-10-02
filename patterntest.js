	function test(){
		var pattern = /var/;
		var string = "var x = 200;";
	if (pattern.test(string)){
		console.write("match found");
		}
	else console.write("nothing mathed");
	}
