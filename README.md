# body-mass-index

### Things todo

1. Clone the repository: `git clone https://github.com/hendisantika/body-mass-index.git`
2. Navigate to the folder: `cd body-mass-index`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8000

### Docker Way

Build Dockerfile

```shell
docker build -t hendisantika/bmi:v1 hendisantika/bmi:v1 .
```

Tag Dockerfile

```shell
docker tag hendisantika/bmi:v1 hendisantika/bmi:v1
```

Run Docker Image

```shell
docker run -it --rm -p 8000:8000 --name bmiapp hendisantika/bmi:v1
```

Push Docker to Dockerhub

```shell
docker push hendisantika/bmi:v1 hendisantika/bmi:v1
```
