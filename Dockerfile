FROM frekele/gradle
MAINTAINER Priyank Shah (priyank.shah217@gmail.com)
COPY . .
#RUN gradle resolveDependencies
ENTRYPOINT gradle e2e -DSeleniumHub=$SELENIUM_HUB -DBrowserType=$BROWSER