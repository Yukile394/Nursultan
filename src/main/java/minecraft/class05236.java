package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Locale;

public class class05236 extends class04890 {
   protected final class05248 N;
   protected class07209 y;
   private final int u;
   protected final class06993 L;
   private final List<class04844> i = Lists.newArrayList();
   private final class01224 R;
   private final class02610 M;

   public class05236(class01224 var1, class05248 var2, class07209 var3, int var4, class06993 var5, class05163 var6, class02610 var7) {
      super(class04878.Nu, 0, var6);
      this.R = var1;
      this.N = var2;
      this.y = var3;
      this.u = var4;
      this.L = var5;
      this.M = var7;
   }

   public class05236(class03298 var1, class07001 var2) {
      super(class04878.Nu, var2);
      this.R = var1.L();
      this.y = new class07209(var2.y("PosX", 0), var2.y("PosY", 0), var2.y("PosZ", 0));
      this.u = var2.y("ground_level_delta", 0);
      class03519 class03519 = var1.y().N(class07713.N);
      this.N = var2.<class05248>N("pool_element", class05248.i, class03519).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
      this.L = var2.<class06993>N_15("rotation", class06993.field_56670).orElseThrow();
      this.k = this.N.N(this.R, this.y, this.L);
      class07741 class07741 = var2.s("junctions");
      this.i.clear();
      class07741.forEach(var2x -> this.i.add(class04844.N(new Dynamic(class03519, var2x))));
      this.M = var2.<class02610>N_15("liquid_settings", class02610.field_52239).orElse(class01017.y);
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.y, this.L, this.N);
   }

   public class07209 Z() {
      return this.y;
   }

   public List<class04844> U() {
      return this.i;
   }

   public int z() {
      return this.u;
   }

   public class05248 y() {
      return this.N;
   }

   public void N(class04844 var1) {
      this.i.add(var1);
   }

   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07209 var6, boolean var7) {
      this.N.N(this.R, var1, var2, var3, this.y, var6, this.L, var5, var4, this.M, var7);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var2, var3, var4, var5, var7, false);
   }

   @Override
   public void N(int var1, int var2, int var3) {
      super.N(var1, var2, var3);
      this.y = this.y.method_10069(var1, var2, var3);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      var2.N("PosX", this.y.method_10263());
      var2.N("PosY", this.y.method_10264());
      var2.N("PosZ", this.y.method_10260());
      var2.N("ground_level_delta", this.u);
      class03519 class03519 = var1.y().N(class07713.N);
      var2.N("pool_element", class05248.i, class03519, this.N);
      var2.N("rotation", class06993.field_56670, this.L);
      class07741 class07741 = new class07741();

      for (class04844 class04844 : this.i) {
         class07741.add((class07709)class04844.N(class03519).getValue());
      }

      var2.N("junctions", class07741);
      if (this.M != class01017.y) {
         var2.N("liquid_settings", class02610.field_52239, class03519, this.M);
      }
   }

   @Override
   public class06993 R() {
      return this.L;
   }
}
