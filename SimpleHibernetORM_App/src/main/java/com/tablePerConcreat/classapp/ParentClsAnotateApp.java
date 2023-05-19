package com.tablePerConcreat.classapp;

/*
 * Table per concert class -
 * Parent class annotation :
 * - @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
 * 
 * Child class annotation :
 * - @AttributeOverrides   ({
 * 
 *   @AttributeOverride(name="id",column=@Column(name="id")),
 *   @AttributeOverride(name="name",column=@Column(name="name")),
 *   
 *   })
 * <union-subclass> for config with .hbm.xml file
 * 
 */

public class ParentClsAnotateApp {

}
