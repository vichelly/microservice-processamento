package meu.microservico.processamento.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import meu.microservico.processamento.dto.PedidoDTO;

@Component
public class ProcessamentoConsumer {
    
    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listernerProcessamentoQueue(PedidoDTO pedidoDTO){
        System.out.println(pedidoDTO.getDescricao());
    }

}
