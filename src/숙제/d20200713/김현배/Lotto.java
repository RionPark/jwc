package 숙제.d20200713.김현배;

public class Lotto {

	public static void main(String[] args) {
		LottoNumCreater lNC = new LottoNumCreater();
		NumAutoArray nAA = new NumAutoArray();
		System.out.println(nAA.arrayer(lNC.creater()));	
	}
}
//
//1. 우분트에대하여 ..
//우분트의 특징 3가지 이상 쓰시오!
//- 데비안에서 파생한 리눅스 커널을 기반으로한  리눅스 배포판 중 하나이다.
//- 이 운영체제이 이름은 남아프리카 공화국의 건국 이념을 따라 지어졌다.
//- 개인용 데스크톱과 노트북에서 가장 인기있는 리눅스 배포판이다.
//- 배포판을 수정하거나 재배포할 수 있는 free software 이다.
//
//
//2. CLi (cd 체인지디렉토리, \ 루트, mkdir 메이크디렉토리 ,notepad 1.txt 1이라는 텍스트파일 만들기,
//	fsutil file createnew jsp.txt 2  2바이트의 jsp.txt 파일을 만든다.
//	문자의 기본단위 1바이트 한글은 3바이트)
//3. GUI ( 작업관리자 , 이클립스 세부정보로 이동, 우선순위 설정 , 높음으로 올릴수 있다.)
//4. 데이터베이스의 종류 및 선정 (db들의 차이점! 특징!) 관계형 데이터베이스의 특징 dbms의 특징 외우자!
//상용화, 오픈소스 기반 dbms
//- 데이터 무결성 ; 부적절한 자료가 입력되어 동일한 내용에 대하여 서로 다른 데이터가 저장 되는 것을 허용하지 않는 성질
//- 데이터 일관성 ; 삽입, 삭제, 갱신, 생성 후에도 저장된 데이터가 변함없이 일정한 성질
//- 데이터 회복성 ; 장애가 발생하였을 시 특정 상태로 복구되어야 하는 성질
//- 데이터 보안성 ; 불법적인 노출, 변경, 손실로부터 보호되어야 하는 성질
//- 데이터 효율성 ; 응답시간, 저장 공간 활용 등이 최적화되어  사용자, 소프트웨어, 시스템등의 요구 조건을 만족 시켜야 하는 성질
//
//상용화 dbms - oracle, ms sql server, db2, Microsoft Access, Teradata
//오픈소스 dbms - MySQL, PostgreSQL, Mongo DB, Redis, Elasticsearch
//
//5. ermaster 사용 (테이블 만들기, 테이블 더블클릭, 변수(캡쳐 꼭하기!!!  저장 내보내기 ddl-쿼리문)
//
//6. 쿼리문 작성하기 !
//	select *from anything where num 3;
//
//insert into board(num, title, content, credat, cretim, creusr)
//values(
//(SELECT nvl(max(num),0)+1 from board),
//'제목','내용','20200706','114000','유저');
//
//select max(num),min(num),sum(num),avg(num) from board; 
//
//7. wan, lan 
//wan - 광대역 네트워크 ; lan에 비해 전송 거리가 넓음. 라우팅 알고리즘이 필요함. lan 대비 애러율이 높고 전송 지연율이 큼
//lan - 근거리 네트워크 ; 한 건물 또는 작은 지역을 커버하는 네트워크.
//
//8. osi 7계층 외우셈!
//1) 물리 계층 ; 실제 장비들을 연결하기 위한 연결 장치
//2) 데이터 링크 계층 ; 오류와 흐름을 제거하여 신뢰성 있는 데이터를 전송
//3) 네트워크 계층 ; 다수의 중개 시스템중 올바른 경로를 선택하도록 지원
//4) 전송 계층 ; 송신, 수신 프로세스 간의 연결
//5) 세션 계층 ; 송신, 수신 간의 논리적 연결
//6) 표현 계층 코드 문자 등을 번역하여 일관되게 전송하고 압축, 해제, 보안 기능도 담당
//7) 응용 계층 ; 사용자 친화 환경 제공(이메일, 웹등)
//
//9. ipconfig /all cmd 콘솔창에 치면 모든정보 나옴 (mac 주소확인)
//- mac 주소란 네트워크 주소가 아닌 내 컴퓨터의 물리적 주소라고 생각하자.
//ipconfig /all 을 치면 물리적 주소 라고 뜨는것이 mac 주소이다.
//
//10. osi 7계층! 60p.
//
//11. 이클립스 설치, 톰캣 설치, 이클립스에 톰캣 연결 (톰캣 연결은 3가지 )
//
//12. 프로그래밍 언어별 특징 
//java ; 정적 , 일반, 객체 지향, 명령형, 
//c# ; 정적, 일반, 객체 지향, 명령형
//c++ ; 정적, 일반 , 순차적, 명령형 지원도구 존재하지 않음
//SQL ; 동적, 데이터 처리 , 선언형 
//Python ; 동적, 일반 , 순차적, 명령형

