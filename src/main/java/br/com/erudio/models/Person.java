package br.com.erudio.models;

import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person extends ResourceSupport implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long idPerson;
    private String firstName;
    private String lastName;
    private String address;
    
    public Person() {}

	public Person(@JsonProperty("id") Long idPerson, @JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName, @JsonProperty("address") String address) {
		this.idPerson = idPerson;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public Long getIdPerson() {
        return idPerson;
    }
    
    public void setIdPerson(Long id) {
        this.idPerson = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
