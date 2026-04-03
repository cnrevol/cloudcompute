

43.206.143.211
ec2-user



#### install enviroment imdependent



#### get source code from github

```bash
git clone https://github.com/cnrevol/cloudcompute.git

cd cloudcompute/devops/projects/webconfrim

```

#### docker

```bash
sudo yum install docker -y
sudo service docker start
sudo usermod -aG docker ec2-user

docker build -t spring-demo .


```

