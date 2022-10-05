package service;

import repository.MessageRepository;

import java.sql.Array;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MessageService {
    //bu class da repository e erisim methodlari yazilir yani bussnise logic in yapilacagi yer
    //testi yapilacak class burasidir
    private MessageRepository repository;

    public MessageService(MessageRepository repository){
        this.repository=repository;
    }
    public void addMessage(String message){//esas test edecegim yer bu methodun calisip calismadigi
repository.addMessage(message);//iste testte trest edilecek kisim tam olarak burasi
    }
    public List<String> getMessage(){
        try {
            return repository.getMessage();
        } catch (SQLException e) {
           return Arrays.asList();
        }
    }
}
