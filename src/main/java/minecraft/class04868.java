package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class class04868 extends class06555 {
   private static final String u = "raids";
   public static final Codec<class04868> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04885.L.listOf().optionalFieldOf("raids", List.of()).forGetter(var0x -> var0x.i.int2ObjectEntrySet().stream().map(class04885::N).toList()),
            Codec.INT.fieldOf("next_id").forGetter(var0x -> var0x.R),
            Codec.INT.fieldOf("tick").forGetter(var0x -> var0x.M)
         )
         .apply(var0, class04868::new)
   );
   public static final class08413<class04868> y = new class08413<>("raids", class04868::new, N, class05715.field_45081);
   public static final class08413<class04868> L = new class08413<>("raids_end", class04868::new, N, class05715.field_45081);
   private final Int2ObjectMap<class04877> i = new Int2ObjectOpenHashMap();
   private int R = 1;
   private int M;

   private class04868(List<class04885> var1, int var2, int var3) {
      super();

      for (class04885 class04885 : var1) {
         this.i.put(class04885.N(), class04885.y());
      }

      this.R = var2;
      this.M = var3;
   }

   public class04868() {
      super();
      this.method_80();
   }

   @Nullable
   public class04877 N(class07209 var1, int var2) {
      class04877 class04877x = null;
      double d0 = var2;
      ObjectIterator<class04877> objectiterator = this.i.values().iterator();

      while (objectiterator.hasNext()) {
         class04877 class04877x = (class04877)objectiterator.next();
         double d1 = class04877x.s().method_10262(var1);
         if (class04877x.T() && d1 < d0) {
            class04877x = class04877x;
            d0 = d1;
         }
      }

      return class04877x;
   }

   public List<class07209> N(class07321 var1) {
      return this.i.values().stream().map(class04877::s).filter(var1::y).toList();
   }

   public static class08413<class04868> N(class03556<class07376> var0) {
      return var0.N(class04057.L) ? L : y;
   }

   public static boolean N(class04882 var0) {
      return var0.method_5805() && var0.q() && var0.method_6131() <= 2400;
   }

   public void N(class04782 var1) {
      this.M++;
      ObjectIterator<class04877> objectiterator = this.i.values().iterator();

      while (objectiterator.hasNext()) {
         class04877 class04877 = (class04877)objectiterator.next();
         if (!var1.method_64395().N(class07305.c)) {
            class04877.W();
         }

         if (class04877.u()) {
            objectiterator.remove();
            this.method_80();
         } else {
            class04877.N(var1);
         }
      }

      if (this.M % 200 == 0) {
         this.method_80();
      }
   }

   public OptionalInt N(class04877 var1) {
      ObjectIterator<Entry<class04877>> objectiterator = this.i.int2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         if (entry.getValue() == var1) {
            return OptionalInt.of(entry.getIntKey());
         }
      }

      return OptionalInt.empty();
   }

   @Nullable
   public class04877 N(int var1) {
      return (class04877)this.i.get(var1);
   }

   private int N() {
      return ++this.R;
   }

   public static class04868 N(class07001 var0) {
      return N.parse(class07713.N, var0).resultOrPartial().orElseGet(class04868::new);
   }

   private class04877 N(class04782 var1, class07209 var2) {
      class04877 class04877 = var1.method_19502(var2);
      return class04877 != null ? class04877 : new class04877(var2, var1.y());
   }

   @Nullable
   public class04877 N(class04770 var1, class07209 var2) {
      if (var1.method_7325()) {
         return null;
      } else {
         class04782 class04782 = var1.method_51469();
         if (!class04782.method_64395().N(class07305.c)) {
            return null;
         } else if (!class04782.method_75728().N(class00608.k, var2)) {
            return null;
         } else {
            List list = class04782.method_19494().i(var0 -> var0.N(class03949.y), var2, 64, class05372.field_18488).toList();
            int ix = 0;
            class06889 class06889 = class06889.L;

            for (class05377 class05377 : list) {
               class07209 class07209x = class05377.M();
               class06889 = class06889.y(class07209x.method_10263(), class07209x.method_10264(), class07209x.method_10260());
               ix++;
            }

            class07209 class07209;
            if (ix > 0) {
               class06889 = class06889.L(1.0 / ix);
               class07209 = class07209.method_49638(class06889);
            } else {
               class07209 = var2;
            }

            class04877 class04877 = this.N(class04782, class07209);
            if (!class04877.Z() && !this.i.containsValue(class04877)) {
               this.i.put(this.N(), class04877);
            }

            if (!class04877.Z() || class04877.E() < class04877.U()) {
               class04877.N(var1);
            }

            this.method_80();
            return class04877;
         }
      }
   }
}
