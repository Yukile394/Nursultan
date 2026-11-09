package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public interface class02607 {
   String d_ = "leash";
   double e_ = 12.0;
   double f_ = 6.0;
   double a_ = 16.0;
   class06889 b_ = new class06889(0.8, 0.2, 0.8);
   float NR = 0.7F;
   double NM = 10.0;
   double NB = 0.11;
   List<class06889> NZ = ImmutableList.of(new class06889(0.0, 0.5, 0.5));
   List<class06889> Nz = ImmutableList.of(new class06889(0.0, 0.5, 0.0));
   List<class06889> NU = ImmutableList.of(
      new class06889(-0.5, 0.5, 0.5), new class06889(-0.5, 0.5, -0.5), new class06889(0.5, 0.5, -0.5), new class06889(0.5, 0.5, 0.5)
   );

   private static class06889 L(class07049 var0) {
      return var0 instanceof class07079 && ((class07079)var0).Nt() ? class06889.L : var0.method_60478();
   }

   default class06889 M(float var1) {
      return this.ac_();
   }

   default double M(class07049 var1) {
      return var1.method_5829().R().R(((class07049)this).method_5829().R());
   }

   static <E extends class07049 & class02607> float B(E var0) {
      if (var0.method_24828()) {
         return var0.method_73183().method_8320(var0.method_23314()).i().Z() * 0.91F;
      } else {
         return var0.method_52535() ? 0.8F : 0.91F;
      }
   }

   static List<class02607> Z(class07049 var0) {
      return N(var0, var1 -> var1.yW() == var0);
   }

   default boolean g() {
      return true;
   }

   @Nullable
   private static <E extends class07049 & class02607> class07049 u(E var0) {
      class02592 class02592 = ((class02607)var0).S_();
      if (class02592 == null) {
         return null;
      } else {
         if (class02592.y != 0 && var0.method_73183().method_8608()) {
            class07049 class07049 = var0.method_73183().method_8469(class02592.y);
            if (class07049 instanceof class07049) {
               class02592.N(class07049);
            }
         }

         return class02592.L;
      }
   }

   private static <E extends class07049 & class02607> void y(E var0, class02592 var1) {
      if (var1.u != null && var0.method_73183() instanceof class04782 class04782) {
         Optional<UUID> optional1 = var1.u.left();
         Optional<class07209> optional = var1.u.right();
         if (optional1.isPresent()) {
            class07049 class07049 = class04782.method_66347(optional1.get());
            if (class07049 != null) {
               N((E)var0, class07049, true);
               return;
            }
         } else if (optional.isPresent()) {
            N((E)var0, class00700.N(class04782, optional.get()), true);
            return;
         }

         if (var0.field_6012 > 100) {
            var0.method_5706(class04782, class06570.Gr);
            ((class02607)var0).N(null);
         }
      }
   }

   default boolean N(class07049 var1, class02592 var2) {
      boolean flag = var1.method_70986() && this.aa_();
      List<class02585> list = N((class07049 & class02607)this, var1, flag ? NU : NZ, flag ? NU : Nz);
      if (list.isEmpty()) {
         return false;
      } else {
         class02585 class02585 = class02585.N(list).N(flag ? 0.25 : 1.0);
         var2.i = var2.i + 10.0 * class02585.y();
         class06889 class06889 = L(var1).u(((class07049)this).method_60478());
         ((class07049)this).method_45319(class02585.N().B(b_).i(class06889.L(0.11)));
         return true;
      }
   }

   private static Optional<class02585> N(class06889 var0, class06889 var1, double var2, class06889 var4, class06889 var5) {
      double d0 = var1.R(var0);
      if (d0 < var2) {
         return Optional.empty();
      } else {
         class06889 class06889 = var0.u(var1).u().L(d0 - var2);
         double d1 = class02585.N(var5, class06889);
         if (var4.y(class06889) >= 0.0) {
            class06889 = class06889.L(0.3F);
         }

         return Optional.of(new class02585(class06889, d1));
      }
   }

   private static <E extends class07049 & class02607> List<class02585> N(E var0, class07049 var1, List<class06889> var2, List<class06889> var3) {
      double d0 = ((class02607)var0).q_();
      class06889 class06889xxxxx = L(var0);
      float f = var0.method_36454() * (float) (Math.PI / 180.0);
      class06889 class06889x = new class06889(var0.method_17681(), var0.method_17682(), var0.method_17681());
      float f1 = var1.method_36454() * (float) (Math.PI / 180.0);
      class06889 class06889xx = new class06889(var1.method_17681(), var1.method_17682(), var1.method_17681());
      ArrayList arraylist = new ArrayList();

      for (int i = 0; i < var2.size(); i++) {
         class06889 class06889xxx = ((class06889)var2.get(i)).B(class06889x).y(-f);
         class06889 class06889xxxx = var0.method_73189().i(class06889xxx);
         class06889 class06889xxxxx = ((class06889)var3.get(i)).B(class06889xx).y(-f1);
         N(var1.method_73189().i(class06889xxxxx), class06889xxxx, d0, class06889xxxxx, class06889xxx).ifPresent(arraylist::add);
      }

      return arraylist;
   }

   static List<class02607> N(class07049 var0, Predicate<class02607> var1) {
      return N(var0.method_73183(), var0.method_5829().R(), var1);
   }

   private static <E extends class07049 & class02607> void N(E var0, class07049 var1, boolean var2) {
      class02592 class02592 = ((class02607)var0).S_();
      if (class02592 == null) {
         class02592 = new class02592(var1);
         ((class02607)var0).N(class02592);
      } else {
         class07049 class07049 = class02592.L;
         class02592.N(var1);
         if (class07049 != null && class07049 != var1) {
            class07049.method_70982((class02607)var0);
         }
      }

      if (var2 && var0.method_73183() instanceof class04782 class04782) {
         class04782.method_14178().y(var0, new class06635(var0, var1));
      }

      if (var0.method_5765()) {
         var0.method_5848();
      }
   }

   default void N(class07049 var1, boolean var2) {
      if (this != var1) {
         N((class07049 & class02607)this, var1, var2);
      }
   }

   void N(@Nullable class02592 var1);

   static class06889[] N(class07049 var0, double var1, double var3, double var5, double var7) {
      float f = var0.method_17681();
      double d0 = var1 * f;
      double d1 = var3 * f;
      double d2 = var5 * f;
      double d3 = var7 * var0.method_17682();
      return new class06889[]{
         new class06889(-d2, d3, d1 + d0), new class06889(-d2, d3, -d1 + d0), new class06889(d2, d3, -d1 + d0), new class06889(d2, d3, d1 + d0)
      };
   }

   default void N(class08299 var1) {
      class02592 class02592 = var1.<class02592>N("leash", class02592.N).orElse(null);
      if (this.S_() != null && class02592 == null) {
         this.yE();
      }

      this.N(class02592);
   }

   default void N(class08329 var1, @Nullable class02592 var2) {
      var1.y("leash", class02592.N, var2);
   }

   private static <E extends class07049 & class02607> void N(E var0, boolean var1, boolean var2) {
      class02592 class02592 = ((class02607)var0).S_();
      if (class02592 != null && class02592.L != null) {
         ((class02607)var0).N(null);
         ((class02607)var0).Nv();
         if (var0.method_73183() instanceof class04782 class04782) {
            if (var2) {
               var0.method_5706(class04782, class06570.Gr);
            }

            if (var1) {
               class04782.method_14178().y(var0, new class06635(var0, null));
            }

            class02592.L.method_70982((class02607)var0);
         }
      }
   }

   static <E extends class07049 & class02607> void N(class04782 var0, E var1) {
      class02592 class02592 = ((class02607)var1).S_();
      if (class02592 != null && class02592.u != null) {
         y((E)var1, class02592);
      }

      if (class02592 != null && class02592.L != null) {
         if (!var1.method_73187() || !class02592.L.method_73187()) {
            if (var0.method_64395().N(class07305.U)) {
               ((class02607)var1).yU();
            } else {
               ((class02607)var1).yE();
            }
         }

         class07049 class07049 = ((class02607)var1).yW();
         if (class07049 != null && class07049.method_73183() == var1.method_73183()) {
            double d0 = ((class02607)var1).M(class07049);
            ((class02607)var1).a_(class07049);
            if (d0 > ((class02607)var1).p_()) {
               var0.method_43128(
                  null, class07049.method_23317(), class07049.method_23318(), class07049.method_23321(), class04909.Tu, class04911.field_15254, 1.0F, 1.0F
               );
               ((class02607)var1).Nn();
            } else if (d0 > ((class02607)var1).q_() - class07049.method_17681() - var1.method_17681() && ((class02607)var1).N(class07049, class02592)) {
               ((class02607)var1).o_();
            } else {
               ((class02607)var1).b_(class07049);
            }

            var1.method_36456((float)(var1.method_36454() - class02592.i));
            class02592.i = class02592.i * B((E)var1);
         }
      }
   }

   static List<class02607> N(class07299 var0, class06889 var1, Predicate<class02607> var2) {
      double d0 = 32.0;
      class00734 class00734 = class00734.N(var1, 32.0, 32.0, 32.0);
      return var0.N(class07049.class, class00734, var1x -> var1x instanceof class02607 class02607 && var2.test(class02607))
         .stream()
         .map(class02607.class::cast)
         .toList();
   }

   default void W(int var1) {
      this.N(new class02592(var1));
      N((class07049 & class02607)this, false, false);
   }

   default boolean R(class07049 var1) {
      if (this == var1) {
         return false;
      } else {
         return this.M(var1) > this.p_() ? false : this.g();
      }
   }

   default void yE() {
      N((class07049 & class02607)this, true, false);
   }

   @Nullable
   default class07049 yW() {
      return u((class07049 & class02607)this);
   }

   default boolean g_() {
      return this.S_() != null && this.S_().L != null;
   }

   default void yU() {
      N((class07049 & class02607)this, true, true);
   }

   default void a_(class07049 var1) {
      var1.method_70980(this);
   }

   default boolean aa_() {
      return false;
   }

   default class06889 ac_() {
      class07049 class07049 = (class07049)this;
      return new class06889(0.0, class07049.method_5751(), class07049.method_17681() * 0.4F);
   }

   default class06889[] ab_() {
      return N((class07049)this, 0.0, 0.5, 0.5, 0.5);
   }

   default void b_(class07049 var1) {
   }

   default void Nv() {
   }

   @Nullable
   class02592 S_();

   default double p_() {
      return 12.0;
   }

   default boolean yz() {
      return this.S_() != null;
   }

   default void Nn() {
      this.yU();
   }

   default void o_() {
      ((class07049)this).method_70983();
   }

   default double q_() {
      return 6.0;
   }
}
