package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class class05882 {
   final class05513 N;
   private final List<class05893> y = Lists.newArrayList();
   private int L;

   public void L(int var1) {
      try {
         this.u(var1);
      } catch (class05511 class05511) {
         this.N.N(class05511);
      }
   }

   private void L(Runnable var1) {
      try {
         var1.run();
      } catch (class05511 class05511) {
         this.N.N(class05511);
      }
   }

   class05882(class05513 var1) {
      super();
      this.N = var1;
      this.L = var1.s();
   }

   private void u(int var1) {
      Iterator<class05893> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         class05893 class05893 = iterator.next();
         class05893.y.run();
         iterator.remove();
         int i = var1 - this.L;
         int j = this.L;
         this.L = var1;
         if (class05893.N != null && class05893.N != i) {
            this.N.N(new class05511(class00392.N("test.error.sequence.invalid_tick", j + class05893.N), var1));
            break;
         }
      }
   }

   public class05882 y(Runnable var1) {
      this.y.add(class05893.N(() -> this.L(var1)));
      return this;
   }

   public class05882 y(int var1, Runnable var2) {
      this.y.add(class05893.N(() -> {
         if (this.N.s() < this.L + var1) {
            this.L(var2);
            throw new class05511(class00392.L("test.error.sequence.not_completed"), this.N.s());
         }
      }));
      return this;
   }

   public void y(int var1) {
      try {
         this.u(var1);
      } catch (class05511 class05511) {
      }
   }

   public class05906 y() {
      class05906 class05906 = new class05906(this);
      this.y.add(class05893.N(() -> class05906.N(this.N.s())));
      return class05906;
   }

   public class05882 N(int var1, Runnable var2) {
      this.y.add(class05893.N(() -> {
         if (this.N.s() < this.L + var1) {
            throw new class05511(class00392.L("test.error.sequence.not_completed"), this.N.s());
         } else {
            this.L(var2);
         }
      }));
      return this;
   }

   public class05882 N(Runnable var1) {
      this.y.add(class05893.N(var1));
      return this;
   }

   public void N() {
      this.y.add(class05893.N(this.N::W));
   }

   public void N(Supplier<class08405> var1) {
      this.y.add(class05893.N(() -> this.N.N((class08405)var1.get())));
   }

   public class05882 N(int var1) {
      return this.N(var1, () -> {});
   }

   public class05882 N(long var1, Runnable var3) {
      this.y.add(class05893.N(var1, var3));
      return this;
   }
}
