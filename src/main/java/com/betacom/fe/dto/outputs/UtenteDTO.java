package com.betacom.fe.dto.outputs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UtenteDTO {
	
	private String userName;
	private String pwd;
	private String email;
	private String role;

}
