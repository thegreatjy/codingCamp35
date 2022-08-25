# codingCamp35

- [jdk 설치](https://www.azul.com/downloads/?version=java-11-lts&os=macos&architecture=arm-64-bit&package=jdk)

- jdk 환경변수 변경
1. jdk 설치된 파일에서 터미널을 연다.

```
cd /Library/Java/JavaVirtualMachines/zulu-11.jdk/Contents/Home
```

2.
```
vi ~/.bash_profile
```
```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-11.jdk/Contents/Home
export PATH=${PATH}:$JAVA_HOME/bin
```

3. 설정 저장
```
source ~/.bash_profile
```
- [톰캣 설치](https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.65/bin/apache-tomcat-9.0.65.zip)

```
vim /Applications/STS.app/Contents/Eclipse/STS.ini
