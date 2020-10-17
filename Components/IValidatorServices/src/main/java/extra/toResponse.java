package extra;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.Map;

public class toResponse {

    public void transform(ArrayList<ArrayList<String>> Errors, Map<String, ArrayList<String>> Response,String key){
        try{
            ArrayList<String> aux = new ArrayList<>();
            if(Errors.size()==0){
                aux.add(key);
                Response.put("validator",aux);
            }else{
                for(int i =0;i<Errors.size();i++){
                    aux.add(Errors.get(i).get(0)+"-"+Errors.get(i).get(1));
                }

            }
            Response.put("validator",aux);
        }catch(Exception e){
            ArrayList<String> aux = new ArrayList<>();
            aux.add("UndefinedError");
            Response.put("validator",aux);
        }

    }
}
