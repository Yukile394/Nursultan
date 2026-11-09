package Nursultan;

import java.util.Queue;
import minecraft.class05678;
import org.jspecify.annotations.Nullable;

public final class class10530 implements class05678<Runnable> {
   private final Queue<Runnable> N;

   @Override
   public int L() {
      return this.N.size();
   }

   public class10530(Queue<Runnable> var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean y() {
      return this.N.isEmpty();
   }

   @Nullable
   @Override
   public Runnable N() {
      return this.N.poll();
   }

   @Override
   public boolean N(Runnable var1) {
      return this.N.add(var1);
   }
}
