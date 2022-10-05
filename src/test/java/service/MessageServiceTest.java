package service;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MessageServiceTest {

    @Test
    void addMessageTest(){
        MessageService service=mock(MessageService.class);
        service.addMessage("selam");
        service.addMessage("mockito");
        service.addMessage("mockito");
        service.addMessage("mockito");

        //mockito diye bir string obje veya parametre addMessage servisine verilmis mi verilmemis mi
        verify(service,times(3)).addMessage("mockito");
    }
}
