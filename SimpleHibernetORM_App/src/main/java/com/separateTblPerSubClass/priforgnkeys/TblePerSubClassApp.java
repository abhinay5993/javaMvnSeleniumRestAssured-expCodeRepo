package com.separateTblPerSubClass.priforgnkeys;

/* 
 * Separate table per subclass 
 * <joined-subclass name="chiledClass" table="tbl-name">
 * <key column="id"></id>
 * </joined-subclass>
 * 
 * In parent class
 * @Entity
 * @Table(name="emp1")
 * @Inheritance(strategy=InheritanceType.JOIN)
 * 
 * In Clild class 
 * @PrimaryKeyJoinColumn(name="id")
 * 
 */

public class TblePerSubClassApp {

}
