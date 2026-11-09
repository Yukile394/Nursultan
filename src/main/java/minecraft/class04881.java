package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class class04881 extends class05248 {
   public static final MapCodec<class04881> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05248.i.listOf().fieldOf("elements").forGetter(var0x -> var0x.y), R()).apply(var0, class04881::new)
   );
   private final List<class05248> y;

   public class04881(List<class05248> var1, class05246 var2) {
      super(var2);
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.y = var1;
         this.y(var2);
      }
   }

   @Override
   public String toString() {
      return "List[" + this.y.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   public List<class05248> y() {
      return this.y;
   }

   private void y(class05246 var1) {
      this.y.forEach(var1x -> var1x.N(var1));
   }

   @Override
   public class00753 N(class01224 var1, class06993 var2) {
      int i = 0;
      int j = 0;
      int k = 0;
      Iterator iterator = this.y.iterator();

      while (iterator.hasNext()) {
         class00753 class00753 = ((class05248)iterator.next()).N(var1, var2);
         i = Math.max(i, class00753.method_10263());
         j = Math.max(j, class00753.method_10264());
         k = Math.max(k, class00753.method_10260());
      }

      return new class00753(i, j, k);
   }

   @Override
   public class05163 N(class01224 var1, class07209 var2, class06993 var3) {
      return class05163.y(this.y.stream().filter(var0 -> var0 != class04869.y).map(var3x -> var3x.N(var1, var2, var3))::iterator)
         .orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean N(
      class01224 var1,
      class05974 var2,
      class05324 var3,
      class08088 var4,
      class07209 var5,
      class07209 var6,
      class06993 var7,
      class05163 var8,
      class06069 var9,
      class02610 var10,
      boolean var11
   ) {
      Iterator iterator = this.y.iterator();

      while (iterator.hasNext()) {
         if (!((class05248)iterator.next()).N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public class05267<?> N() {
      return class05267.y;
   }

   @Override
   public class05248 N(class05246 var1) {
      super.N(var1);
      this.y(var1);
      return this;
   }

   @Override
   public List<class01203> N(class01224 var1, class07209 var2, class06993 var3, class06069 var4) {
      return this.y.get(0).N(var1, var2, var3, var4);
   }
}
