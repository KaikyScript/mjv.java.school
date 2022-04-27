package mjv.java.school;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Protocolos {

    public String gerarProtocolo() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddss");
        return dtf.format(LocalDateTime.now());
    }

}