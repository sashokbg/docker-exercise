* Start database:
    ```
    docker run -p 3306:3306 --network www-net --name some-mariadb -e MYSQL_DATABASE=visits -e MYSQL_ROOT_PASSWORD=my-secret-pw -d -v /home/alexander/projects/docker-exercise/src/main/resources/sql:/docker-entrypoint-initdb.d mariadb
    ```
  
1) Installer et configurer docker et docker-compose (attention à bien suivre le guide dans le site officiel docker)
2) (Optionnel) Faite marcher docker sans sudo
3) Préparez un spring boot qui utilise JPA (service back)
4) Préparer un script SQL d'init database pour le service (db)
   - une seule table suffit
5) Créez un fichier dockerfile pour le service "back"
6) Créez un fichier dockerfile pour le service "db"
7) Créez un fichier docker-compose qui démarre le tout
8) Testez
