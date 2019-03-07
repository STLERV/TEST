import com.company.QueueImp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Main {


    @Before

            public void Empezar() {
        QueueImp<Integer> cola = null;


    }
    @After
    public void Acabar() {

        QueueImp<Integer> cola = null;


    }

    @org.junit.Test
    public void Ponercosas(){



        QueueImp<Integer> cola = new QueueImp(10);
        cola.pop();
        cola.push(1);
        cola.push(2);
        cola.push(3);
        cola.push(4);

       Assert.assertEquals(4, cola.size());

    }


    @org.junit.Test
    public void  Quitarcosas(){


        QueueImp<Integer> cola = new QueueImp(10);

        cola.push(1);
        cola.push(2);
        cola.pop();
        cola.pop();

        Assert.assertEquals(0, cola.size());

    }



}
