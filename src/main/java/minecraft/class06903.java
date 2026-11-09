package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class class06903 {
   protected final class01929 N;
   private final class02055<class06581> L;
   protected final class03719 y;
   private static final Map<class05565, class06891> u = ImmutableMap.builder()
      .put(class05565.field_28533, (class06891)(var0, var1, var2) -> var0.N(var1, class06510.method_8101(var2)))
      .put(class05565.field_28534, (class06891)(var0, var1, var2) -> var0.R(class01990.field_40634, var1, class06510.method_8101(var2)))
      .put(class05565.field_33689, (class06891)(var0, var1, var2) -> var0.i(class01990.field_40634, var1, class06510.method_8101(var2)))
      .put(class05565.field_28535, (class06891)(var0, var1, var2) -> var0.y(var1, class06510.method_8101(var2)))
      .put(class05565.field_40592, (class06891)(var0, var1, var2) -> var0.L(var1, class06510.method_8101(var2)))
      .put(class05565.field_28536, (class06891)(var0, var1, var2) -> var0.L(var1, class06510.method_8101(var2)))
      .put(class05565.field_40593, (class06891)(var0, var1, var2) -> var0.u(var1, class06510.method_8101(var2)))
      .put(class05565.field_28537, (class06891)(var0, var1, var2) -> var0.u(var1, class06510.method_8101(var2)))
      .put(class05565.field_28538, (class06891)(var0, var1, var2) -> var0.M(var1, class06510.method_8101(var2)))
      .put(class05565.field_28539, (class06891)(var0, var1, var2) -> var0.y(class01990.field_40634, var1, class06510.method_8101(var2)))
      .put(class05565.field_28540, (class06891)(var0, var1, var2) -> var0.i(var1, class06510.method_8101(var2)))
      .put(class05565.field_28541, (class06891)(var0, var1, var2) -> var0.N(class01990.field_40636, var1, class06510.method_8101(var2)))
      .put(class05565.field_28542, (class06891)(var0, var1, var2) -> var0.u(class01990.field_40634, var1, class06510.method_8101(var2)))
      .put(class05565.field_28543, (class06891)(var0, var1, var2) -> var0.R(var1, class06510.method_8101(var2)))
      .put(class05565.field_28544, (class06891)(var0, var1, var2) -> var0.L(class01990.field_40635, var1, class06510.method_8101(var2)))
      .build();

   public static String L(class07310 var0) {
      return "has_" + u(var0);
   }

   public void L(class00891 var1, class00891 var2) {
      this.N(class01990.field_40634, var1).N('M', var2).N(" M ").N(" M ").y(u(var1)).y(L(var2), this.y(var2)).N(this.y);
   }

   public final class05544 L(class07310 var1, class06510 var2) {
      int i = var1 == class00869.Mu ? 6 : 3;
      class06581 class06581 = var1 == class00869.Mu ? class06570.GK : class06570.Tx;
      return this.N(class01990.field_40635, var1, i).N('W', var2).N('#', class06581).N("W#W").N("W#W");
   }

   public void L(class01990 var1, class07310 var2, class07310 var3) {
      this.y(var1, var2, class06510.method_8101(var3)).y(L(var3), this.y(var3)).N(this.y);
   }

   public final class05544 L(class01990 var1, class07310 var2, class06510 var3) {
      return this.N(var1, var2, 6).N('#', var3).N("###").N("###");
   }

   public void L(class07310 var1, class07310 var2) {
      this.y(class01990.field_40637, var1).N(class00869.LA).N(var2).y("chest_boat").y("has_boat", this.N(class01226.yW)).N(this.y);
   }

   public void M(class01990 var1, class07310 var2, class07310 var3) {
      this.R(var1, var2, class06510.method_8101(var3)).y(L(var3), this.y(var3)).N(this.y);
   }

   public void M(class07310 var1, class07310 var2) {
      this.N(class01990.field_40635, var1, 3).N('#', var2).N("##").y("carpet").y(L(var2), this.y(var2)).N(this.y);
   }

   public final class05544 M(class07310 var1, class06510 var2) {
      return this.N(class01990.field_40635, var1, 3).y("sign").N('#', var2).N('X', class06570.Tx).N("###").N("###").N(" X ");
   }

   public static String M(class07310 var0) {
      return u(var0) + "_from_blasting";
   }

   public void P(class07310 var1, class07310 var2) {
      this.y(class01990.field_40634, var1, 8)
         .N(var2)
         .N(class00869.e, 4)
         .N(class00869.X, 4)
         .y("concrete_powder")
         .y("has_sand", this.y(class00869.e))
         .y("has_gravel", this.y(class00869.X))
         .N(this.y);
   }

   public final void T(class07310 var1, class07310 var2) {
      class06886.L(class06510.method_8101(var2), class01990.field_40634, var1, 0.1F, 200).y(L(var2), this.y(var2)).N(this.y);
   }

   protected class06903(class01929 var1, class03719 var2) {
      super();
      this.N = var1;
      this.L = var1.y(class04227.F);
      this.y = var2;
   }

   public void B(class07310 var1, class07310 var2) {
      this.N(class01990.field_40635, var1).N('#', var2).N('X', class01226.y).N("###").N("XXX").y("bed").y(L(var2), this.y(var2)).N(this.y);
   }

   public void B(class01990 var1, class07310 var2, class07310 var3) {
      this.N(var1, var2).N('#', var3).N("#").N("#").y(L(var3), this.y(var3)).N(this.y);
   }

   public void B(class07310 var1, class06510 var2) {
      this.N(class01990.field_40642, var1, 2).N('#', class06570.TN).N('C', var2).N('S', var1).N("#S#").N("#C#").N("###").y(L(var1), this.y(var1)).N(this.y);
   }

   public void Z(class01990 var1, class07310 var2, class07310 var3) {
      this.N(var1, var2, var3, 1);
   }

   public void Z(class07310 var1, class07310 var2) {
      this.N(class01990.field_40635, var1).N('#', var2).N('|', class06570.Tx).N("###").N("###").N(" | ").y("banner").y(L(var2), this.y(var2)).N(this.y);
   }

   public static String i(class07310 var0) {
      return u(var0);
   }

   public final class06870 i(class01990 var1, class07310 var2, class06510 var3) {
      return this.N(var1, var2, 4).N('#', var3).N("##").N("##");
   }

   public void i(class01990 var1, class07310 var2, class07310 var3) {
      this.u(var1, var2, class06510.method_8101(var3)).y(L(var3), this.y(var3)).N(this.y);
   }

   public void i(class07310 var1, class07310 var2) {
      this.N(class01990.field_40635, var1, 6).N('#', var2).N("###").N("   ").N("###").y("shelf").y(L(var2), this.y(var2)).N(this.y);
   }

   public class05544 i(class07310 var1, class06510 var2) {
      return this.N(class01990.field_40634, var1, 4).N('#', var2).N("#  ").N("## ").N("###");
   }

   public void b(class07310 var1, class07310 var2) {
      this.N(class01990.field_40642, var1, 2).N('#', class06570.TN).N('C', var2).N('S', var1).N("#S#").N("#C#").N("###").y(L(var1), this.y(var1)).N(this.y);
   }

   public void s(class07310 var1, class07310 var2) {
      this.y(class01990.field_40635, var1).N(class00869.Te).N(var2).y("dyed_candle").y(L(var2), this.y(var2)).N(this.y);
   }

   public void m(class07310 var1, class07310 var2) {
      this.N(class01990.field_40634, var1, 8)
         .N('#', class00869.zj)
         .N('X', var2)
         .N("###")
         .N("#X#")
         .N("###")
         .y("stained_terracotta")
         .y("has_terracotta", this.y(class00869.zj))
         .N(this.y);
   }

   public static String j(class07310 var0, class07310 var1) {
      return u(var0) + "_from_" + u(var1);
   }

   public void U(class07310 var1, class07310 var2) {
      this.N(class01990.field_40639, var1)
         .N('#', var2)
         .N('G', class06570.Lc)
         .N('L', class06570.js)
         .N("LLL")
         .N("G#G")
         .y("harness")
         .y("has_dried_ghast", this.y(class00869.mu))
         .N(this.y);
   }

   public void z(class07310 var1, class07310 var2) {
      this.N(class01990.field_40634, var1, 8)
         .N('#', class00869.ND)
         .N('X', var2)
         .N("###")
         .N("#X#")
         .N("###")
         .y("stained_glass")
         .y("has_glass", this.y(class00869.ND))
         .N(this.y);
   }

   public void u(class07310 var1, class07310 var2) {
      this.N(class01990.field_40636, var1, class06510.method_8101(var2)).y(L(var2), this.y(var2)).N(this.y);
   }

   public void u(class01990 var1, class07310 var2, class07310 var3) {
      this.L(var1, var2, class06510.method_8101(var3)).y(L(var3), this.y(var3)).N(this.y);
   }

   public final class05544 u(class01990 var1, class07310 var2, class06510 var3) {
      return this.N(var1, var2, 4).N('S', var3).N("SS").N("SS");
   }

   public final class05544 u(class07310 var1, class06510 var2) {
      return this.N(class01990.field_40636, var1).N('#', class06570.Tx).N('W', var2).N("#W#").N("#W#");
   }

   public static String u(class07310 var0) {
      return class04206.B.y(var0.B()).N();
   }

   public void y(class03767 var1) {
      class02859.N.get().forEach((var2, var3) -> {
         if (var3.method_45322().N(var1)) {
            Pair<class01990, String> pair = (Pair<class01990, String>)class02859.L.getOrDefault(var3, Pair.of(class01990.field_40634, u(var3)));
            class01990 class01990 = (class01990)pair.getFirst();
            String s = (String)pair.getSecond();
            this.y(class01990, var3).N(var2).N(class06570.wR).y(s).y(L(var2), this.y(var2)).N(this.y, j(var3, class06570.wR));
         }
      });
   }

   public void y(class01990 var1, class07310 var2, class01990 var3, class07310 var4, String var5, String var6) {
      this.N(var1, var2, var3, var4, i(var4), null, var5, var6);
   }

   public class06915<class00843> y(class07310 var1) {
      return N(class00837.N().N(this.L, var1));
   }

   public class06510 y(class03530<class06581> var1) {
      return class06510.method_8106(this.L.y(var1));
   }

   public void y(List<class07310> var1, class01990 var2, class07310 var3, float var4, int var5, String var6) {
      this.N(class06514.T, class05641::new, var1, var2, var3, var4, var5, var6, "_from_blasting");
   }

   public class06895 y(class01990 var1, class07310 var2) {
      return class06895.N(this.L, var1, var2);
   }

   public void y(class00891 var1, class00891 var2) {
      this.N(class01990.field_40636, var1, 4)
         .N('C', var2)
         .N('R', class06570.WY)
         .N('B', class06570.nU)
         .N(" C ")
         .N("CBC")
         .N(" R ")
         .y(L(var2), this.y(var2))
         .y(u(var1))
         .N(this.y);
   }

   public class06895 y(class01990 var1, class07310 var2, int var3) {
      return class06895.N(this.L, var1, var2, var3);
   }

   public void y(class07310 var1, class03530<class06581> var2, int var3) {
      this.y(class01990.field_40634, var1, var3).N(var2).y("planks").y("has_logs", this.N(var2)).N(this.y);
   }

   public class05544 y(class07310 var1, class06510 var2) {
      return this.N(class01990.field_40636, var1, 3).N('#', var2).N("##").N("##").N("##");
   }

   public void y(class01990 var1, class07310 var2, class07310 var3) {
      this.N(var1, var2, var3, L(var3));
   }

   public class05544 y(class01990 var1, class07310 var2, class06510 var3) {
      return this.N(var1, var2, 6).N('#', var3).N("###");
   }

   public void y(class07310 var1, class07310 var2) {
      this.N(class01990.field_40637, var1).N('#', var2).N("# #").N("###").y("boat").y("in_water", N(class00869.K)).N(this.y);
   }

   public void E(class07310 var1, class07310 var2) {
      this.N(class01990.field_40635, var1, 16).N('#', var2).N("###").N("###").y("stained_glass_pane").y("has_glass", this.y(var2)).N(this.y);
   }

   public void N(class07310 var1, class07310 var2, @Nullable String var3) {
      this.N(var1, var2, var3, 1);
   }

   public void N(class07310 var1, class03530<class06581> var2, int var3) {
      this.y(class01990.field_40634, var1, var3).N(var2).y("planks").y("has_log", this.N(var2)).N(this.y);
   }

   public void N(class07310 var1, class07310 var2, @Nullable String var3, int var4) {
      this.y(class01990.field_40642, var1, var4).N(var2).y(var3).y(L(var2), this.y(var2)).N(this.y, j(var1, var2));
   }

   public void N(List<class06581> var1, List<class06581> var2, @Nullable class06581 var3, String var4, class01990 var5) {
      for (int i = 0; i < var1.size(); i++) {
         class06581 class06581x = (class06581)var1.get(i);
         class06581 class06581x = (class06581)var2.get(i);
         Stream stream = var2.stream().filter(var1x -> !var1x.equals(class06581));
         if (var3 != null) {
            stream = Stream.concat(stream, Stream.of(var3));
         }

         this.y(var5, class06581x)
            .N(class06581x)
            .N(class06510.method_26964(stream))
            .y(var4)
            .y("has_needed_dye", this.y(class06581x))
            .N(this.y, "dye_" + u(class06581x));
      }
   }

   public class06870 N(class01990 var1, class07310 var2) {
      return class06870.N(this.L, var1, var2);
   }

   public class06870 N(class01990 var1, class07310 var2, int var3) {
      return class06870.N(this.L, var1, var2, var3);
   }

   public class06895 N(class01990 var1, class06584 var2) {
      return class06895.N(this.L, var1, var2);
   }

   public void N(List<class06581> var1, List<class06581> var2, String var3, class01990 var4) {
      this.N(var1, var2, null, var3, var4);
   }

   public void N(class01990 var1, class07310 var2, class01990 var3, class07310 var4) {
      this.N(var1, var2, var3, var4, i(var4), null, i(var2), null);
   }

   public void N(class03767 var1) {
      class05577.N().filter(class05547::u).forEach(var2 -> this.N(var2, var1));
   }

   public final class05544 N(class01990 var1, class07310 var2, class06510 var3) {
      return this.N(var1, var2).N('#', var3).N("##");
   }

   public void N(class07310 var1, class07310 var2) {
      this.N(class01990.field_40634, var1, 3).N('#', var2).N("##").N("##").y("bark").y("has_log", this.y(var2)).N(this.y);
   }

   public final class05544 N(class07310 var1, class06510 var2) {
      return this.y(class01990.field_40636, var1).N(var2);
   }

   public abstract void N();

   public final <T extends class07313> void N(String var1, class06514<T> var2, class07293<T> var3, int var4, class07310 var5, class07310 var6, float var7) {
      class06886.N(class06510.method_8101(var5), class01990.field_40640, var6, var7, var4, var2, var3)
         .y(L(var5), this.y(var5))
         .N(this.y, u(var6) + "_from_" + var1);
   }

   public void N(class00891 var1, class00891 var2) {
      this.N(class01990.field_40634, var1, 4).N('M', var2).N(" M ").N("M M").N(" M ").y(u(var1)).y(L(var2), this.y(var2)).N(this.y);
   }

   public void N(class01990 var1, class07310 var2, class07310 var3) {
      this.N(var1, var2, 1).N('#', var3).N("##").N("##").y(L(var3), this.y(var3)).N(this.y);
   }

   public void N(class01990 var1, class07310 var2, class07310 var3, String var4) {
      this.y(var1, var2).N(var3, 9).y(var4, this.y(var3)).N(this.y);
   }

   public void N(class06581 var1, class01990 var2, class06581 var3) {
      class03279.N(class06510.method_8101(class06570.ky), class06510.method_8101(var1), this.y(class01226.yY), var2, var3)
         .N("has_netherite_ingot", this.N(class01226.yY))
         .N(this.y, u(var3) + "_smithing");
   }

   public void N(class05547 var1, class03767 var2) {
      var1.y().forEach((var3, var4) -> {
         if (var4.method_45322().N(var2)) {
            class06891 class06891 = u.get(var3);
            class00891 class00891 = this.N(var1, var3);
            if (class06891 != null) {
               class05544 class05544 = class06891.create(this, var4, class00891);
               var1.i().ifPresent(var2xx -> class05544.y(var2xx + (var3 == class05565.field_33689 ? "" : "_" + var3.N())));
               class05544.y(var1.R().orElseGet(() -> L(class00891)), this.y(class00891));
               class05544.N(this.y);
            }

            if (var3 == class05565.field_29503) {
               this.T(var4, class00891);
            }
         }
      });
   }

   public final <T extends class07313> void N(
      class06514<T> var1, class07293<T> var2, List<class07310> var3, class01990 var4, class07310 var5, float var6, int var7, String var8, String var9
   ) {
      for (class07310 class07310 : var3) {
         class06886.N(class06510.method_8101(class07310), var4, var5, var6, var7, var1, var2)
            .y(var8)
            .y(L(class07310), this.y(class07310))
            .N(this.y, u(var5) + var9 + "_" + u(class07310));
      }
   }

   public void N(class01990 var1, class07310 var2, class01990 var3, class07310 var4, String var5, String var6) {
      this.N(var1, var2, var3, var4, var5, var6, i(var2), null);
   }

   public void N(class01990 var1, class07310 var2, class07310 var3, int var4) {
      class06161.N(class06510.method_8101(var3), var1, var2, var4).y(L(var3), this.y(var3)).N(this.y, j(var2, var3) + "_stonecutting");
   }

   public final void N(
      class01990 var1, class07310 var2, class01990 var3, class07310 var4, String var5, @Nullable String var6, String var7, @Nullable String var8
   ) {
      this.y(var1, var2, 9).N(var4).y(var8).y(L(var4), this.y(var4)).N(this.y, class05946.N(class04227.yV, class01894.N(var7)));
      this.N(var3, var4).N('#', var2).N("###").N("###").N("###").y(var6).y(L(var2), this.y(var2)).N(this.y, class05946.N(class04227.yV, class01894.N(var5)));
   }

   public void N(class06581 var1, class05946<class03246> var2, class05946<class06521<?>> var3) {
      class03529 class03529 = this.N.y(class04227.yk).y(var2);
      class03243.N(class06510.method_8101(var1), this.y(class01226.yx), this.y(class01226.yD), class03529, class01990.field_40642)
         .N("has_smithing_trim_template", this.y(var1))
         .N(this.y, var3);
   }

   public <T extends class07313> void N(String var1, class06514<T> var2, class07293<T> var3, int var4) {
      this.N(var1, var2, var3, var4, class06570.ni, class06570.nR, 0.35F);
      this.N(var1, var2, var3, var4, class06570.nM, class06570.nB, 0.35F);
      this.N(var1, var2, var3, var4, class06570.vu, class06570.vB, 0.35F);
      this.N(var1, var2, var3, var4, class06570.uD, class06570.ny, 0.1F);
      this.N(var1, var2, var3, var4, class06570.vi, class06570.vZ, 0.35F);
      this.N(var1, var2, var3, var4, class06570.lL, class06570.lu, 0.35F);
      this.N(var1, var2, var3, var4, class06570.bo, class06570.bq, 0.35F);
      this.N(var1, var2, var3, var4, class06570.Gj, class06570.Gv, 0.35F);
      this.N(var1, var2, var3, var4, class06570.Gc, class06570.GX, 0.35F);
   }

   public void N(class06581 var1, class04107 var2) {
      class06584 class06584 = new class06584(class06570.dk.i(), 1, class02678.N().N(class02484.NN, var2.L()).N());
      this.N(class01990.field_40640, class06584)
         .N(class06570.sC)
         .N(class06570.uc)
         .N(class06570.uX)
         .N(var1)
         .y("suspicious_stew")
         .y(L(var1), this.y(var1))
         .N(this.y, u(class06584.B()) + "_from_" + u(var1));
   }

   public void N(class07310 var1) {
      this.N(class01990.field_40634, var1, 1)
         .N('#', class06570.nE)
         .N('X', class06570.Rx)
         .N("###")
         .N("#X#")
         .N("###")
         .y("dry_ghast")
         .y(L(class06570.nE), this.y(class06570.nE))
         .N(this.y);
   }

   public void N(List<class07310> var1, class01990 var2, class07310 var3, float var4, int var5, String var6) {
      this.N(class06514.s, class05654::new, var1, var2, var3, var4, var5, var6, "_from_smelting");
   }

   public static class06915<class00843> N(class00837... var0) {
      return N(Arrays.stream(var0).map(class00837::y).toArray(class00845[]::new));
   }

   public static class06915<class00843> N(class00845... var0) {
      return class06912.R.N(new class00843(Optional.empty(), class00855.y, List.of(var0)));
   }

   public final class00891 N(class05547 var1, class05565 var2) {
      if (var2 == class05565.field_28534) {
         if (!var1.y().containsKey(class05565.field_28539)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return var1.N(class05565.field_28539);
         }
      } else {
         return var1.N();
      }
   }

   public class06915<class00843> N(class03530<class06581> var1) {
      return N(class00837.N().N(this.L, var1));
   }

   public static class06915<class00858> N(class00891 var0) {
      return class06912.i.N(new class00858(Optional.empty(), Optional.of(var0.s()), Optional.empty()));
   }

   public final class06915<class00843> N(class00836 var1, class07310 var2) {
      return N(class00837.N().N(this.L, var2).N(var1));
   }

   public void W(class07310 var1, class07310 var2) {
      this.N(class01990.field_40635, var1, 8)
         .N('#', class00869.RJ)
         .N('$', var2)
         .N("###")
         .N("#$#")
         .N("###")
         .y("stained_glass_pane")
         .y("has_glass_pane", this.y(class00869.RJ))
         .y(L(var2), this.y(var2))
         .N(this.y, j(var1, class00869.RJ));
   }

   public static String R(class07310 var0) {
      return u(var0) + "_from_smelting";
   }

   public class05544 R(class07310 var1, class06510 var2) {
      return this.N(class01990.field_40636, var1, 2).N('#', var2).N("###").N("###");
   }

   public void R(class01990 var1, class07310 var2, class07310 var3) {
      this.i(var1, var2, class06510.method_8101(var3)).y(L(var3), this.y(var3)).N(this.y);
   }

   public void R(class07310 var1, class07310 var2) {
      this.N(class01990.field_40635, var1, 6)
         .y("hanging_sign")
         .N('#', var2)
         .N('X', class06570.MQ)
         .N("X X")
         .N("###")
         .N("###")
         .y("has_stripped_logs", this.y(var2))
         .N(this.y);
   }

   public class06870 R(class01990 var1, class07310 var2, class06510 var3) {
      return this.N(var1, var2).N('#', var3).N("#").N("#");
   }
}
