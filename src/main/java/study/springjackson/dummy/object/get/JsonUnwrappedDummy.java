package study.springjackson.dummy.object.get;


import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class JsonUnwrappedDummy {

    public String id = "ID";
    @JsonUnwrapped
    public Music music = new Music();

    public class Music {
        public String genre = "Pop";
        public String title = "Title";
    }

}
