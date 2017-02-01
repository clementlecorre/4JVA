#!/bin/sh
PID_FILE=$GLASSFISH_HOME/glassfish/domains/domain1/config/pid
asadmin start-domain
asadmin start-database --dbhost=localhost --dbport=1527
#asadmin create-jdbc-connection-pool --datasourceclassname org.apache.derby.jdbc.ClientDataSource --restype javax.sql.XADataSource --property portNumber=1527:password=APP:user=APP:serverName=localhost:databaseName=sun-appserv-samples:connectionAttributes=\;create\\=true sample__pm
asadmin set configs.config.server-config.cdi-service.enable-implicit-cdi=false
asadmin create-jdbc-resource --connectionpoolid DerbyPool jdbc/sample__pm
asadmin create-jdbc-resource --connectionpoolid DerbyPool jdbc/sample__nontx
asadmin deploy /glassfish4/glassfish/domains/domain1/autodeploy/courses.war
tail -f /usr/local/glassfish4/glassfish/domains/domain1/logs/server.log &
inotifywait -qq -e delete_self $PID_FILE

