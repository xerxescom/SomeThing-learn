# docker部署（Ubuntu）

sudo apt update

sudo apt install apt-transport-https ca-certificates curl gnupg-agent software-properties-common

\# aliyun docker

curl -fsSL http://mirrors.aliyun.com/docker-ce/linux/ubuntu/gpg | sudo apt-key add -

sudo add-apt-repository "deb [arch=amd64] http://mirrors.aliyun.com/docker-ce/linux/ubuntu $(lsb_release -cs) stable"

sudo apt update

sudo apt install docker-ce docker-ce-cli

sudo usermod -aG docker $USER

#  docker部署（Deepin）

sudo apt update
sudo apt install apt-transport-https ca-certificates curl gnupg-agent software-properties-common

curl -fsSL http://mirrors.aliyun.com/docker-ce/linux/debian/gpg | sudo apt-key add -
echo "deb [arch=amd64] http://mirrors.aliyun.com/docker-ce/linux/debian stretch stable" | sudo tee /etc/apt/sources.list.d/docker.list

sudo apt update
sudo apt install docker-ce docker-ce-cli

sudo usermod -aG docker $USER



### 深度系统查看基于的Debian版本 cat /etc/debian_version 

### Debian发行版本 https://www.debian.org/releases/index.zh-cn.html 

 