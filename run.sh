#!/bin/sh
PID_FILE=$GLASSFISH_HOME/glassfish/domains/domain1/config/pid
asadmin start-domain
asadmin deploy /glassfish4/glassfish/domains/domain1/autodeploy/courses.war

inotifywait -qq -e delete_self $PID_FILE
