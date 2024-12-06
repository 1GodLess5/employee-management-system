package cz.godless.ems.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
