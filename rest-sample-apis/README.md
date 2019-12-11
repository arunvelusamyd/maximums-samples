#Docker, #Api, #Restapi , #Apisamples

To Build docker image,
docker image build -t rest-sample-apis .

To list docker images,
docker image ls

To run the docker image,
docker run -p 8080:8080 rest-sample-apis

To run the docker image in the background,
docker run -d -p 8080:8080 rest-sample-apis

TO list the docker containers,
docker container ls

To tail the logs,
docker logs -f <<container_id>>

To kill the docker container
docker kill <<container_id>>