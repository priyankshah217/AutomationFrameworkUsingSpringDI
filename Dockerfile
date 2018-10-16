FROM gradle
MAINTAINER Priyank Shah (priyank.shah217@gmail.com)
COPY build.gradle .
#RUN gradle resolveDependencies
COPY . .
ENTRYPOINT ./gradlew e2e -DSeleniumHub=selenium-hub -DBrowserType=firefox