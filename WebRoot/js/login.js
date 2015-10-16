//页面加载
$(function() {
	$('#login_table tr td').addClass('tr_css');
	$('#login_table tr #td1').addClass('td1_css');
	$('#login_table input').addClass('input_css').on('focus', function() {
		$(this).addClass('input_focus');
	}).on('blur', function() {
		$(this).removeClass('input_focus');
	});

	// 用户名
	$('#name').on(
			'focus',
			function() {
				$('#warn_name').removeClass('check_wrong_color').removeClass(
						'check_right_color');
				$('#warn_name')[0].innerHTML = "由2~10个汉字、英文字母、数字、减号、下划线组成";
			}).on('blur', function() {
		name_blur();
	});
	// 密码
	$('#password').on(
			'focus',
			function() {
				$('#warn_password').removeClass('check_wrong_color')
						.removeClass('check_right_color');
				$('#warn_password')[0].innerHTML = "由6~18个英文字母、数字、点、减号、下划线组成";
			}).on('blur', function() {
		password_blur();
	});
	
	// 注册按钮
	$('#login_button').addClass('login_button').on('mousedown',
			function() {
				$(this).addClass('login_button_mousedown');
			}).on('mouseup', function() {
		$(this).removeClass('login_button_mousedown');
	});
});

// 用户名失去焦点

function name_blur() {
	var name = trim($('#name').val());
	if (name == "") {
		$('#warn_name').addClass('check_wrong_color');
		$('#warn_name')[0].innerHTML = "用户名不能为空";
		return false;
	}
	if (name != "") {
		if (!checkname(name)) {
			$('#warn_name').addClass('check_wrong_color');
			$('#warn_name')[0].innerHTML = "用户名格式错误";
			return false;
		}
	}
	$('#warn_name')[0].innerHTML = "<img src='img/right.PNG'/>";
	return true;

}

// 密码失去焦点
function password_blur() {
	if (trim($('#password').val()) != "") {
		if (!checkPassword(trim($('#password').val()))) {
			$('#warn_password').addClass('check_wrong_color');
			$('#warn_password')[0].innerHTML = "密码格式不正确";
			return false;
		} else {
			$('#warn_password')[0].innerHTML = "<img src='img/right.PNG'/>";
			return true;
		}
	} else {
		$('#warn_password').addClass('check_wrong_color');
		$('#warn_password')[0].innerHTML = "密码不能为空";
		return false;
	}
}

// 提交时候调用的方法
function submitFun() {
	var flag = 1;
	if (!name_blur())
		flag = 0;
	if (!password_blur())
		flag = 0;
	if (flag) {
		outputInfo();
		return true;
	}
	return false;
}
// 判断用户名是否正确
function checkname(name) {
	// alert('判断用户名是否正确 ' + name);
	var pattern = /^[\u4e00-\u9fa5|a-zA-Z0-9_-]{2,10}$/;
	if (!pattern.test(name))
		return false;
	return true;
}
// 判断密码是否正确
function checkPassword(password) {
	// alert('验证密码 ' + password);
	var pattern = /^[a-zA-Z0-9._-]{6,18}$/;
	if (!pattern.test(password))
		return false;
	return true;
}

// 去除字符串的前后多余空格
function trim(s) {
	return trimRight(trimLeft(s));
}
// 去掉左边的空白
function trimLeft(s) {
	if (s == null) {
		return "";
	}
	var whitespace = new String(" \t\n\r");
	var str = new String(s);
	if (whitespace.indexOf(str.charAt(0)) != -1) {
		var j = 0, i = str.length;
		while (j < i && whitespace.indexOf(str.charAt(j)) != -1) {
			j++;
		}
		str = str.substring(j, i);
	}
	return str;
}
// 去掉右边的空白
function trimRight(s) {
	if (s == null)
		return "";
	var whitespace = new String(" \t\n\r");
	var str = new String(s);
	if (whitespace.indexOf(str.charAt(str.length - 1)) != -1) {
		var i = str.length - 1;
		while (i >= 0 && whitespace.indexOf(str.charAt(i)) != -1) {
			i--;
		}
		str = str.substring(0, i + 1);
	}
	return str;
}