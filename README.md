# first-docker-springboot
This project demo how  to dockerized  the springboot application

Following are the commonds whhich will build and pusg the Docker image to repo


---------Build Docker Image---------------

docker build -f Dockerfile -t docker-springboot .

--------Commit  image to docker Hub-----------

docker commit *containerId* sushim/docker-springboot:1

------Push to docker repository---------------

docker push sushim/docker-springboot:1


---------Installl and run docker image localy--------

docker run -p 8085:8080 sushim/docker-springboot:1
