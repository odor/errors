package ua.errors;

import javax.sql.rowset.CachedRowSet;
import java.util.Scanner;

/**
 * Created by melnir on 6/29/15.
 */
public class ComplicatedTry {
    public static void main(String[] args) {



        class Catch2 {
             void c() {
                Scanner sc = new Scanner(System.in);
                int[] m = {-1, 0, 1};
                try {
                    int a = sc.nextInt();
                    m[a] = 4 / a;
                    System.out.println(m[a]);
                } catch (ArithmeticException error) {
                    System.out.println("в узких рамках вашей компетенции эта операция не имеет смысла");
                    //c();
                } catch (ArrayIndexOutOfBoundsException error) {
                    System.out.println("слишком толсто для границ данного массива");
                    c();
                } catch (Exception error) {
                    System.out.println("Странные исключения делают непонятные вещи. Подробнее см. io.Exception");

                    /**
                     * Exception перехватывает все ошибки, потому должен стоять последним.*/
                }

                /**
                 * Необязательным добавлением к блокам try…catch может быть блок finally.
                 * Помещенные в него команды будут выполняться в любом случае, вне зависимости
                 * от того, произошло ли исключение или нет. При том, что при возникновении
                 * необработанного исключения оставшаяся после генерации этого исключения
                 * часть программы — не выполняется. Например, если исключение возникло в
                 * процессе каких-то длительных вычислений, в блоке finally можно показать
                 * или сохранить промежуточные результаты.*/
                 finally {
                    System.out.println("что бы ни случилось, это сообщение будет здесь");
                }

             }
        }

        Catch2 c = new Catch2();
        c.c();
    }
}
