package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class07793 {
   private final String y;
   private final Object2IntMap<class07773> L;
   private final class07773[] u;
   public static final Codec<class07793> N = Codec.STRING.comapFlatMap(var0 -> {
      try {
         class07793 class07793 = new class07759().parse(new StringReader(var0));
         return DataResult.success(class07793);
      } catch (CommandSyntaxException commandsyntaxexception) {
         return DataResult.error(() -> "Failed to parse path " + var0 + ": " + commandsyntaxexception.getMessage());
      }
   }, class07793::a);

   public int L(class07709 var1) {
      List<class07709> list = Collections.singletonList(var1);

      for (int i = 0; i < this.u.length - 1; i++) {
         list = this.u[i].N(list);
      }

      class07773 class07773 = this.u[this.u.length - 1];
      return N(list, class07773::N);
   }

   public class07793(String var1, class07773[] var2, Object2IntMap<class07773> var3) {
      super();
      this.y = var1;
      this.u = var2;
      this.L = var3;
   }

   @Override
   public String toString() {
      return this.y;
   }

   private List<class07709> u(class07709 var1) throws CommandSyntaxException {
      List<class07709> list = Collections.singletonList(var1);

      for (int i = 0; i < this.u.length - 1; i++) {
         class07773 class07773 = this.u[i];
         int j = i + 1;
         list = class07773.N_84(list, this.u[j]::N);
         if (list.isEmpty()) {
            throw this.N(class07773);
         }
      }

      return list;
   }

   private int y() {
      return this.u.length;
   }

   public int y(class07709 var1) {
      List<class07709> list = Collections.singletonList(var1);
      class07773[] aclass07773 = this.u;
      int i = aclass07773.length;

      for (int j = 0; j < i; j++) {
         list = aclass07773[j].N(list);
         if (list.isEmpty()) {
            return 0;
         }
      }

      return list.size();
   }

   public static class07793 N(String var0) throws CommandSyntaxException {
      return new class07759().parse(new StringReader(var0));
   }

   public String N() {
      return this.y;
   }

   public static boolean N(class07709 var0, int var1) {
      if (var1 >= 512) {
         return true;
      } else {
         if (var0 instanceof class07001) {
            for (class07709 class07709x : ((class07001)var0).B()) {
               if (N(class07709x, var1 + 1)) {
                  return true;
               }
            }
         } else if (var0 instanceof class07741) {
            for (class07709 class07709x : (class07741)var0) {
               if (N(class07709x, var1 + 1)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static int N(List<class07709> var0, Function<class07709, Integer> var1) {
      return var0.stream().<Integer>map(var1).reduce(0, (var0x, var1x) -> var0x + var1x);
   }

   public List<class07709> N(class07709 var1, Supplier<class07709> var2) throws CommandSyntaxException {
      List<class07709> list = this.u(var1);
      return this.u[this.u.length - 1].N_84(list, var2);
   }

   public List<class07709> N(class07709 var1) throws CommandSyntaxException {
      List<class07709> list = Collections.singletonList(var1);

      for (class07773 class07773 : this.u) {
         list = class07773.N(list);
         if (list.isEmpty()) {
            throw this.N(class07773);
         }
      }

      return list;
   }

   public int N(class07709 var1, class07709 var2) throws CommandSyntaxException {
      if (N(var2, this.y())) {
         throw class07759.y.create();
      } else {
         class07709 class07709 = var2.N();
         List<class07709> list = this.u(var1);
         if (list.isEmpty()) {
            return 0;
         } else {
            class07773 class07773 = this.u[this.u.length - 1];
            MutableBoolean mutableboolean = new MutableBoolean(false);
            return N(list, var3x -> class07773.N(var3x, () -> {
               if (mutableboolean.isFalse()) {
                  mutableboolean.setTrue();
                  return class07709;
               } else {
                  return class07709.N();
               }
            }));
         }
      }
   }

   public int N(int var1, class07001 var2, List<class07709> var3) throws CommandSyntaxException {
      ArrayList arraylist = new ArrayList(var3.size());

      for (class07709 class07709xxx : var3) {
         class07709 class07709x = class07709xxx.N();
         arraylist.add(class07709x);
         if (N(class07709x, this.y())) {
            throw class07759.y.create();
         }
      }

      List<class07709> list = this.N(var2, class07741::new);
      int j = 0;
      boolean flag1 = false;

      for (class07709 class07709x : list) {
         if (!(class07709x instanceof class07023 class07023)) {
            throw class07759.u.create(class07709x);
         }

         boolean flag = false;
         int i = var1 < 0 ? class07023.size() + var1 + 1 : var1;

         for (class07709 class07709xx : arraylist) {
            try {
               if (class07023.y(i, flag1 ? class07709xx.N() : class07709xx)) {
                  i++;
                  flag = true;
               }
            } catch (IndexOutOfBoundsException indexoutofboundsexception) {
               throw class07759.i.create(i);
            }
         }

         flag1 = true;
         j += flag ? 1 : 0;
      }

      return j;
   }

   private CommandSyntaxException N(class07773 var1) {
      int i = this.L.getInt(var1);
      return class07759.L.create(this.y.substring(0, i));
   }

   public String a() {
      return this.y;
   }
}
