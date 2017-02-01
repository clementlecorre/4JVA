FROM glassfish:4.1
RUN curl http://repo1.maven.org/maven2/mysql/mysql-connector-java/5.1.34/mysql-connector-java-5.1.34.jar -o glassfish/lib/mysql-connector-java-5.1.34.jar
COPY courses/dist/courses.war /glassfish4/glassfish/domains/domain1/autodeploy/courses.war
COPY run.sh /root/run.sh
RUN chmod +x /root/run.sh
CMD /root/run.sh
