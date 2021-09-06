### 先使用docker部署neo4j服务再进行使用

#### 注：安装docker见learn-docker/docker.md



# neo4j搭建

```shell
docker pull neo4j:4.0

mkdir -p ~/workspace-docker/neo4j/data/
mkdir -p ~/workspace-docker/neo4j/logs/
mkdir -p ~/workspace-docker/neo4j/conf/
mkdir -p ~/workspace-docker/neo4j/import/
mkdir -p ~/workspace-docker/neo4j/logs/

docker run -d --security-opt apparmor=unconfined --restart unless-stopped --name neo4j \
-p 7474:7474 -p 7687:7687 \
-e NEO4J_AUTH=neo4j/neo4j123 \
-v ~/workspace-docker/neo4j/conf:/var/lib/neo4j/conf \
-v ~/workspace-docker/neo4j/data:/data \
-v ~/workspace-docker/neo4j/import:/import \
-v ~/workspace-docker/neo4j/logs:/logs \
-v ~/workspace-docker/neo4j/plugins:/var/lib/neo4j/plugins \
neo4j:4.0
```
深度系统Deepin需要在部署容器时多加入以下参数:
--security-opt apparmor=unconfined