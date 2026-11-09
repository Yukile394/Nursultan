package minecraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class03669 {
   private final int N;
   private final class03271 y;
   private final List<class03241> L = new ArrayList<>();

   class03669(class03271 var1, int var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public class03669 N(class03241... var1) {
      Collections.addAll(this.L, var1);
      return this;
   }

   public class03281 N() {
      return new class03281(this.N, this.y, this.L);
   }
}
