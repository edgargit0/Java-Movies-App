package domain;

public class Movie {
    private String name;
    
    public Movie(){
    }
    
    public Movie(String name){
        this.name=name;   
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }

   //"Since we work with lists of objects, it is recommended to implement the `equals` and `hashCode` methods as best practices.
   //Use the IDE code generator to generate the `equals` and `hashCode` methods."
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String toString(){
        return "Movie [" +
            "name: " + name +
            "]";
    }

}
