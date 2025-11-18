package ru.rgs.messagesender.jms;

import org.apache.camel.CamelContext;
import org.apache.camel.component.rabbitmq.RabbitMQComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public  class RmqCommon {

    private static Logger log = LoggerFactory.getLogger(RmqCommon.class);
    private final RmqCommonConfig cfg;
    private final CamelContext camelContext;

    public RmqCommon(RmqCommonConfig cfg, CamelContext camelContext) {
        this.cfg = cfg;
        this.camelContext = camelContext;
    }

    @PostConstruct
    public void init(){
        camelContext.addComponent("rabbitmq", rabbitMQComponent());
    }

    public RabbitMQComponent rabbitMQComponent() {
        RabbitMQComponent rabbitMQComponent = new RabbitMQComponent();
        log.debug("rmq settings: {}", cfg);
//        rabbitMQComponent.setConnectionFactory(connectionFactory);
        rabbitMQComponent.setAddresses(cfg.addresses);
        rabbitMQComponent.setHostname(cfg.hostname);
        if(cfg.port != null) {
            rabbitMQComponent.setPortNumber(cfg.port);
        }
        rabbitMQComponent.setUsername(cfg.username);
        rabbitMQComponent.setPassword(cfg.password);
        rabbitMQComponent.setVhost(cfg.virtualHost);
        rabbitMQComponent.setAutomaticRecoveryEnabled(true);
        rabbitMQComponent.setAutoAck(true);
        rabbitMQComponent.setGuaranteedDeliveries(true);
        rabbitMQComponent.setDeclare(false);
        return rabbitMQComponent;
    }

}