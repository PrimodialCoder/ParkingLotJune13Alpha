package models;

public class Operator extends BaseModel
{
    public Operator(String name) {
        super(-1);
        this.name = name;
    }

    private String name;
}
