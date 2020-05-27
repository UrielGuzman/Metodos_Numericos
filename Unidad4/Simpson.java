package Unidad4;

/**
 *
 * @author Izrux
 */
public class Simpson{ 
  
    // Funcion para calcular f(x) 
    static float func(float x) 
    {   
            
        return (float)Math.log(x); 
    } 
  
    static float simpsons_(float li, float ls, 
                                       int n) 
    { 
        // Calcular h
        float h = (ls - li) / n; 
  

        float[] x = new float[10]; 
      
        double [] fx = {0.2,1.2969,1.7433,3.186,3.1819,0.232};
        // Calcular valores de  x y f(x) 
        for (int i = 0; i <= n; i++) { 
            x[i] = li + i * h; 
            //No tenemos funcion de fx pues es estatica
      //      fx[i] = func(x[i]); 
        } 
  
        // Calculando los resultados
        float res = 0; 
        for (int i = 0; i <= n; i++) { 
            if (i == 0 || i == n) 
                res += fx[i]; 
            else if (i % 2 != 0) 
                res += 4 * fx[i]; 
            else
                res += 2 * fx[i]; 
        } 
          
        res = res * (h / 3); 
        return res; 
    } 
  
    public static void main(String s[]) 
    {     
        float limite_inferior = 0; 
           
        float limite_superior = (float)0.8;  
          
        // intervalos 
        int n = 5;  
          
        System.out.println(simpsons_(limite_inferior,  
                                limite_superior, n)); 
    } 
}  
  
