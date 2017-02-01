/**
 * Author:  clement
 * Created: 23 janv. 2017
 */

/*INSERT INTO APP.COURSESUSER (ID, CREATED, EMAIL, LASTCONNECTION, PASSWORD, USERNAME) VALUES (1, 0, 'mail@mail.fr', 0, 'dGVzdA==', 'admin')*/
INSERT INTO APP.COURSESUSER (ID, CREATED, EMAIL, LASTCONNECTION, PASSWORD, USERNAME) VALUES (1, null, 'mail@mail.fr', null, 'bWF4aW1l', 'Maxime')
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (1, '# Swarm: a Docker-native clustering system \n \n `swarm` is a simple tool which controls a cluster of Docker hosts and exposes it as a single "virtual" host. \n  `swarm` uses the standard Docker API as its frontend, which means any tool which speaks Docker can control swarm transparently: dokku, docker-compose, krane, flynn, deis, docker-ui, shipyard, drone.io, Jenkins... and of course the Docker client itself. \n  Like the other Docker projects, `swarm` follows the "batteries included but removable" principle. It ships with a simple scheduling backend out of the box, and as initial development settles, an API will develop to enable pluggable backends. The goal is to provide a smooth out-of-box experience for simple use cases, and allow swapping in more powerful backends, like `Mesos`, for large scale production deployments. \n ', 'Docker swarm courses', 0.0)
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (2, '# test1', 'Cours test 1', 0.0)
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (3, '# test2', 'Cours test 2', 0.0)
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (4, '# test3', 'Cours test 3', 0.0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (1, 1, 'Swarm is ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (1, 1, 'Swarm is a sime tool', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (2, 1, 'Swarm is very complexe', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (3, 1, 'swarm is nothing', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (2, 1, 'What uses swarm  ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (4, 2, 'Swarm Uses the standard Docker API', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (5, 2, 'Swarm use a magic tool', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (6, 2, 'Swarm use VMware tech', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (3, 1, 'What is Swarm ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (7, 3, 'Docker-native clustering system', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (8, 3, 'Bullshit', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (9, 3, 'Bullshit 2', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (4, 1, 'Like swarm...')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (9, 4, 'Mesos', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (10, 4, 'cattle', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (11, 4, 'vmware', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (12, 4, 'cat and dog', 0)

INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (1, NULL, NULL, 1, 1, 0)
INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (2, NULL, NULL, 2, 1, 0)
INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (3, NULL, NULL, 3, 1, 0)
INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (4, NULL, NULL, 4, 1, 0)
