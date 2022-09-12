function regValidation() {
	var uname = document.signForm.email.value;
	var pwd = document.signForm.pswd.value;
	
	if (uname == '') {
		alert("UserName is empty!!!.. please enter");
		return false;
	}
	
	if (pwd == '') {
		alert("password is empty!!!.. please enter");
		return false;
	}
	
	return true;
}