package minecraft;

import Nursultan.class10530;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class class08214 extends class08224<Runnable> {
   public class08214(Executor var1, String var2) {
      super(new class10530(new ConcurrentLinkedQueue<>()), var1, var2);
   }

   @Override
   public Runnable y(Runnable var1) {
      return var1;
   }
}
