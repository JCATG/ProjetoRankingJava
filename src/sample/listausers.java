package sample;
import java.util.ArrayList;

public class listausers {

    ArrayList<user> listausuarios = new ArrayList<>();

    public void cadastrarUser(user user){
        listausuarios.add(user);
    }
    public int listadeusuarios(){
        return listausuarios.size();
    }

}
