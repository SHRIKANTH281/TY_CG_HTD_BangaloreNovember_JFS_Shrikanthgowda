package com.capgemini.contactfile.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContactBean implements Serializable {
 private String name;
 private long number;
 private String group;
@Override
public String toString() {
	return "ContactBean [name=" + name + ", number=" + number + ", group=" + group + "]";
}

 
}
