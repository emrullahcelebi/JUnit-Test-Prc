package service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.MessageRepository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest2 {

    @Mock//moclanacak kisim moclandi ve bu class a verildi
    MessageRepository repository;

    @InjectMocks//service instance olusturup ve yukaridaki moclonan her objeyi bu class a enjecte eder
    MessageService service;

    @Test
    void testMessage(){

        try {
            when(repository.getMessage()).thenReturn(Arrays.asList("asas","sas"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<String> actualList=service.getMessage();
        assertNotNull(actualList);
        assertEquals(2,actualList.size());
    }


}
