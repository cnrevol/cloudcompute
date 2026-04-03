

43.206.143.211
ec2-user



#### install enviroment imdependent



#### get source code from github

```bash
git clone https://github.com/cnrevol/cloudcompute.git

cd cloudcompute/devops/projects/webconfrim/java-spring-demo

```

#### docker

```bash
sudo yum install docker -y
sudo service docker start
sudo usermod -aG docker ec2-user

docker build -t spring-demo .


docker run -d -p 8080:8080 spring-demo

docker ps

docker ps -a

docker logs -f 容器ID

# 查看资源使用
docker stats

# 进入容器（调试用）
docker exec -it 容器ID /bin/bash

# 查看端口映射
docker port 容器ID

docker stop 容器ID

docker rm -f

```


#### ec2 SSH key

```bash
在 GitHub 添加 Secret
进入你的仓库 → Settings → Secrets and variables → Actions → New repository secret。
添加私钥：
名称：EC2_KEY
内容：私钥文本（id_rsa_deploy 文件内容）

⚠️ 注意不要直接上传公钥，也不要在代码里明文写私钥。
```