Утилита дла непрерывной отправки сообщений


# build

mvn clean dependency:sources package

# start:
cd target\artifacts\image
%JAVA_HOME%/bin/java -cp lib/*  -Dlogging.file.name=./log/camel-starter.log  ru.rgs.messagesender.MessageSender

# shutdown: 
curl -X POST localhost:port/shutdown
