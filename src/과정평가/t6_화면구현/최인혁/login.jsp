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
    <label for="uiId">아이디</label>
    <input type="email" class="form-control" id="uiId" aria-describedby="uiHelp">
   
  </div>
  <div class="form-group">
    <label for="uiPwd">비밀번호</label>
    <input type="password" class="form-control" id="uiPwd">
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="idCheck">
    <label class="form-check-label" for="idCheck">아이디 기억하기</label>
  </div>
  <button type="button" onclick="dologin()" class="btn btn-danger">로그인</button>
</form>
<script>
function dologin(){
	if ($('#uiId').val().trim().length < 4) {
		alert("아이디는 4글자 이상입니다")
		return $('#uiId').focus();
	}
	if ($('#uiPwd').val().trim().length < 4) {
		alert("비밀번호는 4글자 이상입니다")
		return $('#uiPwd').focus();
	}
	var params = {
         uiId:$('#uiId').val(),
         uiPwd:$('#uiPwd').val(),
         cmd:'login'
   }
   
   $.ajax({
      method:'POST',
      data:JSON.stringify(params),
      url:'/user',
      success:function(res){
         if(res==true){
            alert("로그인 완료");
            location.href="/";
         }else if(res==false){
            alert("로그인 실패")
         }
      },
      error:function(err){
         
      }
      
      
   })
   
   
   
}

</script>
</body>
</html>