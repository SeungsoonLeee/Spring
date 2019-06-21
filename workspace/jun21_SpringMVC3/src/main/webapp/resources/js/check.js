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
	var phone2 = document.joinInputForm.phone2;
	var phone3 = document.joinInputForm.phone3;
	var birth = document.joinInputForm.birth2;

	if (isEmpty(birth) || isNaN(birth.value)) {
		alert("생년월일 확인");
		birth.focus();
		return false;
	} else if (isEmpty(phone2) || isNaN(phone2.value) || isEmpty(phone3) || isNaN(phone3.value)) {
		alert("전화번호 확인");
		return false;
	}

	return true;
}