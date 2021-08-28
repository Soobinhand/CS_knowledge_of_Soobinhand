- [IntelliJ에서 new remote repository 만들기](#intelliJ에서-new-remote-repository-만들기)
- [만약에 git remote repository 이름을 변경하고 싶다면?](#만약에-git-remote-repository-이름을-변경하고-싶다면?)
- [Local 에서 git 인증 문제가 나온다면?](#Local-에서-git-인증-문제가-나온다면?)
- [gitignore 사용법](#gitignore-)


## IntelliJ에서 new remote repository 만들기
#### 선제 조건) local 에서 이미 프로젝트를 하나 새로 만들어 놓은 상태.
>1. Ctrl Shift A를 누른 후, share project on github을 검색
>2. 로그인 or 로그인이 되어있음
>3. 깃허브에 생성할 저장소 정보를 입력하는 화면이 나옴.
>4. 대부분 local과 remote저장소 이름을 같게 하니 같게 입력.
>5. 첫 번째 커밋을 위한 팝업창이 등장.
>6. .idea나 .gradle .build 등등은 선택하지 않고 나머지는 선택해서
   커밋 메시지를 작성 후 OK버튼 클릭
>7. 그럼 깃허브에 자동 생성이 되어있음.
>8. 만약 gitignore가 없다면 프로젝트를 우클릭한 후 new에 들어가
   ignore file중 git ignore를 클릭하면 생성 화면이 나옴.
>9. generate 버튼을 누르면 gitignore파일이 생성됨. 거기다가 이제 추가하면 됨.
>10. Ctrl K 를 누르면 커밋 창이 뜸.
>11. Ctrl Shift K를 누르면 푸쉬 창이 뜸.
>12. 끝

---

## 만약에 git remote repository 이름을 변경하고 싶다면?
#### 선제조건) local 과 remote 가 이미 있어야 한다.
> 1. git remote repository 이름을 변경한다.
> 2. local 로 들어온다.
> 3. 기존 터미널에 git remote set-url origin "새 주소"를 입력한다.
> 4. 끝

---

## Local 에서 git 인증 문제가 나온다면?
> 1. git remote set-url origin "깃 토큰 주소"를 입력한다.
> 2. 끝

---

## gitignore 사용법
#### 선제조건) 프로젝트가 만들어져 있어야 한다.
> 1. [Ctrl + Shift + A]를 누릅니다.
> 2. `Action` 검색창을 열어 `plugins` 를 검색합니다.
> 3. `Marketplace` 에서 `.ignore` 를 검색합니다.
> 4. `Install` 합니다.
> 5. 프로젝트에 마우스 우클릭을 하여 `new` 로 들어갑니다.
> 6. `.ignore File` 의 `.gitignore File` 을 누릅니다.
> 7. 설정 없이 `Generate` 를 누릅니다.
> 8. 그 후 만들어진 `gitignore` 파일에 들어갑니다.
> 9. 인텔리제이에서 자동으로 생성되는 파일들은 모두 이그노어 처리하면 됩니다.
> > `.idea`, `.gradle` `*.docx`등등
> 10. 그 후 이 파일도 깃허브에 `push` 해줍니다.
> 11. 끝

---

