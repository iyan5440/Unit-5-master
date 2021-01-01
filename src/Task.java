
public class Task {
    
    String name, des;
    public Task(String n, String d){//constructor for class
        name =n;
        des = d;
    }
    
    public String getDescription(){ //returns description of Task
        return des;
    }
    
    public String getName(){ //return name of Task
        return name;
    }
    
    public void setDescription(String description){
        des = description; //sets the description of Task
    }
    
    public void setName(String nm){//sets the name of Task
        name = nm;
    }
    
    public String toString(){ //returns a string containing the name and description of the Task
        return "Name: " + name + "\nDescription: " + des + "\n============\n";
    }
    
    public boolean validate(){//returns whether or not the description or the name has nothing or is null
        if(name==null || des ==null || name.equals("") || des.equals("")) return false;
        else
            return true;
    }
    
    
    
}
