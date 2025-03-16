#### *1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).*

``` 
aao@VirtUbuntu:~$ cat > home_animals
dogs
cats
hamsters
^C
aao@VirtUbuntu:~$ cat > pack_animals
horses
camels
donkeys    
^C
aao@VirtUbuntu:~$ cat home_animals pack_animals > mans_friends
aao@VirtUbuntu:~$ cat mans_friends 
dogs
cats
hamsters
horses
camels
donkeys
aao@VirtUbuntu:~$ mv mans_friends mans_best_friends 

```

#### *2. Создать директорию, переместить файл туда.*
```
aao@VirtUbuntu:~$ mkdir animals
aao@VirtUbuntu:~$ mv mans_best_friends animals
aao@VirtUbuntu:~$ cd animals
aao@VirtUbuntu:~/animals$ ls -ali
```

#### *3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.*

```
sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server
```

#### *4. Установить и удалить deb-пакет с помощью dpkg.*
```
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb

sudo dpkg -i --force-depends google-chrome-stable_current_amd64.deb

sudo dpkg --purge google-chrome-stable
```

#### *5. Выложить историю команд в терминале ubuntu*

``` 
cat > home_animals
dogs
cats
hamsters
^C

cat > pack_animals
horses
camels
donkeys
^C

cat home_animals pack_animals > mans_friends
cat mans_friends 
dogs
cats
hamsters
horses
camels
donkeys
mv mans_friends mans_best_friends    

sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server

wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo dpkg -i --force-depends google-chrome-stable_current_amd64.deb
sudo dpkg --purge google-chrome-stable
```


