package study.springjackson.dummy.object.get;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class JsonFormatDummy {

    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDateTime formattedDate = LocalDateTime.now();
    public LocalDateTime rawDate = LocalDateTime.now();

}
