package repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class MessageRepository {
//database im bu list
    private List<String> list=asList("hello","mockito","cok guzel");



    public void addMessage(String message){
        list.add(message);
        //burasi liste ekleme yapilan yer yani database ye create ettigim yer
    }
    public List<String> getMessage() throws SQLException {
        return list;
    }
}
