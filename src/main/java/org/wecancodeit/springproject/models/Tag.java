package org.wecancodeit.springproject.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String tagLabel;

	@OneToMany(mappedBy = "tag")
	private Collection<Product> products;

	public Tag() {
	}

	public Tag(String tagLabel) {
		this.tagLabel = tagLabel;
	}

	public Long getId() {
		return id;
	}

	public String getTagLabel() {
		return tagLabel;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", tagLabel=" + tagLabel + ", products=" + products + "]";
	}

}
