/**
 * Author:  clement
 * Created: 23 janv. 2017
 */

INSERT INTO APP.COURSESUSER (ID, CREATED, EMAIL, LASTCONNECTION, PASSWORD, USERNAME) VALUES (1, null, 'mail@mail.fr', null, 'bWF4aW1l', 'Maxime')

/* Cours 1 */
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (1, '# Swarm: a Docker-native clustering system \n \n `swarm` is a simple tool which controls a cluster of Docker hosts and exposes it as a single "virtual" host. \n  `swarm` uses the standard Docker API as its frontend, which means any tool which speaks Docker can control swarm transparently: dokku, docker-compose, krane, flynn, deis, docker-ui, shipyard, drone.io, Jenkins... and of course the Docker client itself. \n  Like the other Docker projects, `swarm` follows the "batteries included but removable" principle. It ships with a simple scheduling backend out of the box, and as initial development settles, an API will develop to enable pluggable backends. The goal is to provide a smooth out-of-box experience for simple use cases, and allow swapping in more powerful backends, like `Mesos`, for large scale production deployments. \n ', 'Docker swarm courses', 0.0)
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
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (10, 4, 'Mesos', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (11, 4, 'vmware', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (12, 4, 'cat and dog', 0)

/* cours 2 */
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (2, '# Elixir \n \n Elixir is a dynamic, functional language designed for building scalable and maintainable applications. Elixir leverages the Erlang VM, known for running low-latency, distributed and fault-tolerant systems, while also being successfully used in web development and the embedded software domain.', 'Elixir', 0.0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (4, 2, 'Elixir is ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (13, 4, 'dynamic', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (14, 4, 'slow very slow', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (14, 4, 'nothing', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (5, 2, 'Elixir is ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (15, 5, 'functional language', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (16, 5, 'Washing tool', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (17, 5, 'Magic potion', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (6, 1, 'Elixir is designed .... ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (18, 6, 'for building scalable and maintainable applications', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (19, 6, 'For joke', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (7, 2, 'Elixir is a')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (21, 7, 'language', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (22, 7, 'computer', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (23, 7, 'house', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (8, 2, 'Elixir leverages the Erlang')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (24, 8, 'VM', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (25, 8, 'hardware', 0)

/* cours 3 */
INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (3, '# CakePHP \n \n CakePHP is a rapid development framework for PHP which uses commonly known design patterns like Associative Data Mapping, Front Controller, and MVC. Our primary goal is to provide a structured framework that enables PHP users at all levels to rapidly develop robust web applications, without any loss to flexibility.', 'CakePHP', 0.0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (9, 3, 'CakePHP is ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (26, 9, 'rapid development framework ', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (27, 9, 'slow development framework', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (10, 3, 'CakePHP is ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (28, 10, 'PHP language', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (29, 10, 'JAVA language', 0)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (30, 10, 'Magic language', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (11, 3, 'CakePHP is MVC  ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (31, 11, 'Yes', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (32, 11, 'No', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (12, 3, 'CakePHP is flexibility?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (33, 12, 'Yes', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (34, 12, 'No', 0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (13, 3, 'CakePHP uses commonly known design patterns?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (36, 13, 'Yeahhhh', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (37, 13, 'No', 0)

INSERT INTO APP.COURSES (IDCOURSES, DETAILS, LABEL, RANK) VALUES (4, '# Nancy \n \n Nancy is a lightweight, low-ceremony, framework for building HTTP based services on .NET Framework/Core and Mono. The goal of the framework is to stay out of the way as much as possible and provide a super-duper-happy-path to all interactions.', 'Nancy', 0.0)
INSERT INTO APP.QUESTION (IDQUESTION, IDCOURSES, QUESTIONTEXT) VALUES (14, 4, 'Coucou ?')
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (38, 14, 'Yeahhhh', 1)
INSERT INTO APP.ANSWERS (IDANSWER, IDQUESTION, ANSWERTEXT, ISTRUE) VALUES (39, 14, 'No', 0)

INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (1, NULL, NULL, 1, 1, 0)
INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (2, NULL, NULL, 2, 1, 0)
INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (3, NULL, NULL, 3, 1, 0)
INSERT INTO APP.VIEWCOURSES (ID, DATEQUIZ, DATEVIEW, IDCOURSES, IDUSER ,PERCENTQUIZ) VALUES (4, NULL, NULL, 4, 1, 0)
