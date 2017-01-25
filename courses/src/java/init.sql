/**
 * Author:  clement
 * Created: 23 janv. 2017
 */

/*INSERT INTO APP.COURSESUSER (ID, CREATED, EMAIL, LASTCONNECTION, PASSWORD, USERNAME) VALUES (1, 0, 'mail@mail.fr', 0, 'dGVzdA==', 'admin')*/
INSERT INTO APP.COURSESUSER (ID, CREATED, EMAIL, LASTCONNECTION, PASSWORD, USERNAME) VALUES (1, null, 'mail@mail.fr', null, 'maxime', 'Maxime')
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (1, '# Swarm: a Docker-native clustering system \n \n `swarm` is a simple tool which controls a cluster of Docker hosts and exposes it as a single "virtual" host. \n  `swarm` uses the standard Docker API as its frontend, which means any tool which speaks Docker can control swarm transparently: dokku, docker-compose, krane, flynn, deis, docker-ui, shipyard, drone.io, Jenkins... and of course the Docker client itself. \n  Like the other Docker projects, `swarm` follows the "batteries included but removable" principle. It ships with a simple scheduling backend out of the box, and as initial development settles, an API will develop to enable pluggable backends. The goal is to provide a smooth out-of-box experience for simple use cases, and allow swapping in more powerful backends, like `Mesos`, for large scale production deployments. \n ', 'Docker swarm courses', 0.0)
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (2, '# test1', 'Cours test 1', 0.0)
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (3, '# test2', 'Cours test 2', 0.0)
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (4, '# test3', 'Cours test 3', 0.0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (1, 1, 'What s the most butiful things you ever seen in your life ?')
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (2, 1, 'Tuhpuhduhcuh ?')
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (1, 2, 'What s the most butiful things you ever seen in your life ?')
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (2, 1, 'What s the most butiful things you ever seen in your life ?')
INSERT INTO APP.RESPONSES (IDRESPONSE, IDQUESTION, RESPONSETEXT, ISTRUE) VALUES (1, 1, 'Watermelon', 1)
INSERT INTO APP.RESPONSES (IDRESPONSE, IDQUESTION, RESPONSETEXT, ISTRUE) VALUES (2, 1, 'Banana', 0)
INSERT INTO APP.RESPONSES (IDRESPONSE, IDQUESTION, RESPONSETEXT, ISTRUE) VALUES (3, 1, 'Potato', 0)
INSERT INTO APP.RESPONSES (IDRESPONSE, IDQUESTION, RESPONSETEXT, ISTRUE) VALUES (1, 2, 'yes', 0)
INSERT INTO APP.RESPONSES (IDRESPONSE, IDQUESTION, RESPONSETEXT, ISTRUE) VALUES (2, 1, 'non', 1)
