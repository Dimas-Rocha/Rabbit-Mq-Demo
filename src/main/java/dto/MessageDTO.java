package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
    private String id;
    private String content;
    private LocalTime timestamp;
    private String sender;

}
