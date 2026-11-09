package minecraft;

import java.util.List;

public abstract class class02763 extends class06923 {
   private final int N;
   private final int y;
   protected final class03507 I;
   protected final class06919 J = new class06919();

   public class02763(class05851<?> var1, int var2, int var3, int var4) {
      super(var1, var2);
      this.N = var3;
      this.y = var4;
      this.I = new class07495(this, var3, var4);
   }

   public int b() {
      return this.N;
   }

   protected abstract class08036 s();

   public abstract List<class06937> m();

   public int j() {
      return this.y;
   }

   @Override
   protected void u(int var1, int var2) {
      for (int i = 0; i < this.N; i++) {
         for (int j = 0; j < this.y; j++) {
            this.N(new class06937(this.I, j + i * this.N, var1 + j * 18, var2 + i * 18));
         }
      }
   }

   @Override
   protected void E() {
   }

   protected class06937 N(class08036 var1, int var2, int var3) {
      return this.N(new class06930(var1, this.I, this.J, 0, var2, var3));
   }

   @Override
   public class06910 N(boolean var1, boolean var2, class03729<?> var3, class04782 var4, class08044 var5) {
      class03729 class03729 = var3;
      this.E();

      class06910 class06910;
      try {
         List<class06937> list = this.m();
         class06910 = class04393.N(new class02743(this), this.N, this.y, list, list, var5, class03729, var1, var2);
      } finally {
         this.N(var4, var3);
      }

      return class06910;
   }

   protected void N(class04782 var1, class03729<class05857> var2) {
   }

   @Override
   public void N(class02741 var1) {
      this.I.N(var1);
   }

   public abstract class06937 W();
}
