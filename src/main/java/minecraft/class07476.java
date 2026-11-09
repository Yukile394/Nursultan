package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public abstract class class07476 extends class06923 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 2;
   public static final int u = 3;
   public static final int i = 4;
   private static final int v = 3;
   private static final int n = 30;
   private static final int t = 30;
   private static final int G = 39;
   final class06695 R;
   private final class05845 l;
   protected final class07299 j;
   private final class05838<? extends class07313> d;
   private final class00263 w;
   private final class01015 k;

   protected boolean L(class06584 var1) {
      return this.j.method_61269().N(var1);
   }

   @Override
   public class01015 P() {
      return this.k;
   }

   protected class07476(class05851<?> var1, class05838<? extends class07313> var2, class05946<class00263> var3, class01015 var4, int var5, class08044 var6) {
      this(var1, var2, var3, var4, var5, var6, new class07075(3), new class05853(4));
   }

   protected class07476(
      class05851<?> var1,
      class05838<? extends class07313> var2,
      class05946<class00263> var3,
      class01015 var4,
      int var5,
      class08044 var6,
      class06695 var7,
      class05845 var8
   ) {
      super(var1, var5);
      this.d = var2;
      this.k = var4;
      N(var7, 3);
      N(var8, 4);
      this.R = var7;
      this.l = var8;
      this.j = var6.z.method_73183();
      this.w = this.j.method_8433().N(var3);
      this.N(new class06937(var7, 0, 56, 17));
      this.N(new class07483(this, var7, 1, 56, 53));
      this.N(new class07481(var6.z, var7, 2, 116, 35));
      this.L(var6, 8, 84);
      this.N(var8);
   }

   public boolean s() {
      return this.l.N(0) > 0;
   }

   public float m() {
      int ix = this.l.N(1);
      if (ix == 0) {
         ix = 200;
      }

      return class04995.N((float)this.l.N(0) / ix, 0.0F, 1.0F);
   }

   private boolean y(class07476 var1, class06584 var2) {
      return this.L(var2) && ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_2_1tor1_2_3);
   }

   protected boolean y(class06584 var1) {
      return this.w.N(var1);
   }

   public class06937 E() {
      return this.T.get(2);
   }

   @Override
   public void N(class02741 var1) {
      if (this.R instanceof class06941) {
         ((class06941)this.R).N(var1);
      }
   }

   private boolean N(class07476 var1, class06584 var2) {
      return this.y(var2) && ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_2_1tor1_2_3);
   }

   @Override
   public class06910 N(boolean var1, boolean var2, class03729<?> var3, class04782 var4, class08044 var5) {
      List list = List.of(this.L(0), this.L(2));
      return class04393.N(new class07503(this, list, var4), 1, 1, List.of(this.L(0)), list, var5, var3, var1, var2);
   }

   @Override
   public boolean N(class08036 var1) {
      return this.R.method_5443(var1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 == 2) {
            if (!this.N(class06584x, 3, 39, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (var2 != 1 && var2 != 0) {
            if (this.N(this, class06584x)) {
               if (!this.N(class06584x, 0, 1, false)) {
                  return class06584.E;
               }
            } else if (this.y(this, class06584x)) {
               if (!this.N(class06584x, 1, 2, false)) {
                  return class06584.E;
               }
            } else if (var2 >= 3 && var2 < 30) {
               if (!this.N(class06584x, 30, 39, false)) {
                  return class06584.E;
               }
            } else if (var2 >= 30 && var2 < 39 && !this.N(class06584x, 3, 30, false)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 3, 39, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584x;
   }

   public float W() {
      int ix = this.l.N(2);
      int jx = this.l.N(3);
      return jx != 0 && ix != 0 ? class04995.N((float)ix / jx, 0.0F, 1.0F) : 0.0F;
   }
}
