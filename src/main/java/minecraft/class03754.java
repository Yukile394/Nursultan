package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class03754 {
   private final class05096 N;
   private final class00392 y;
   private class00392 L = class05220.N;
   private int u = 250;
   @Nullable
   private class01894 i;
   private final List<class03708> R = new ArrayList<>();
   @Nullable
   private Runnable M = null;

   public class03754(class05096 var1, class00392 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class03754 N(class00392 var1, Consumer<class03723> var2) {
      this.R.add(new class03708(var1, var2));
      return this;
   }

   public class03754 N(Runnable var1) {
      this.M = var1;
      return this;
   }

   public class03723 N() {
      if (this.R.isEmpty()) {
         throw new IllegalStateException("Popup must have at least one button");
      } else {
         return new class03723(this.N, this.u, this.i, this.y, this.L, List.copyOf(this.R), this.M);
      }
   }

   public class03754 N(class00392 var1) {
      this.L = var1;
      return this;
   }

   public class03754 N(class01894 var1) {
      this.i = var1;
      return this;
   }

   public class03754 N(int var1) {
      this.u = var1;
      return this;
   }
}
