public class Author {
    private  String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override public String toString(){
        return getFirstName()+" "+getLastName();
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return (getFirstName()+getLastName()).equals(author.getFirstName()+author.getLastName());
    }
    @Override public int hashCode() {
        return java.util.Objects.hash(firstName,lastName);
    }
}
