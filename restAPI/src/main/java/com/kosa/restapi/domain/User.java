package com.kosa.restapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"password", "ssn"})
@Schema(description = "사용자 상세 정보를 위한 도메인 객체")
public class User {
    @Schema(title = "사용자 ID", description = "사용자 ID는 자동 생성 됩니다.")
    @Id
    @GeneratedValue
    private Integer id;

    @Schema(title = "사용자 이름", description = "사용자 이름을 입력하세요:")
    @Size(min = 2, max = 20, message = "Name은 2글자 이상 입력해 주세요.")
    private String name;
    @Past(message = "등록일은 미래 날짜를 입력하실 수 있습니다.")
    private Date joinDate;

    //@JsonIgnore
    private String password;
    //@JsonIgnore
    private String ssn;
}