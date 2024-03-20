<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<%@ include file="../includes/header.jsp"%>



<script type="text/javascript">
   $(document).ready(function() {
      var result = '<c:out value="${result}"/>'; // BoardController 에 있는 result값을 가져와서 넣어줌
  												 // register modify remove      
      checkModal(result);
      
      history.replaceState({}, null, null);
      
      function checkModal(result) {
         
         if (result === '' || history.state) {			// result 값이 없다면 skip 

            return;
         }
         
         if (parseInt(result) > 0) {					// result 값이 0보다 크다는건 값이 있다는거

            $(".modal-body").html(
                  "게시글 "  + parseInt(result) + " 번이 등록되었습니다.");
         }
         
         $("#myModal").modal("show");
      }
      
		// 버튼 추가
		$("#regBtn").on("click", function() {
			self.location = "/board/register";
		});
		
		// 14장 페이징 부분 추가
	var actionForm = $("#actionForm");
		
		$(".paginate_button a").on("click", function(e) {
			
			e.preventDefault();
			
			console.log('click');
			
			actionForm.find("input[name='pageNum']").val($(this).attr("href"));
        	actionForm.submit();
      });
      
      $(".move").on("click", function(e) {
         e.preventDefault();
         actionForm.append("<input type='hiddent' name='bno' value='"+$(this).attr("href")+"'>");
         actionForm.attr("action", "/board/get");
         actionForm.submit();
      });
      
      // 15장 검색 버튼 클릭하면 나오는 문제 해결
      var searchForm = $("#searchForm");
      
      $("#searchForm button").on("click", function(e) {
    	 
    	  // select를 안했을때
    	  if(!searchForm.find("option:selected").val()) {
    		  alert("검색종류를 선택하세요");
    		  return false;
    	  }
    	  // 검색어가 비어있을때
    	  if(!searchForm.find("input[name='keyword']").val()){
    		  alert("키워드를 입력하세요");
    		  return false;
    	  }
    	  // 페이지 넘버가 비어있으면 강제로 1로 주입 이후 유지
    	  searchForm.find("input[name='pageNum']").val("1"); 
    	  e.preventDefault();
    	  
    	  searchForm.submit();
      });
      
   });
</script>

	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Board Tables</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->

	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Board List Page
				
				<!--  버튼 추가 -->
				<button id = 'regBtn' type = "button" class = "btn btn-xs pull-right">Register New Board</button>
				</div>
				
				
				<!-- /.panel-heading -->
				<div class="panel-body">
					<table class="table table-striped table-borded table-hover">
						<thread>
						<tr>
							<th>#번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성일</th>
							<th>수정일</th>
						</tr>
						</thread>
						<c:forEach items="${list}" var="board">
							<tr>
								<td><c:out value="${board.bno}" /></td>
								
								<!-- title 제목을 눌렀을때 게시물 조회 설정 -->
								<td>
									<a class='move' href='<c:out value="${board.bno}"/>'>
										<c:out value="${board.title}" /></a>
								</td>									
								
								<td><c:out value="${board.writer}" /></td>
								<td><fmt:formatDate pattern="yyyy-MM-dd"
										value="${board.regdate}" /></td>
								<td><fmt:formatDate pattern="yyyy-MM-dd"
										value="${board.updateDate}" /></td>
							</tr>
						</c:forEach>
					</table>
					
					<!-- 15장 -->
					<div class = 'row'>
						<div class = "col-lg-12">
							<form id = 'searchForm' action = "/board/list" method ="get">
								<select name = 'type'>
									<option value = ""
										<c:out value="${pageMaker.cri.type == null?'selected':''}"/>>--</option> <!--  -->
										<option value="T"
										 <c:out value="${pageMaker.cri.type eq 'T'?'selected':''}"/>>제목</option>
										<option value="C"
										 <c:out value="${pageMaker.cri.type eq 'C'?'selected':''}"/>>내용</option>
										<option value="W"
										 <c:out value="${pageMaker.cri.type eq 'W'?'selected':''}"/>>작성자</option>
										<option value="TC"
										 <c:out value="${pageMaker.cri.type eq 'TC'?'selected':''}"/>>제목 or 내용</option>
										<option value="TW"
										 <c:out value="${pageMaker.cri.type eq 'TW'?'selected':''}"/>>제목 or 작성자</option>
										<option value="TWC"
										 <c:out value="${pageMaker.cri.type eq 'TWC'?'selected':''}"/>>제목 or 내용 or 작성자</option>										
								</select>
									<input type ='text' name ='keyword'
									 value='<c:out value="${pageMaker.cri.keyword}"/>'/>
									<input type ='hidden' name ='pageNum' 
									 value='<c:out value="${pageMaker.cri.pageNum}"/>'/>
									<input type ='hidden' name ='amount' 
									 value='<c:out value="${pageMaker.cri.amount}"/>'/>
									<button class='btn btn-default'>Search</button>
							</form>
						</div>
					</div>
					
					<!-- 14장 JSP에서 페이지 번호출력 - 페이징 표시 부분 -->
					<div class = 'pull-right'>
						<ul class = "pagination">
							
							<c:if test="${pageMaker.prev}">
								<li class="paginate_button previous"><a href="${pageMaker.startPage -1}">Previous</a></li>
							</c:if>
							
							<c:forEach var="num" begin="${pageMaker.startPage}"
									end="${pageMaker.endPage}">
								<li class="paginate_button ${pageMaker.cri.pageNum == num ? "active":""} "> <a href="${num}">${num }</a></li>
							</c:forEach>

							<c:if test="${pageMaker.next}">
								<li class="paginate_button next">
									<a href="${pageMaker.endPage + 1 }">Next</a></li>
							</c:if>							
								
						</ul>
					</div> <!--  end Pagination -->
					<!-- page button actionform -->
					<form id = 'actionForm' action = "/board/list" method = 'get'>
						<input type ='hidden' name = 'pageNum' value = '${pageMaker.cri.pageNum}'>
						<input type ='hidden' name = 'amount' value = '${pageMaker.cri.amount}'>
						<input type ='hidden' name = 'type' value='<c:out value="${ pageMaker.cri.type }"/>'>
						<input type ='hidden' name = 'keyword' value='<c:out value="${ pageMaker.cri.keyword }"/>'>
					</form>		
					
					<!--  Modal(모달창) 추가 -->
					<div class = "modal fade" id = "myModal" tabindex="-1" role ="dialog"
						aria-labelledby="myModallabel" aria-hidden = "true">
						<div class = "modal-dialog">
							<div class = "modal-content">
								<div class = "modal-header">
									<button type ="button" class = "close" data-dismiss = "modal"
										aria-hidden="true"> &times;</button>
									<h4 class = "modal-title" id = "myModalLabel">Modal title</h4>
								</div>
								<div class = "modal-body">처리가 완료되었습니다.</div>
								<div class = "modal-footer">
									<button type = "button" class = "btn btn-default" data-dismiss="modal">close</button>
									<button type = "button" class = "btn btn-primary">Save changes</button>
								</div>
							</div> <!-- /.modal-content -->
						</div>	<!-- /.modal-dialog -->
					</div>	 <!-- /.modal -->

				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-6 -->
	</div>
	<!-- /.row -->
	
<%@ include file="../includes/footer.jsp"%>
