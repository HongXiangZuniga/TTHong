package Adapter;

public class ToolIDSupport {

    static class AuxContador{
        private int contador = 0;

            public String id(){
                String s= String.valueOf(contador);
                this.contador= this.contador+1;
                return "c"+s;
            }
    }
}
