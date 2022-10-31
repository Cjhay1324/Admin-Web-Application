$(document).ready(() => {
	
	hideLoadingAnim();
	
});

function hideLoadingAnim(AnimTimeOut){
	
	// Default Constant Loading Animation Interval = 5s + additional secs from parameter
	
	// AnimTimeOut will be on Seconds e.g. 1 = 1 Second
	
	AnimTimeOut = AnimTimeOut == null || AnimTimeOut == "" ? 0 : AnimTimeOut * 1000;	
	
	let rmvElementInterval = AnimTimeOut + 5000;
	
	setTimeout(() => {
		$("#loading-container").addClass("loading-fade-out-effect");
	}, AnimTimeOut);
	
	setTimeout(() => {
			$("#loading-container").css("display", "none");
		}, rmvElementInterval);
}

function showLoadingAnim(){
	$("#loading-container").removeClass("loading-fade-out-effect");
	$("#loading-container").css("display", "flex");
}