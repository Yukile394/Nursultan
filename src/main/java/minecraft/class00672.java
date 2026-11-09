package minecraft;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class00672 extends class07049 {
   private static final int y = 2;
   private static final double L = 3.0;
   private static final double u = 15.0;
   private int i;
   public long N;
   private int R;
   private boolean M;
   @Nullable
   private class04770 B;
   private final Set<class07049> Z = Sets.newHashSet();
   private int z;

   public Stream<class07049> L() {
      return this.Z.stream().filter(class07049::method_5805);
   }

   @Override
   protected void method_5693(class04293 var1) {
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.i == 2) {
         if (this.method_73183().method_8608()) {
            this.method_73183()
               .method_8486(
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class04909.TM,
                  class04911.field_15252,
                  10000.0F,
                  0.8F + this.field_5974.z() * 0.2F,
                  false
               );
            this.method_73183()
               .method_8486(
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class04909.TR,
                  class04911.field_15252,
                  2.0F,
                  0.5F + this.field_5974.z() * 0.2F,
                  false
               );
         } else {
            class07086 var1 = this.method_73183().y();
            if (var1 == class07086.field_5802 || var1 == class07086.field_5807) {
               this.N(4);
            }

            this.u();
            N(this.method_73183(), this.i());
            this.method_32876(class01194.J);
         }
      }

      this.i--;
      if (this.i < 0) {
         if (this.R == 0) {
            if (this.method_73183() instanceof class04782) {
               List<class07049> list = this.method_73183()
                  .method_8333(
                     this,
                     new class00734(
                        this.method_23317() - 15.0,
                        this.method_23318() - 15.0,
                        this.method_23321() - 15.0,
                        this.method_23317() + 15.0,
                        this.method_23318() + 6.0 + 15.0,
                        this.method_23321() + 15.0
                     ),
                     var1x -> var1x.method_5805() && !this.Z.contains(var1x)
                  );

               for (class04770 class04770 : ((class04782)this.method_73183()).method_18766(var1x -> var1x.method_5739(this) < 256.0F)) {
                  class06912.D.N(class04770, this, list);
               }
            }

            this.method_31472();
         } else if (this.i < -this.field_5974.y(10)) {
            this.R--;
            this.i = 1;
            this.N = this.field_5974.B();
            this.N(0);
         }
      }

      if (this.i >= 0) {
         if (!(this.method_73183() instanceof class04782)) {
            this.method_73183().method_8509(2);
         } else if (!this.M) {
            List<class07049> list1 = this.method_73183()
               .method_8333(
                  this,
                  new class00734(
                     this.method_23317() - 3.0,
                     this.method_23318() - 3.0,
                     this.method_23321() - 3.0,
                     this.method_23317() + 3.0,
                     this.method_23318() + 6.0 + 3.0,
                     this.method_23321() + 3.0
                  ),
                  class07049::method_5805
               );

            for (class07049 class07049 : list1) {
               class07049.method_5800((class04782)this.method_73183(), this);
            }

            this.Z.addAll(list1);
            if (this.B != null) {
               class06912.I.N(this.B, list1);
            }
         }
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15252;
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   protected void method_5652(class08329 var1) {
   }

   @Override
   public boolean method_5640(double var1) {
      double d0 = 64.0 * method_5824();
      return var1 < d0 * d0;
   }

   @Override
   protected void method_5749(class08299 var1) {
   }

   public class00672(class07078<? extends class00672> var1, class07299 var2) {
      super(var1, var2);
      this.i = 2;
      this.N = this.field_5974.B();
      this.R = this.field_5974.y(3) + 1;
   }

   private class07209 i() {
      class06889 class06889 = this.method_73189();
      return class07209.method_49637(class06889.M, class06889.B - 1.0E-6, class06889.Z);
   }

   private void u() {
      class07209 class07209 = this.i();
      class00500 class00500 = this.method_73183().method_8320(class07209);
      class00891 class00891 = class00500.i();
      if (class00891 instanceof class01111) {
         ((class01111)class00891).L(class00500, this.method_73183(), class07209);
      }
   }

   public int y() {
      return this.z;
   }

   private static Optional<class07209> y(class07299 var0, class07209 var1) {
      for (class07209 class07209 : class07209.method_34848(var0.field_9229, 10, var1, 1)) {
         class00500 class00500 = var0.method_8320(class07209);
         if (class00500.i() instanceof class02674) {
            class02674.f_(class00500).ifPresent(var2 -> var0.method_8501(class07209, var2));
            var0.N(3002, class07209, -1);
            return Optional.of(class07209);
         }
      }

      return Optional.empty();
   }

   @Nullable
   public class04770 N() {
      return this.B;
   }

   public void N(boolean var1) {
      this.M = var1;
   }

   private static void N(class07299 var0, class07209 var1, class07218 var2, int var3) {
      var2.N(var1);

      for (int ix = 0; ix < var3; ix++) {
         Optional<class07209> optional = y(var0, var2);
         if (optional.isEmpty()) {
            break;
         }

         var2.N(optional.get());
      }
   }

   private static void N(class07299 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      boolean flag = class02859.y.get().get(class00500.i()) != null;
      boolean flag1 = class00500.i() instanceof class02674;
      if (flag1 || flag) {
         if (flag1) {
            var0.method_8501(var1, class02674.g_(var0.method_8320(var1)));
         }

         class07218 class07218 = var1.method_25503();
         int ix = var0.field_9229.y(3) + 3;

         for (int j = 0; j < ix; j++) {
            int k = var0.field_9229.y(8) + 1;
            N(var0, var1, class07218, k);
         }
      }
   }

   private void N(int var1) {
      if (!this.M && this.method_73183() instanceof class04782 class04782) {
         class07209 class07209 = this.method_24515();
         if (class04782.method_76058(class07209)) {
            class00500 class00500 = class05989.y(class04782, class07209);
            if (class04782.method_8320(class07209).P() && class00500.N(class04782, class07209)) {
               class04782.method_8501(class07209, class00500);
               this.z++;
            }

            for (int ix = 0; ix < var1; ix++) {
               class07209 class07209x = class07209.method_10069(this.field_5974.y(3) - 1, this.field_5974.y(3) - 1, this.field_5974.y(3) - 1);
               class00500 = class05989.y(class04782, class07209x);
               if (class04782.method_8320(class07209x).P() && class00500.N(class04782, class07209x)) {
                  class04782.method_8501(class07209x, class00500);
                  this.z++;
               }
            }
         }
      }
   }

   public void N(@Nullable class04770 var1) {
      this.B = var1;
   }
}
