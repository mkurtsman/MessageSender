package ru.rgs.messagesender.jms;

import org.apache.camel.processor.resequencer.Timeout;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "rmq")
public  class RmqCommonConfig {

    protected String hostname;
    protected Integer port;
    protected String username;
    protected String password;
    protected String virtualHost;
    protected Timeout timeout;
    protected String addresses;

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
    }

    public void setTimeout(Timeout timeout) {
        this.timeout = timeout;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "RmqCommon{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", virtualHost='" + virtualHost + '\'' +
                ", timeout=" + timeout +
                ", addresses='" + addresses + '\'' +
                '}';
    }
}