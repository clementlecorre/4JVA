FROM glassfish:4.0
COPY courses/dist/courses.war /glassfish4/glassfish/domains/domain1/autodeploy/courses.war
COPY run.sh /root/run.sh
RUN chmod +x /root/run.sh
CMD /root/run.sh
