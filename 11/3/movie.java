import java.io.*;
public class movie implements Serializable
{
    public String name,date,type,country;
    public int cost;
    public movie(String _name,String _date,String _type,String _country,int _cost)
    {
        name=_name;
        date=_date;
        type=_type;
        country=_country;
        cost=_cost;
    }
    public movie(){}

}