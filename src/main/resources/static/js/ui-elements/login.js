$(document).ready(() => {
	$('#loginbutton').on( "click", () => {
	
	/*	let data = {
			"userName": "",
			"passWord": ""
		}
		
		$.ajax({
			url : basePath + `/user/userAuthentication`,
			type : "POST",
			data: JSON.stringify(data),
			cache : false,
			success : function(data) {
				
			},
			error: function(data) {
				
			}
		});*/
		
		window.location.href = basePath + '/user/userAuthentication/userName=&passWord=';
	});
});
