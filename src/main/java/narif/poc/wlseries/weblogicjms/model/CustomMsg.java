package narif.poc.wlseries.weblogicjms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomMsg {

    private Long id;

    @NotNull
    @NotEmpty
    private String message;

    @Override
    public String toString() {
        return "CustomMsg{id=" + id +", message='" + message + "'}";
    }
}
