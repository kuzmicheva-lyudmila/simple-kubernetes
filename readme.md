docker build -t simple-kubernetes-latest:v0.1 .
docker run -p 3333:8000 simple-kubernetes-latest:v0.1

docker ps

-- push to dockerhub
docker login --username=lkuzmicheva
docker tag simple-kubernetes-latest:v0.1 lkuzmicheva/simple-kubernetes:0.1
docker push lkuzmicheva/simple-kubernetes:0.1