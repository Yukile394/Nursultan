package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.access.block.shape.ICrossCollisionBlock;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class class06788 extends class00891 implements class06084, ICrossCollisionBlock {
   public static final class06667 y = class06901.y;
   public static final class06667 L = class06901.L;
   public static final class06667 u = class06901.u;
   public static final class06667 i = class06901.i;
   public static final class06667 R = class06665.q;
   public static final Map<class07211, class06667> M = class06901.B.entrySet().stream().filter(var0 -> var0.getKey().z().L()).collect(class07536.N());
   private final Function<class00500, class00494> N;
   private final Function<class00500, class00494> B;
   private final Object2IntMap Z = new Object2IntOpenHashMap();

   public class06788(float var1, float var2, float var3, float var4, float var5, class01362 var6) {
      super(var6);
      this.N = this.N(var1, var5, var3, 0.0F, var5);
      this.B = this.N(var1, var2, var3, 0.0F, var4);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(R) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected boolean y(class00500 var1) {
      return !var1.L(R);
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.N.apply(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      switch (var2) {
         case field_11300:
            return var1.y(y, var1.L(u)).y(u, var1.L(y));
         case field_11301:
            return var1.y(L, var1.L(i)).y(i, var1.L(L));
         default:
            return super.N(var1, var2);
      }
   }

   @Override
   protected abstract MapCodec<? extends class06788> N();

   protected Function<class00500, class00494> N(float var1, float var2, float var3, float var4, float var5) {
      class00494 class00494 = class00891.y(var1, 0.0, var2);
      Map<class07211, class00494> map = class00389.L(class00891.N(var3, var4, var5, 0.0, 8.0));
      return this.N(var2x -> {
         class00494 class00494x = class00494;

         for (Entry entry : M.entrySet()) {
            if (var2x.<Boolean>L((class08092<Boolean>)entry.getValue())) {
               class00494x = class00389.N(class00494x, map.get(entry.getKey()));
            }
         }

         return class00494x;
      }, new class08092[]{R});
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.B.apply(var1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      switch (var2) {
         case field_11464:
            return var1.y(y, var1.L(u)).y(L, var1.L(i)).y(u, var1.L(y)).y(i, var1.L(L));
         case field_11465:
            return var1.y(y, var1.L(L)).y(L, var1.L(u)).y(u, var1.L(i)).y(i, var1.L(y));
         case field_11463:
            return var1.y(y, var1.L(i)).y(L, var1.L(y)).y(u, var1.L(L)).y(i, var1.L(u));
         default:
            return var1;
      }
   }

   public int viaFabricPlus$getShapeIndex(class00500 var1) {
      return this.Z.computeIfAbsent(var1, var1x -> {
         int ix = 0;
         if (var1.L(y)) {
            ix |= 1 << class07211.field_11043.u();
         }

         if (var1.L(L)) {
            ix |= 1 << class07211.field_11034.u();
         }

         if (var1.L(u)) {
            ix |= 1 << class07211.field_11035.u();
         }

         if (var1.L(i)) {
            ix |= 1 << class07211.field_11039.u();
         }

         return ix;
      });
   }
}
