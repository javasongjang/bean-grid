package com.vaadin.peter.addon.beangrid.test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.vaadin.peter.addon.beangrid.EditableColumn;
import com.vaadin.peter.addon.beangrid.GridColumn;

public class TestBean {

	private String id;

	private String firstName;
	private String lastName;
	private LocalDate birthDate;

	@GridColumn(translationKey = "big.decimal", defaultOrder = 3)
	@EditableColumn
	private BigDecimal bdValue;

	@GridColumn(translationKey = "int.value", defaultOrder = 4)
	@EditableColumn
	private int intValue;

	@GridColumn(translationKey = "integer.object.value", defaultOrder = 5)
	@EditableColumn
	private Integer integerObjectValue;

	@GridColumn(translationKey = "double.value", defaultOrder = 6)
	@EditableColumn
	private double doubleValue;

	@GridColumn(translationKey = "double.object.value", defaultOrder = 7)
	@EditableColumn
	private Double doubleObjectValue;

	@GridColumn(translationKey = "char.value", defaultOrder = 8)
	@EditableColumn
	private char characterValue;

	@GridColumn(translationKey = "boolean.value", defaultOrder = 9)
	@EditableColumn
	private boolean booleanValue;

	@GridColumn(translationKey = "boolean.object.value", defaultOrder = 10)
	@EditableColumn
	private Boolean booleanObjectValue;

	@GridColumn(translationKey = "date.object.value", defaultOrder = 10)
	@EditableColumn
	private Date dateObject;

	public TestBean() {
		id = UUID.randomUUID().toString();
	}

	public TestBean(String firstName, String lastName, LocalDate birthDate) {
		this();

		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	@GridColumn(translationKey = "first.name", defaultOrder = 1)
	public String getFirstName() {
		return firstName;
	}

	@GridColumn(translationKey = "last.name", defaultOrder = 2)
	@EditableColumn
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@GridColumn(translationKey = "birth.date", defaultOrder = 3)
	@EditableColumn
	@NotNull
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}

		if (other instanceof TestBean) {
			return this.id.equals(((TestBean) other).id);
		}

		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	public BigDecimal getBdValue() {
		return bdValue;
	}

	public void setBdValue(BigDecimal bdValue) {
		this.bdValue = bdValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public Integer getIntegerObjectValue() {
		return integerObjectValue;
	}

	public void setIntegerObjectValue(Integer integerObjectValue) {
		this.integerObjectValue = integerObjectValue;
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}

	@NotNull
	@EditableColumn
	public Double getDoubleObjectValue() {
		return doubleObjectValue;
	}

	public void setDoubleObjectValue(Double doubleObjectValue) {
		this.doubleObjectValue = doubleObjectValue;
	}

	public char getCharacterValue() {
		return characterValue;
	}

	public void setCharacterValue(char characterValue) {
		this.characterValue = characterValue;
	}

	public Boolean getBooleanObjectValue() {
		return booleanObjectValue;
	}

	public void setBooleanObjectValue(Boolean booleanObjectValue) {
		this.booleanObjectValue = booleanObjectValue;
	}

	public Date getDateObject() {
		return dateObject;
	}

	public void setDateObject(Date dateObject) {
		this.dateObject = dateObject;
	}

	public boolean isBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		this.booleanValue = booleanValue;
	}
}