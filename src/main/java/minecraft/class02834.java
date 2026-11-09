package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum class02834 implements class05033, Iterable<class07085> {
   field_49216(0, "any", var0 -> true),
   field_49217(1, "mainhand", class07085.field_6173),
   field_49218(2, "offhand", class07085.field_6171),
   field_49219(3, "hand", var0 -> var0.N() == class07043.field_6177),
   field_49220(4, "feet", class07085.field_6166),
   field_49221(5, "legs", class07085.field_6172),
   field_49222(6, "chest", class07085.field_6174),
   field_49223(7, "head", class07085.field_6169),
   field_49224(8, "armor", class07085::i),
   field_50127(9, "body", class07085.field_48824),
   field_55948(10, "saddle", class07085.field_55946);

   public static final IntFunction<class02834> field_49225 = class02121.N(var0 -> var0.field_49228, values(), class02126.field_41664);
   public static final Codec<class02834> field_49226 = class05033.N(class02834::values);
   public static final class02362<ByteBuf, class02834> field_49227 = class02389.N(field_49225, var0 -> var0.field_49228);
   private final int field_49228;
   private final String field_49229;
   private final Predicate<class07085> field_49230;
   private final List<class07085> field_55949;

   private class02834(int var3, String var4, Predicate<class07085> var5) {
      this.field_49228 = var3;
      this.field_49229 = var4;
      this.field_49230 = var5;
      this.field_55949 = class07085.field_54086.stream().filter(var5).toList();
   }

   private class02834(int var3, String var4, class07085 var5) {
      this(var3, var4, var1x -> var1x == var5);
   }

   @Override
   public Iterator<class07085> iterator() {
      return this.field_55949.iterator();
   }

   public boolean y(class07085 var1) {
      return this.field_49230.test(var1);
   }

   public List<class07085> N() {
      return this.field_55949;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class02834 N(class07085 var0) {
      return switch (var0) {
         case field_6173 -> field_49217;
         case field_6171 -> field_49218;
         case field_6166 -> field_49220;
         case field_6172 -> field_49221;
         case field_6174 -> field_49222;
         case field_6169 -> field_49223;
         case field_48824 -> field_50127;
         case field_55946 -> field_55948;
      };
   }

   @Override
   public String method_15434() {
      return this.field_49229;
   }
}
