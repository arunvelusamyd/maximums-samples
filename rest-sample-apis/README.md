#Docker, #Api, #Restapi , #Apisamples

#To Build docker image,
docker image build -t rest-sample-apis .

#To list docker images,
docker image ls

#To run the docker image,
docker run -p 8080:8080 rest-sample-apis

#To run the docker image in the background,
docker run -d -p 8080:8080 rest-sample-apis

#TO list the docker containers,
docker container ls

#To tail the logs,
docker logs -f <<container_id>>

#To kill the docker container,
docker kill <<container_id>>

#Tag your image,
docker tag rest-sample-apis rest-sample-apis:1.0

#login to docker hub from your terminal,
docker login --username=<<your user for https://hub.docker.com>>
#Enter you password.

#build docker image with your username of docker hub,
docker image build -t <<your user for https://hub.docker.com>>/rest-sample-apis .

#Push docker image to docker hub https://hub.docker.com,
docker push <<your user for https://hub.docker.com>>/rest-sample-apis
