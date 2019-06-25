function calCheck() {
	var x = document.calInputForm.x;
	var y = document.calInputForm.y;

	if (isEmpty(x) || isNaN(x.value)) {
		alert("x값 확인");
		x.focus();
		x.value = "";
		return false;
	} else if (isEmpty(y) || isNaN(y.value)) {
		alert("y값 확인");
		y.focus();
		y.value = "";
		return false;
	}

	return true;
}

function transCheck() {
	var xx = document.transInputForm.xx;

	if (isEmpty(xx) || isNaN(xx.value)) {
		alert("값 확인");
		xx.focus();
		xx.value = "";
		return false;
	}

	return true;
}

function joinCheck() {
	var id = document.joinInputForm.id;
	var pw = document.joinInputForm.pw;
	var pwCheck = document.joinInputForm.pwCheck;
	var name = document.joinInputForm.name
	var birth = document.joinInputForm.birth2;

	if (isEmpty(id)){
		alert("아이디 확인");
		id.focus();
		return false;
	}
	else if (isEmpty(pw) || isEmpty(pwCheck) || notEquals(pw, pwCheck)){
		alert("비밀번호 확인");
		pw.focus();
		return false;
	}
	else if (isEmpty(name)){
		alert("이름 확인");
		name.focus();
		return false;
	}
	else if (isEmpty(birth) || isNaN(birth.value)) {
		alert("생년월일 확인");
		birth.focus();
		return false;
	}

	return true;
}