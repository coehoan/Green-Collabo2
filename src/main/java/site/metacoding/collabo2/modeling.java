package site.metacoding.collabo2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class modeling {
    private Response response;

    @AllArgsConstructor
    @Data
    class Response {
        private String head;
    }
}
