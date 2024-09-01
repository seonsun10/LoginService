<!doctype html>
<html lang="ko">
<head>
    <script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js" charset="utf-8"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<body>
<script type="text/javascript">
    var naver_id_login = new naver_id_login("yDFoDBEbiEPjC5b4vXw9", "http://localhost:8081/callback-naver");
    // 접근 토큰 값 출력
    // alert(naver_id_login.oauthParams.access_token);
    // 네이버 사용자 프로필 조회
    naver_id_login.get_naver_userprofile("naverSignInCallback()");
    // 네이버 사용자 프로필 조회 이후 프로필 정보를 처리할 callback function
    function naverSignInCallback() {
        var id = naver_id_login.getProfileData('id');
        var name = naver_id_login.getProfileData('name');
        var gender = naver_id_login.getProfileData('gender');
        var birthyear = naver_id_login.getProfileData('birthyear');

        $.ajax({
            url: '/naver-info',
            type: 'POST',
            contentType: 'application/json',  // JSON 형식의 본문으로 전송
            data: JSON.stringify({
                id: id,
                name: name,
                gender: gender,
                birthyear: birthyear
            })
        });

    }
</script>
</body>
</html>