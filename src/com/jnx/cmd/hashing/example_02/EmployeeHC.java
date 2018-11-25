package com.jnx.cmd.hashing.example_02;

public class EmployeeHC {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) 
            return false;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        EmployeeHC other = (EmployeeHC) obj;
        if(name == null) {
            if(other.name != null)
                return false;
        }else if(!name.equals(other.name))
            return false;
        return true;
    }

}