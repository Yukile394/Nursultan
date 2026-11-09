package minecraft;

public final class class05028 extends class05015<class05013, class05023> {
   private final class07218 M = new class07218();

   public class05028(class00538 var1) {
      this(var1, new class05023(var1));
   }

   public class05028(class00538 var1, class05023 var2) {
      super(var1, var2);
   }

   @Override
   public void y(class07321 var1) {
      this.N(var1, true);
      class03482 class03482 = this.i.y(var1.B, var1.Z);
      if (class03482 != null) {
         class03482.N((var1x, var2x) -> {
            int i = var2x.m();
            this.L(var1x.method_10063(), class05027.N(i, N(var2x)));
         });
      }
   }

   private int N(long var1, class00500 var3) {
      int i = var3.m();
      return i > 0 && this.R.z(class01296.i(var1)) ? i : 0;
   }

   @Override
   protected void N(long var1, long var3) {
      int i = class05027.N(var3);
      int j = u.length;

      for (int k = 0; k < j; k++) {
         class07211 class07211 = u[k];
         if (class05027.N(var3, class07211)) {
            long l = class07209.method_10060(var1, class07211);
            if (this.R.y(class01296.i(l))) {
               int i1 = this.R.i(l);
               if (i1 != 0) {
                  if (i1 <= i - 1) {
                     class00500 class00500 = this.y(this.M.N(l));
                     int j1 = this.N(l, class00500);
                     this.R.N(l, 0);
                     if (j1 < i1) {
                        this.y(l, class05027.N(i1, class07211.b()));
                     }

                     if (j1 > 0) {
                        this.L(l, class05027.N(j1, N(class00500)));
                     }
                  } else {
                     this.L(l, class05027.y(i1, false, class07211.b()));
                  }
               }
            }
         }
      }
   }

   @Override
   protected void N(long var1, long var3, int var5) {
      class00500 class00500x = null;
      int i = u.length;

      for (int j = 0; j < i; j++) {
         class07211 class07211 = u[j];
         if (class05027.N(var3, class07211)) {
            long k = class07209.method_10060(var1, class07211);
            if (this.R.y(class01296.i(k))) {
               int l = this.R.i(k);
               if (var5 - 1 > l) {
                  this.M.N(k);
                  class00500 class00500x = this.y(this.M);
                  int i1 = var5 - this.y(class00500x);
                  if (i1 > l) {
                     if (class00500x == null) {
                        class00500x = class05027.y(var3) ? class00869.N.W() : this.y(this.M.N(var1));
                     }

                     if (!this.N(class00500x, class00500x, class07211)) {
                        this.R.N(k, i1);
                        if (i1 > 1) {
                           this.L(k, class05027.N(i1, N(class00500x), class07211.b()));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected void N(long var1) {
      long i = class01296.i(var1);
      if (this.R.y(i)) {
         class00500 class00500 = this.y(this.M.N(var1));
         int j = this.N(var1, class00500);
         int k = this.R.i(var1);
         if (j < k) {
            this.R.N(var1, 0);
            this.y(var1, class05027.N(k));
         } else {
            this.y(var1, L);
         }

         if (j > 0) {
            this.L(var1, class05027.N(j, N(class00500)));
         }
      }
   }
}
