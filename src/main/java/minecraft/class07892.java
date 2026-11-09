package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public enum class07892 implements class02694, class05033 {
   field_6881("kob", class07865.field_41574, 0),
   field_6880("sunstreak", class07865.field_41574, 1),
   field_6882("snooper", class07865.field_41574, 2),
   field_6890("dasher", class07865.field_41574, 3),
   field_6891("brinely", class07865.field_41574, 4),
   field_6892("spotty", class07865.field_41574, 5),
   field_6893("flopper", class07865.field_41575, 0),
   field_6887("stripey", class07865.field_41575, 1),
   field_6883("glitter", class07865.field_41575, 2),
   field_6884("blockfish", class07865.field_41575, 3),
   field_6888("betty", class07865.field_41575, 4),
   field_6889("clayfish", class07865.field_41575, 5);

   public static final Codec<class07892> field_41578 = class05033.N(class07892::values);
   private static final IntFunction<class07892> field_41579 = class02121.N(class07892::y, values(), field_6881);
   public static final class02362<ByteBuf, class07892> field_55969 = class02389.N(field_41579, class07892::y);
   private final String field_41580;
   private final class00392 field_41581;
   private final class07865 field_41582;
   private final int field_41583;

   public class00392 L() {
      return this.field_41581;
   }

   private class07892(String var3, class07865 var4, int var5) {
      this.field_41580 = var3;
      this.field_41582 = var4;
      this.field_41583 = var4.field_41576 | var5 << 8;
      this.field_41581 = class00392.L("entity.minecraft.tropical_fish.type." + this.field_41580);
   }

   public int y() {
      return this.field_41583;
   }

   public class07865 N() {
      return this.field_41582;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      class06563 class06563x = var4.a_(class02484.NV, class07899.N.L());
      class06563 class06563x = var4.a_(class02484.Ne, class07899.N.u());
      class06541[] aclass06541 = new class06541[]{class06541.field_1056, class06541.field_1080};
      int i = class07899.y.indexOf(new class07890(this, class06563x, class06563x));
      if (i != -1) {
         var2.accept(class00392.L(class07899.N(i)).N(aclass06541));
      } else {
         var2.accept(this.field_41581.y().N(aclass06541));
         class05216 class05216 = class00392.L("color.minecraft." + class06563x.y());
         if (class06563x != class06563x) {
            class05216.i(", ").y(class00392.L("color.minecraft." + class06563x.y()));
         }

         class05216.N(aclass06541);
         var2.accept(class05216);
      }
   }

   public static class07892 N(int var0) {
      return field_41579.apply(var0);
   }

   @Override
   public String method_15434() {
      return this.field_41580;
   }
}
