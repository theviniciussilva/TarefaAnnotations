
import java.lang.reflect.Field;

public class App {

    public static void main(String[] args){

        Class classe = Tabela.class;

        Field[] fields = classe.getDeclaredFields();

        for(Field field: fields){
            if(field.isAnnotationPresent(AnnotationTabela.class)){
                AnnotationTabela anotacaoTabela = field.getAnnotation(AnnotationTabela.class);
                System.out.println(anotacaoTabela);
            }
        }

    }
}
