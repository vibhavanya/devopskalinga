<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>ALBUM ID</th>
			<th>ALBUM NAME</th>
			<th>SONG ID </th>			
			<th>SONG NAME </th>
			<th>ARTIST ID </th>
			<th>ARTIST NAME </th>
			
		</tr>
		<c:forEach items="${songDtos}" var="songDto">
			<tr>
				<td><c:out value="${songDto.getAlbum().getAlbumId()}" /></td>
				<td><c:out value="${songDto.getAlbum().getAlbumName()}" /></td>
				<td><c:out value="${songDto.getSongId()}" /></td>
				<td><c:out value="${songDto.getSongName()}" /></td>
				<c:forEach items="${songDto.getArtists()}" var="artistDto">
				
				<td><c:out value="${artistDto.getArtistId()}" /></td>
				<td><c:out value="${artistDto.getArtistName()}" /></td>
		
				</c:forEach>
			</tr>

		</c:forEach>
		<button type="submit" onclick="location.href='/'">Home</button>
	</table>

</body>
</html>