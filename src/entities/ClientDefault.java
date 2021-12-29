package entities;

import java.util.Objects;

public class ClientDefault {
	private String name;
	private String email;
	private Integer cod;
	
	public ClientDefault() {
	}
	
	public ClientDefault(String name, String email, Integer cod) {
		this.name = name;
		this.email = email;
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientDefault other = (ClientDefault) obj;
		return Objects.equals(cod, other.cod) && Objects.equals(name, other.name);
	}
	
	
}
