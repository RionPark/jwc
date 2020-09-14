<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/common/head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="/common/menu.jsp"></jsp:include>
	<form>
		<div class="form-group">
			<label for="uiId">아이디</label> <input type="text" class="form-control"
				id="uiId">

		</div>
		<div class="form-group">
			<label for="uiPassword">비밀번호</label> <input type="password"
				class="form-control" id="uiPassword">
		</div>
		<div class="form-group form-check">
			<input type="checkbox" class="form-check-input" id="saveCheckId">
			<label class="form-check-label" for="saveCheckId">아이디 기억하기</label>
		</div>
		<button type="submit" class="btn btn-primary" onclick="doLogin()">로그인</button>

		<script>
			function doLogin() {
				if ($('#uiId').val().trim().length < 4) {
					alert('아이디는 4글자 이상가능합니다');
					$('#uiId').focus();
					return;
				}
				if ($('#uiPassword').val().trim().length < 4) {
					alert('비밀번호는 4글자 이상입니다');
					$('#uiPassword').focus();
					return;
				}

				var params = {
					uiId : $('#uiId').val(),
					uiPassword : $('#uiPassword').val(),
					cmd : 'login'
				}

				console.log(params);
				$.ajax({
					url : 'ajax/user',
					method : 'POST',
					data : JSON.stringify(params),
					contentType : 'application/json',
					success : function(res) {
						if (res.result == true) {
							alert('로그인 확인')
							location.href = '/';
						} else if(res.result!=true){
							alert('로그인 실패')
						}
					}

				})

			}
		</script>
</body>
</html>